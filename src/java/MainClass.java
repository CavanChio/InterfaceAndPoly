package java;

import java.country.China;
import java.country.Japan;

/**
 * Created by Cavan on 2017/1/20.
 */
public class MainClass {
    public static void main(String args[]) {
        /*接口
        * 声明: 使用关键字interface声明
        * 格式: interface 接口名字
        * */
        /*接口体
        * 包含部分: 常量(没有变量)的声明和方法定义(只有抽象方法, 没有普通方法)两部分
        * 常量的访问权限一定都是public(允许省略public, final修饰符)
        * 抽象方法访问权限一定都是public(允许省略public, abstract修饰符)*/
        //实现接口的基本用法
        China zhang;
        Japan henlu;
        zhang = new China();
        henlu = new Japan();
        zhang.number = 28 + Computable.MAX;
        henlu.number = 14 + Computable.MAX;
        System.out.println("zhang的学号"+zhang.number+", zhang求和结果"+zhang.f(100));
        System.out.println("henlu的学号"+henlu.number+", henlu求和结果"+henlu.f(100));
    }
}
