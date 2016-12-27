package lorapp.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @Author MoseC
 * @Desc
 * @Date 2016/12/11
 */
@Entity(name="lora_users")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true, length = 10)
    @NotNull
    @Size(min = 1, max = 10, message = "用户名长度必须在1~10之间")
    private String userName;

    @NotNull
    /*@Size(min = 5, max = 10, message = "密码长度必须在5~10之间")*/
    @Column(nullable = false, length = 50)
    private String passwd;

    /**
     * 管理员:admin, 普通用户:ordin
     */
    @Column(nullable = false, length = 20)
    private String role = USER_ORDIN;

    @Column(length = 100)
    private String description;

    public static final String USER_ADMIN = "admin";
    public static final String USER_ORDIN = "ordin";


    public User(){}

    public User(String userName, String passwd, String description){
        this.userName = userName;
        this.passwd = passwd;
        this.description = description;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
