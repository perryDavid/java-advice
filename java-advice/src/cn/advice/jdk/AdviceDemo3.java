package cn.advice.jdk;


public class AdviceDemo3 {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }


    public static void test1(){
        long timespace = System.currentTimeMillis();
        String abc = "";
        for (int i = 0; i<100000;i++){
            abc = abc + i;
        }
        System.out.println("String + 运行时长:"  + (System.currentTimeMillis() - timespace) + "ms");
    }

    public static void test2(){
        long timespace = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i<100000;i++){
            stringBuffer.append(i);
        }
        System.out.println("StringBuffer运行时长:"  + (System.currentTimeMillis() - timespace) + "ms");
    }

    public static void test3(){
        long timespace = System.currentTimeMillis();
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0; i<100000;i++){
            stringBuffer.append(i);
        }
        System.out.println("StringBuilder运行时长:"  + (System.currentTimeMillis() - timespace) + "ms");
    }





}
