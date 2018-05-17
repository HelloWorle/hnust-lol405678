package hnust.lol405678.web.entity;

import java.util.Date;

public class Users extends BaseEntity {

    /** 用户ID*/
    private Long id;

    /** 用户名(登录)*/
    private String userName;

    /** 用户密码*/
    private String password;

    /** 用户状态*/
    private Integer status;

    /** 用户类型*/
    private Integer type;

    /** 用户姓名*/
    private String name;

    /** 用户邮箱*/
    private String email;

    /** 用户手机号*/
    private String mobile;

    /** 用户生日*/
    private String birthday;

    /** 用户头像*/
    private String avatar;

    /** 用户标*/
    private String tags;

    /** 数据列版本号*/
    private Integer version;

    /** 创建时间*/
    private Date createdAt;

    /** 更新时间*/
    private Date updatedAt;

    /** 用户额外属性标签*/
    private String features;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }
}
