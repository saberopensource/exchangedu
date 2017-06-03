package saberlife.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import saberlife.controller.UserController;
import saberlife.pojo.UserPOJO;
import saberlife.util.HttpUtilServlet;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * Created by baiyang
 * Email: 1419408386@qq.com
 * Creation time : 2017/5/19
 * If you don't konw it,Please ask Google
 */
public class UserControllerTest {
    HttpUtilServlet httpUtilServlet = new HttpUtilServlet();

    @Test
    public void test(){
       String a =  httpUtilServlet.HttpUtilServletDoGET("http://localhost:8080/user/get");
        System.out.println(a);
    }
}
