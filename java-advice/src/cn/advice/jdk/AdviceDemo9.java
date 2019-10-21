package cn.advice.jdk;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AdviceDemo9 {
    public static void main(String[] args) {
        // 学生数量 80万
        int stuNum = 80 * 10000;
        // List集合，记录所有学生的分数
        List<Integer> scores = new ArrayList<Integer>(stuNum);
        // 写入分数
        for (int i = 0; i < stuNum; i++) {
            scores.add(new Random().nextInt(150));
        }
        // 记录开始计算 时间
        long start = System.currentTimeMillis();
        System.out.println("平均分是：" + average(scores));
        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - start) + "ms");

        long start1 = System.currentTimeMillis();
        System.out.println("平均分是：" + average1(scores));
        long end1 = System.currentTimeMillis();
        System.out.println("执行时间：" + (end1 - start1) + "ms");
    }

    public static int average(List<Integer> scores) {
        int sum = 0;
        // 遍历求和
        for (int i : scores) {
            sum += i;
        }
        return sum / scores.size();
    }

    public static int average1(List<Integer> scores) {
        int sum = 0;
        // 遍历求和
        for(int i = 0; i<scores.size(); i++){
            sum += scores.get(i);
        }
        return sum / scores.size();
    }
}
