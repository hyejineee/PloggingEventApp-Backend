package com.hyejineee.ploggingprojectbackend.service.dto;

public class LoginDTO {
    private String email;
    private String pw;

    public LoginDTO(String email, String pw) {
        this.email = email;
        this.pw = pw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "LoginDTO{" +
                "email='" + email + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }
}
