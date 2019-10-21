package cn.advice.jdk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AdviceDemo17 {

    public static void main(String[] args) throws NoSuchMethodException,
            SecurityException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        // 反射获取方法
        Method m = Foos.class.getDeclaredMethod("doStuff");
        // 打印是否可以访问
        System.out.println("Accessible：" + m.isAccessible());
        // 执行方法
        m.invoke(new Foos());
    }

    public static class Foos {
        public final void doStuff(){
            System.out.println("Do Stuff...");
        }
    }
}
