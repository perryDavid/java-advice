package cn.advice.jdk;

public class AdviceDemo1 {
    public static void main(String[] args) {
        String str1 = "詹姆斯";
        String str2 = "詹姆斯";
        String str3 = new String("詹姆斯");
        String str4 = str3.intern();
        // 两个直接量是否相等
        System.out.println(str1 == str2);
        // 直接量和对象是否相等
        System.out.println(str1 == str3);
        // 经过intern处理后的对象与直接量是否相等
        System.out.println(str1 == str4);
    }
}
