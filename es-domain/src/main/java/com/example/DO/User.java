package com.example.DO;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_id
     *
     * @mbg.generated Mon Dec 03 00:41:35 CST 2018
     */
    private Integer user_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_name
     *
     * @mbg.generated Mon Dec 03 00:41:35 CST 2018
     */
    private String user_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_age
     *
     * @mbg.generated Mon Dec 03 00:41:35 CST 2018
     */
    private Integer user_age;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_id
     *
     * @return the value of t_user.user_id
     *
     * @mbg.generated Mon Dec 03 00:41:35 CST 2018
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_id
     *
     * @param user_id the value for t_user.user_id
     *
     * @mbg.generated Mon Dec 03 00:41:35 CST 2018
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_name
     *
     * @return the value of t_user.user_name
     *
     * @mbg.generated Mon Dec 03 00:41:35 CST 2018
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_name
     *
     * @param user_name the value for t_user.user_name
     *
     * @mbg.generated Mon Dec 03 00:41:35 CST 2018
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_age
     *
     * @return the value of t_user.user_age
     *
     * @mbg.generated Mon Dec 03 00:41:35 CST 2018
     */
    public Integer getUser_age() {
        return user_age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_age
     *
     * @param user_age the value for t_user.user_age
     *
     * @mbg.generated Mon Dec 03 00:41:35 CST 2018
     */
    public void setUser_age(Integer user_age) {
        this.user_age = user_age;
    }
}