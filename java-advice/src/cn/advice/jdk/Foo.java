package cn.advice.jdk;

import java.util.List;

public class Foo {
    //arrayMethod接收数组参数，并进行重载
    public void arrayMethod(String[] intArray) {

    }

    public void arrayMethod(Integer[] intArray) {

    }
    //listMethod接收泛型List参数，并进行重载
    public void listMethod1(List<String> stringList) {

    }
    public void listMethod(List<Integer> intList) {

    }
}
