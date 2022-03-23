package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Users {
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Id
    @Column(name = "userId")
    private int userId;
    @Basic
    @Column(name = "userName")
    private String userName;
    @Basic
    @Column(name = "aPassWord")
    private String aPassWord;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getaPassWord() {
        return aPassWord;
    }

    public void setaPassWord(String aPassWord) {
        this.aPassWord = aPassWord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return userId == users.userId && Objects.equals(userName, users.userName) && Objects.equals(aPassWord, users.aPassWord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, aPassWord);
    }
}
