package cn.advice.jdk;

import java.nio.channels.Pipe;
import java.util.ArrayList;
import java.util.List;

public class AdviceDemo13 {

     static List<String> list1;
     static List<String> list2;

    private static void initList(){
        list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list2 = new ArrayList<>();
        list2.add("C");
    }

    public static void main(String[] args) {
        initList();
        all(list1,list2);
        initList();
        retain(list1,list2);
        initList();
        remove(list1,list2);
        initList();
        withoutRepeatList(list1,list2);

    }

    private static void all(List<String> list1,List<String> list2){
        // 并集
        list1.addAll(list2);
        System.out.println("并集：" +  list1);
    }

    private static void retain(List<String> list1,List<String> list2){
        // 交集
        list1.retainAll(list2);
        System.out.println("交集：" +  list1);
    }

    private static void remove(List<String> list1,List<String> list2){
        // 差集
        list1.removeAll(list2);
        System.out.println("差集：" +  list1);
    }

    private static void withoutRepeatList(List<String> list1,List<String> list2){
        // 无重复
        list2.removeAll(list1);
        list1.addAll(list2);
        System.out.println("无重复集：" +  list1);
    }
}
