package cn.advice.jdk;

import java.util.ArrayList;
import java.util.List;

public class AdviceDemo15 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        CollectionUt.read(list);
    }
}
