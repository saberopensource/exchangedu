package saberlife.dao;

import saberlife.pojo.UserPOJO;

/**
 * Created by baiyang
 * Email: 1419408386@qq.com
 * Creation time : 2017/5/18
 * If you don't konw it,Please ask Google
 */
public interface UserDao {
    UserPOJO selectUserMessage(int id);
    void addUser();
}
