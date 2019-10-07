package cn.advice.javabase;

public class AdviceDemo1 {
    public static void main(String[] args) {
        test01();
    }

    public static void test01(){
        long i=1l;
        System.out.println("i的两倍是："+(i+i));
    }
}
