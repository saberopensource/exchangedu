package saberlife.team;

import org.junit.Test;

/**
 * Created by baiyang
 * Email: 1419408386@qq.com
 * Creation time : 2017/5/18
 * If you don't konw it,Please ask Google
 */
public class MethodSX {
    protected static void a(){
        System.out.println("aaaaaa执行");
    }
    public MethodSX(){
        System.out.println("构造方法");
    }
    @Test
    public void test(){
        MethodSX.a();
        MethodSX methodSX = new MethodSX();
    }
}
