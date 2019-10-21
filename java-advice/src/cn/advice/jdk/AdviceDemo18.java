package cn.advice.jdk;

import java.util.zip.DataFormatException;

public class AdviceDemo18 {
    public static void main(String[] args) {
        try {
            System.out.println(doStuff(-1));
            System.out.println(doStuff(100));
        } catch (Exception e) {
            System.out.println("这里是永远不会到达的");
        }
    }
    //该方法抛出受检异常
    public static int doStuff(int _p) throws Exception {
        try {
            if (_p < 0) {
                throw new DataFormatException(" 数据格式错误 ");
            } else {
                return _p;
            }

        } catch (Exception e) {
            // 异常处理
            throw e;
        } finally {
            return -1;
        }
    }
}
