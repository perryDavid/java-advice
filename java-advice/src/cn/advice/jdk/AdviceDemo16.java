package cn.advice.jdk;

import java.lang.reflect.Method;

public class AdviceDemo16 {
    public static void main(String[] args) throws NoSuchMethodException,
            SecurityException {
        // 方法名称
        String methodName = "doStuff";
        Method m1 = Foo.class.getDeclaredMethod(methodName);
        Method m2 = Foo.class.getMethod(methodName);
    }
    //静态内部类
    static class Foo {
        void doStuff() {
        }
    }
}
