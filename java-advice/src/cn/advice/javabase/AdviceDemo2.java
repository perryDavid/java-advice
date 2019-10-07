package cn.advice.javabase;

public class AdviceDemo2 {

    public static void main(String[] args) {
        int i = 80;
        String str = String.valueOf(i < 100 ? 90 : 100);
        String str1 = String.valueOf(i < 100 ? 90 : 100.0);
        String str2 = String.valueOf(i<100 ? "123" : 22);
        System.out.println("两者是否相等：" + str.equals(str1));
    }
}
