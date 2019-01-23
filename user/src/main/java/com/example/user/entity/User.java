package com.example.user.entity;

public class User {
    /**
     * <pre>
     * 
     * 表字段 : user.uid
     * </pre>
     */
    private Integer uid;

    /**
     * <pre>
     * 
     * 表字段 : user.uname
     * </pre>
     */
    private String uname;

    /**
     * <pre>
     * 
     * 表字段 : user.pwd
     * </pre>
     */
    private String pwd;

    /**
     * <pre>
     * 
     * 表字段 : user.phone
     * </pre>
     */
    private String phone;

    /**
     * <pre>
     * 获取：
     * 表字段：user.uid
     * </pre>
     *
     * @return user.uid：
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：user.uid
     * </pre>
     *
     * @param uid
     *            user.uid：
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：user.uname
     * </pre>
     *
     * @return user.uname：
     */
    public String getUname() {
        return uname;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：user.uname
     * </pre>
     *
     * @param uname
     *            user.uname：
     */
    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：user.pwd
     * </pre>
     *
     * @return user.pwd：
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：user.pwd
     * </pre>
     *
     * @param pwd
     *            user.pwd：
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：user.phone
     * </pre>
     *
     * @return user.phone：
     */
    public String getPhone() {
        return phone;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：user.phone
     * </pre>
     *
     * @param phone
     *            user.phone：
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}