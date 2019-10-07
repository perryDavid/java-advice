package cn.advice.javabase;

import java.util.Scanner;

public class AdviceDemo5 {
    public static void main(String[] args) {
        // 接收键盘输入参数
        Scanner input = new Scanner(System.in);
        System.out.println("输入多个数字判断奇偶：");
        while (input.hasNextInt()) {
            int i = input.nextInt();
            String str = i + "-->" + (i % 2 == 1 ? "奇数" : "偶数");
            System.out.println(str);

        }
    }
}
