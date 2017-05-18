package saberlife.test;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import saberlife.pojo.UserPOJO;
import saberlife.service.IUserService;

import javax.annotation.Resource;

/**
 * Created by baiyang
 * Email: 1419408386@qq.com
 * Creation time : 2017/5/18
 * If you don't konw it,Please ask Google
 */

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class MybatisTest {
    private static Logger logger = Logger.getLogger(MybatisTest.class);
    //  private ApplicationContext ac = null;
    @Resource
    private IUserService IUserService = null;

//  @Before
//  public void before() {
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//      userService = (IUserService) ac.getBean("userService");
//  }

    @Test
    public void test1() {
        UserPOJO user = IUserService.getUserMessage("haha");
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(user));
    }
}
