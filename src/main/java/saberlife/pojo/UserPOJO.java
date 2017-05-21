package saberlife.pojo;

/**
 * Created by baiyang
 * Email: 1419408386@qq.com
 * Creation time : 2017/5/18
 * If you don't konw it,Please ask Google
 */
public class UserPOJO {
    private int id;
    private String phoneNum;
    private String password;

    public UserPOJO() {
    }

    public UserPOJO(int id, String phoneNum, String password, String companyname) {
        this.id = id;
        this.phoneNum = phoneNum;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getphoneNum() {
        return phoneNum;
    }

    public void setphoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserPOJO{" +
                "id=" + id +
                ", phoneNum='" + phoneNum + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
