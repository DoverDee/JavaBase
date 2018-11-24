package com.doverdee.thinkinginjava.effective;

/**
 * Created by DL on 2017/9/2.
 */
public class AutoBoxing {
    public static void main(String[] args) {
        long startTime=System.nanoTime();   //获取开始时间
        doLongMethod();
        long endTime=System.nanoTime(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ns");

        long start=System.nanoTime();   //获取开始时间
        dolongMethod();
        long end=System.nanoTime(); //获取结束时间
        System.out.println("程序运行时间： "+(end-start)+"ns");

        System.out.println((endTime-startTime)/(end-start));
    }

    private static void doLongMethod(){
        Long sum =0L;
        for (long i=0; i<Integer.MAX_VALUE; i++) {
            sum +=i;
        }
        System.out.println(sum);
    }

    private static void dolongMethod(){
        long sum =0L;
        for (long i=0; i<Integer.MAX_VALUE; i++) {
            sum +=i;
        }
        System.out.println(sum);
    }
}
