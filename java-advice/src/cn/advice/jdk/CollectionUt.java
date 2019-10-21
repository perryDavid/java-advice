package cn.advice.jdk;

import java.util.List;

public class CollectionUt {

    public static <E> void read(List<? super E> list) {
        String abc = "";
        for (Object obj : list) {
            // 业务逻辑操作
            abc = abc + "," + obj;
            System.out.println(abc);
        }
    }

    public static <E> void read1(List<? extends E> list) {
        String abc = "";
        for (E obj : list) {
            // 业务逻辑操作
            abc = abc + "," + obj;
            System.out.println(abc);
        }
    }

    public static  void write(List<? extends Number> list) {
        list.add(null);
    }

    public static  void write1(List<? super Number> list) {
        list.add(123);
    }


}
