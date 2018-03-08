package com.swk.bean;

/**
 * Description:用户bean
 * @author Vico
 *
 */
public class User {
    /*
     id	int(11)
    email	varchar(255)
    password	varchar(255)
    nickname	varchar(255)
    role	varchar(255)
    active	int(11)
    activecode	varchar(255)
    */
    private int id;
    private String email;
    private String password;
    private String nickname;
    private String role;
    private int active;
    private int activecode;
    private String repassword;
    public String getRepassword() {
        return repassword;
    }
    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }
    //一次验证码
    private String checkcode;
    
    public String getCheckcode() {
        return checkcode;
    }
    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public int getActive() {
        return active;
    }
    public void setActive(int active) {
        this.active = active;
    }
    public int getActivecode() {
        return activecode;
    }
    public void setActivecode(int activecode) {
        this.activecode = activecode;
    }
    
}
