package lessons.lesson16.set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<String> mySortedSet = new TreeSet<>();
        mySortedSet.add("C");
        mySortedSet.add("A");
        mySortedSet.add("B");
        mySortedSet.add("Y");
        mySortedSet.add("O");

        System.out.println(mySortedSet);

    SortedSet<Integer> mySortedSet_2 = new TreeSet<>();
        mySortedSet_2.add(234);
        mySortedSet_2.add(3);
        System.out.println(mySortedSet_2);
    }
}
