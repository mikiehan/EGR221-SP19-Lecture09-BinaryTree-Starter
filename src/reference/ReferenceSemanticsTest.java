package reference;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mhan on 2/23/2017.
 */
public class ReferenceSemanticsTest {
    public static void main(String[] args) {
        pointTest();
    }

    public static void pointTest() {
        Point x = new Point(2, 3);
        System.out.println("x = " + x); //1. what does this print?
        x = change(x);
        System.out.println("now x = " + x); //4. what does this print?
    }

    public static Point change(Point p) {
        //p.translate(10, 10);
        //System.out.println("p = " + p); //2. what does this print?
        p = new Point(-5, -5);
        System.out.println("now p = " + p); //3. What does this print?
        return p;
    }

    public static void arrayTest(){
        java.util.List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("mikie");

        Set<java.util.List<String>> listSet = new HashSet<>();
        listSet.add(list);
        list.remove("world");
        System.out.println(listSet); //True/False? listSet contains "world"
    }
}
