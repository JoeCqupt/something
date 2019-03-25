package com.example.DO;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.id
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_name
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_age
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    private Byte userAge;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_pass
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    private String userPass;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_salt
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    private String userSalt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_nick_name
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    private String userNickName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_last_login_time
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    private Date userLastLoginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.create_time
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.update_time
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.deleted
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    private Byte deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.id
     *
     * @return the value of t_user.id
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.id
     *
     * @param id the value for t_user.id
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_name
     *
     * @return the value of t_user.user_name
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_name
     *
     * @param userName the value for t_user.user_name
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_age
     *
     * @return the value of t_user.user_age
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    public Byte getUserAge() {
        return userAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_age
     *
     * @param userAge the value for t_user.user_age
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    public void setUserAge(Byte userAge) {
        this.userAge = userAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_pass
     *
     * @return the value of t_user.user_pass
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_pass
     *
     * @param userPass the value for t_user.user_pass
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_salt
     *
     * @return the value of t_user.user_salt
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    public String getUserSalt() {
        return userSalt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_salt
     *
     * @param userSalt the value for t_user.user_salt
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt == null ? null : userSalt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_nick_name
     *
     * @return the value of t_user.user_nick_name
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    public String getUserNickName() {
        return userNickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_nick_name
     *
     * @param userNickName the value for t_user.user_nick_name
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName == null ? null : userNickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_last_login_time
     *
     * @return the value of t_user.user_last_login_time
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    public Date getUserLastLoginTime() {
        return userLastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_last_login_time
     *
     * @param userLastLoginTime the value for t_user.user_last_login_time
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    public void setUserLastLoginTime(Date userLastLoginTime) {
        this.userLastLoginTime = userLastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.create_time
     *
     * @return the value of t_user.create_time
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.create_time
     *
     * @param createTime the value for t_user.create_time
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.update_time
     *
     * @return the value of t_user.update_time
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.update_time
     *
     * @param updateTime the value for t_user.update_time
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.deleted
     *
     * @return the value of t_user.deleted
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.deleted
     *
     * @param deleted the value for t_user.deleted
     *
     * @mbg.generated Fri Mar 08 00:33:37 CST 2019
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }
}