package com.hyejineee.ploggingprojectbackend.vo;

public class UserVO {
    private int id;
    private final String email;
    private final String pw;
    private final String nickName;

    public UserVO( String email, String pw, String nickName) {
        this.email = email;
        this.pw = pw;
        this.nickName = nickName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPw() {
        return pw;
    }

    public String getNickName() {
        return nickName;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", pw='" + pw + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
