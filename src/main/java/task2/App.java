package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(100500);
        list.add(100500);
        list.add(0);
        list.add(555);
        list.add(-10,3);
        System.out.println(list.toString());
        System.out.println(list.getElement(5));
    }
}
