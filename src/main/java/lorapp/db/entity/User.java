package lorapp.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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

    @Column(nullable = false, unique = true, length = 20)
    private String userName;

    @Column(nullable = false, length = 50)
    private String passwd;

    @Column(length = 100)
    private String description;


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
}
