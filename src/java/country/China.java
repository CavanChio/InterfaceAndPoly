package java.country;

import java.Computable;

/**
 * Created by Cavan on 2017/1/20.
 */
//实现某一个接口必须使用接口中的所有方法
public class China implements Computable {
    public int number;
    public int f(int x) {
        int sum = 0;
        for (int i = 0; i < x; i++) {
            sum += i;
        }
        return sum;
    }
}
