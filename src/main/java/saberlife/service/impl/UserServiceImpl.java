package saberlife.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saberlife.dao.UserDao;
import saberlife.pojo.UserPOJO;
import saberlife.service.IUserService;

import javax.annotation.Resource;

/**
 * Created by baiyang
 * Email: 1419408386@qq.com
 * Creation time : 2017/5/18
 * If you don't konw it,Please ask Google
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserDao userDao;

    public UserPOJO getUserMessage(String username) {
        return this.userDao.selectUserMessage(username);
    }

}
