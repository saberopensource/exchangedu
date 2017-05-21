package saberlife.controller;

import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import saberlife.pojo.UserPOJO;
import saberlife.service.IUserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by baiyang
 * Email: 1419408386@qq.com
 * Creation time : 2017/5/19
 * If you don't konw it,Please ask Google
 */
@Controller
@RequestMapping("/user")
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
public class UserController {

    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    private IUserService iUserService = null;

    @RequestMapping("/get")
    public void getUserValue(HttpServletResponse response) throws IOException {
        int a = 1;
        UserPOJO userPOJO = iUserService.getUserMessage(a);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("a",userPOJO);
        response.getWriter().write(jsonObject.toString());
    }

    @RequestMapping("/addUser")
    public void addUser(HttpServletRequest request,HttpServletResponse response) throws IOException{
        request.getParameter("p");
        iUserService.addUser();
    }
}
