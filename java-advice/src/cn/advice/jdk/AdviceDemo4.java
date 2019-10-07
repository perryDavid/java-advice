package cn.advice.jdk;

public class AdviceDemo4 {
    public static void main(String[] args) {
        String str1 = 1 + 2 + "apples";
        String str2 = "apples" + 1 + 2;
        System.out.println(str1);
        System.out.println(str2);
    }
}
