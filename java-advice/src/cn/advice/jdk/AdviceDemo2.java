package cn.advice.jdk;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AdviceDemo2 {

     static class StringUtils {
        //删除字符串
        public static String remove(String source, String sub) {
            return source.replaceAll(sub, "");
        }
    }


    @Test
    public void test() {
        assertTrue(StringUtils.remove("好是好","好").equals("是"));
    }

    @Test
    public void test1(){
        assertTrue(StringUtils.remove("$是$","$").equals("是"));
    }

}
