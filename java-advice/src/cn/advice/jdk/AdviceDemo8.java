package cn.advice.jdk;

import java.util.Arrays;
import java.util.List;

public class AdviceDemo8 {
    public static void main(String[] args) {
        // 五天工作制
        Week days[] = { Week.Mon, Week.Tue, Week.Wed, Week.Thu, Week.Fri };
        // 转换为列表
        List<Week> list = Arrays.asList(days);
        // 增加周六为工作日
        list.add(Week.Sat);
        /* do something */
    }
}

enum Week {
    Sun, Mon, Tue, Wed, Thu, Fri, Sat
}
