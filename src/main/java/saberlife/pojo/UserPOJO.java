package saberlife.pojo;

/**
 * Created by baiyang
 * Email: 1419408386@qq.com
 * Creation time : 2017/5/18
 * If you don't konw it,Please ask Google
 */
public class UserPOJO {
    private int id;
    private String username;
    private String password;
    private String companyname;

    public UserPOJO() {
    }

    public UserPOJO(int id, String username, String password, String companyname) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.companyname = companyname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }
}
