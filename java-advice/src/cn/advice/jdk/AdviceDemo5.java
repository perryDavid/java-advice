package cn.advice.jdk;

import java.io.UnsupportedEncodingException;

public class AdviceDemo5 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "汉字";
        // 读取字节
        byte b[] = str.getBytes("UTF-8");
        // 重新生成一个新的字符串
        System.out.println(new String(b));
    }
}