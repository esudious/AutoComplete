package autocomplete;

import java.io.File;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Jeremy
 */
public class AutoComplete {

    AlphabetTree tree;

    public static void main(String[] args) {
        AutoComplete ac = new AutoComplete();
        //test();
    }

    /**
     *
     */
    public AutoComplete() {
        tree = new AlphabetTree();
        setup();

    }

    void setup() {
        Scanner in;
        try {
            in = new Scanner(new File("dictionary.txt"));
        } catch (Exception e) {
            System.out.println(e);
            in = new Scanner(System.in);
        }

        while (in.hasNext()) {
            String next = in.nextLine().toLowerCase();
            tree.add(next);
        }
    }

    static void test() {
        AlphabetTree abc = new AlphabetTree();

        abc.add("a");
        abc.add("b");
        abc.add("z");
        abc.add("zip");
        abc.add("aa");
        abc.add("ab");
        abc.add("abc");
        abc.add("abcd");
        abc.add("abbe");
        abc.add("bbc");
        abc.add("bbce");
        abc.add("abcdefghij");

        System.out.println(abc.getWords("z"));
        //System.out.println(abc.a.getWords());
    }

}
