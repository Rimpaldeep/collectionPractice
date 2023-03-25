import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> color = new ArrayList<> ();
        color.add ("Red");
        color.add ("Yellow");
        color.add ("Green");
        color.add ("Blue");
        color.add ("Black");
        System.out.println (color);

        for (int i = 0; i < color.size (); i++) {
            if(color.get (i).equals ("Yellow")) {
                color.remove (i);
            }
            }
        System.out.println (color);

        Iterator<String> iterator = color.iterator ();
        while (iterator.hasNext ()) {
            String next = iterator.next ();
            if (next.equals ("Green")) {
                iterator.remove ();
            }
        }
        System.out.println (color);
        color.add (1, "White");
        System.out.println (color);

        List <String> anotherColors = Arrays.asList ("Grey", "Purple", "Orange", "Brown");
        System.out.println (anotherColors);
        color.addAll (3, anotherColors);
        System.out.println (color);

        Iterator<String> iterator1 = color.iterator ();
        while (iterator1.hasNext ()) {
            String next = iterator1.next ();
            if (next.length () ==5) {
                iterator1.remove ();
            }
        }
        System.out.println (color);
        color.addAll (color);
        System.out.println (color);

        TreeSet <String> colorSet = new TreeSet<> (color);
        System.out.println (colorSet);
        //NavigableSet<String> strings = colorSet.descendingSet ();
        TreeSet <String> color1 = (TreeSet<String>) colorSet.descendingSet ();
        System.out.println (color1);
    }
        }





