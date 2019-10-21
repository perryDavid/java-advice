package cn.advice.jdk;

import java.util.ArrayList;
import java.util.List;

public class AdviceDemo12 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> subList = list.subList(0, 2);
        //原字符串增加一个元素
        list.add("D");
        System.out.println("原列表长度："+list.size());
        System.out.println("子列表长度："+subList.size());
    }
}
