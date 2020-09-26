package cn.zwq.ssm;

import java.util.Random;

/*
第一个java类
 */
public class FirstTest {
    public static void main(String[] args) {
        float  f = 3.14159f;
        double d = 2.4;
        int a = 20;
        int b = 5;
        System.out.print(a+b);
        System.out.print(a-b);
        switch (a){
            case 1: break;
        }
        if (a==1){
        }else{
        }
        String s1 = "Hello";
        String s2 = "hello";
        System.out.print(s1.concat(s2));
    }

    /**
     *
     * @param x 长
     * @param y 宽
     * @param z 高
     * @return
     */
    public int calculating(int x,int y ,int z){
        if (x==0||y==0||z==0){
            return -1;
        }
        int sum = x*y*z;
        System.out.print(sum);
        return sum;

    }



}
