package newjava;

import newjava.country.China;
import newjava.country.Japan;

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

        /*类重写的接口方法以及接口中的常量可以被类的对象调用, 而且常量也可以用类名或接口名直接调用
        * 如果父类实现了某个接口, 子类自然也实现该接口, 子类不必显示的使用关键字implements声明
        * 接口也可以通过关键字extends继承另一个接口, 由于接口中的方法和常量都是public的, 子接口将继承父接口的全部方法和常量
        * 注:如果一个类声明实现一个接口, 但没有重写接口中的所有方法, 那么这个类必须是abstract类*/

        /*接口的回调
        * 定义: 一个类实现了某一个接口, 则该类创建的对象可以把引用赋给该接口声明的接口变量,
        该接口变量也可以调用被类实现的接口方法
        *接口无法调用类中的其他非接口方法 */

        /*接口的多态(和类的多态相似)
        * 有很多类实现该接口, 实现接口的方法就会有很多, 成为多态*/

        /*abstract类与接口的比较
        * (1)abstract类和接口都可以有abstract方法
        * (2)接口中只能有常量, 不能有变量; 而abstract类既可以有常量也可以有变量
        * (3)abstract类中可以有非abstract方法, 接口不可以
        * abstract类与接口的比较
        * abstract类除了提供重要的需要子类重写的abstract方法, 也提供了子类可以继承的变量和非abstract方法*/
    }
}
