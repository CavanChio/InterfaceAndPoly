package newjava;

/**
 * Created by Cavan on 2017/1/20.
 */
//如果一个类声明实现一个接口, 但没有重写接口中的所有方法, 那么这个类必须是abstract类
abstract public class A implements Computable {
    public int f(int x) {
        int sum = 0;
        for (int i = 0; i < x; i++) {
            sum += i;
        }
        return sum;
    }
}
