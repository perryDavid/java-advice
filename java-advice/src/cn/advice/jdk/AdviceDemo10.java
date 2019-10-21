package cn.advice.jdk;

import java.util.ArrayList;
import java.util.Vector;

public class AdviceDemo10 {
    public static void main(String[] args) {
        ArrayList<String> strs = new ArrayList<>();
        strs.add("A");

        Vector<String> strs2 = new Vector<>();
        strs2.add("A");

        System.out.println(strs.equals(strs2));
    }
}
