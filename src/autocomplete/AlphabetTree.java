package com.esudious.autocomplete;

import java.util.ArrayList;

public class AlphabetTree {
	
	AlphabetTree a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
	AlphabetTree parent;
	ArrayList<AlphabetTree> alphList = new ArrayList<>();
	
	
	
	boolean isWordEnd = false;
	public boolean hasChild = false;  //at least 1 child
	public char letter;
	int height;
	String word;
	
	
	AlphabetTree(AlphabetTree par){
		parent = par;
	}
	
	AlphabetTree(){
		//root
		parent = null;
	}
        
	public void add(String str){
            
		if (parent!=null && !str.equals("")) { //as long as this isn't the root...
			letter = str.charAt(0);
			if (str.length()>1){
				newNode(str.substring(1,str.length()));
			}
			if (str.length()==1){
				isWordEnd=true;
			}
		} else if (parent==null && !str.equals("")){
			newNode(str);
		}
	}
        
        public String getLetter(){
            return Character.toString(letter);
        }

	public String getWord(){
		if (word!=null && isWordEnd) return word;
		if (parent!=null && word==null){
			word = parent.getWord()+letter;
			return word;
		} else if (parent!=null && word!=null){
			return word;
		} else {
			return "";
		}
	}
        
        //Takes a string and breaks it down going down the tree
        //until it gets to the ends.  Then returns the words under it.
        public ArrayList<String> getWords(String str){
            
            if (!str.equals("")){
                String ch = str.substring(0,1);
                
                for (AlphabetTree at: alphList){
                    if (at.getLetter().equals(ch)){
                        return at.getWords(str.substring(1,str.length()));
                    }
                }
            } else {
                return getWords();
            }
            return null;
        }
	
	public ArrayList<String> getWords(){
            ArrayList<String> stringList = new ArrayList<>();
            
		if (isWordEnd){
                    stringList.add(getWord());
		}  
		/*for (AlphabetTree at: alphList){
                    if (at!=null && at.isWordEnd){
                        stringList.add(at.getWord());
                    }
		}*/
                if (hasChild){
                    for (AlphabetTree at: alphList){
                        stringList.addAll(at.getWords());
                    }
                }
            return stringList;
	}
	
        //probably the ugliest thing ever coded
	private void newNode(String str){
                hasChild = true;
		char ch = str.charAt(0);
		switch(ch){
		case 'a': 
                        if (a==null){
                            a = new AlphabetTree(this);
                            alphList.add(a);
                        }
                        
			a.add(str);
			break;
		case 'b':
                        if (b==null){
                            b = new AlphabetTree(this);
                            alphList.add(b);
                        }
                        
			b.add(str);
			break;
		case 'c':
                        if (c==null){
                            c = new AlphabetTree(this);
                            alphList.add(c);
                        }
                        
			c.add(str);
			break;
		case 'd':
                        if (d==null){
                            d = new AlphabetTree(this);
                            alphList.add(d);
                        }
			d.add(str);
			break;
		case 'e':
                        if (e==null){
                            e = new AlphabetTree(this);
                            alphList.add(e);
                        }
			e.add(str);
			break;
		case 'f':
                        if (f==null){
                            f = new AlphabetTree(this);
                            alphList.add(f);
                        }
			f.add(str);
			break;
		case 'g': 
                        if (g==null){
                        g = new AlphabetTree(this);
                        alphList.add(g);
                        }
			g.add(str);
			break;
		case 'h': 
                        if (h==null){
                        h = new AlphabetTree(this);
                        alphList.add(h);
                        }
			h.add(str);
			break;
		case 'i': 
                        if (i==null){
                        i = new AlphabetTree(this);
                        alphList.add(i);
                        }
			i.add(str);
			break;
		case 'j':
                        if (j==null){
                        j = new AlphabetTree(this);
                        alphList.add(j);
                        }
			j.add(str);
			break;
		case 'k':
                        if (k==null){
                        k = new AlphabetTree(this);
                        alphList.add(k);
                        }
			k.add(str);
			break;
		case 'l': 
                        if (l==null){
                        l = new AlphabetTree(this);
                        alphList.add(l);
                        }
			l.add(str);
			break;
		case 'm': 
                        if (m==null){
                        m = new AlphabetTree(this);
                        alphList.add(m);
                        }
			m.add(str);
			break;
		case 'n': 
                        if (n==null){
                        n = new AlphabetTree(this);
                        alphList.add(n);
                        }
			n.add(str);
			break;
		case 'o': 
                        if (o==null){
                        o = new AlphabetTree(this);
                        alphList.add(o);
                        }
			o.add(str);
			break;
		case 'p': 
                        if (p==null){
                        p = new AlphabetTree(this);
                        alphList.add(p);
                        }
			p.add(str);
			break;
		case 'q': 
                        if (q==null){
                        q = new AlphabetTree(this);
                        alphList.add(q);
                        }
			q.add(str);
			break;
		case 'r': 
                        if (r==null){
                        r = new AlphabetTree(this);
                        alphList.add(r);
                        }
			r.add(str);
			break;
		case 's':
                        if (s==null){
                        s = new AlphabetTree(this);
                        alphList.add(s);
                        }
			s.add(str);
			break;
		case 't': 
                        if (t==null){
                        t = new AlphabetTree(this);
                        alphList.add(t);
                        }
			t.add(str);
			break;
		case 'u': 
                        if (u==null){
                        u = new AlphabetTree(this);
                        alphList.add(u);
                        }
			u.add(str);
			break;
		case 'v': 
                        if (v==null){
                        v = new AlphabetTree(this);
                        alphList.add(v);
                        }
			v.add(str);
			break;
		case 'w': 
                        if (w==null){
                        w = new AlphabetTree(this);
                        alphList.add(w);
                        }
			w.add(str);
			break;
		case 'x': 
                        if (x==null){
                        x = new AlphabetTree(this);
                        alphList.add(x);
                        }
			x.add(str);
			break;
		case 'y': 
                        if (y==null){
                        y = new AlphabetTree(this);
                        alphList.add(y);
                        }
			y.add(str);
			break;
		case 'z': 
                        if (z==null){
                        z = new AlphabetTree(this);
                        alphList.add(z);
                        }
			z.add(str);
			break;
		}
	}
	
	private void setupTreeList() {
		alphList.add(a);alphList.add(b);alphList.add(c);alphList.add(d);alphList.add(e);
		alphList.add(f);alphList.add(g);alphList.add(h);alphList.add(i);alphList.add(j);
		alphList.add(k);alphList.add(l);alphList.add(m);alphList.add(n);alphList.add(o);
		alphList.add(p);alphList.add(q);alphList.add(r);alphList.add(s);alphList.add(t);
		alphList.add(u);alphList.add(v);alphList.add(w);alphList.add(x);alphList.add(y);
		alphList.add(z);
	}
	
        //create all the children and sets their parent to this
	private void populate() {
		hasChild = true;
		a = new AlphabetTree(this);b = new AlphabetTree(this);c = new AlphabetTree(this);
		d = new AlphabetTree(this);e = new AlphabetTree(this);f = new AlphabetTree(this);
		g = new AlphabetTree(this);h = new AlphabetTree(this);i = new AlphabetTree(this);
		j = new AlphabetTree(this);k = new AlphabetTree(this);l = new AlphabetTree(this);
		m = new AlphabetTree(this);n = new AlphabetTree(this);o = new AlphabetTree(this);
		p = new AlphabetTree(this);q = new AlphabetTree(this);r = new AlphabetTree(this);
		s = new AlphabetTree(this);t = new AlphabetTree(this);u = new AlphabetTree(this);
		v = new AlphabetTree(this);w = new AlphabetTree(this);x = new AlphabetTree(this);
		y = new AlphabetTree(this);z = new AlphabetTree(this);
		
	}
}
