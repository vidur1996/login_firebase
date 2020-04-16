package com.vidu.login;

public class member {

    String username;
    String name;
    String  email;
    Integer num;
    String password;

    public member()
    {

    }
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername()
    {
        this.username = username;

    }
    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail()
    {
        return email;
    }
}
