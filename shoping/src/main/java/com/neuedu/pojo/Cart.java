package com.neuedu.pojo;

import java.util.Date;

public class Cart {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_cart.id
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_cart.user_id
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_cart.product_id
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    private Integer productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_cart.quantity
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    private Integer quantity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_cart.create_time
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_cart.update_time
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_cart
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    public Cart(Integer id, Integer userId, Integer productId, Integer quantity, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_cart
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    public Cart() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_cart.id
     *
     * @return the value of neuedu_cart.id
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_cart.id
     *
     * @param id the value for neuedu_cart.id
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_cart.user_id
     *
     * @return the value of neuedu_cart.user_id
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_cart.user_id
     *
     * @param userId the value for neuedu_cart.user_id
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_cart.product_id
     *
     * @return the value of neuedu_cart.product_id
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_cart.product_id
     *
     * @param productId the value for neuedu_cart.product_id
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_cart.quantity
     *
     * @return the value of neuedu_cart.quantity
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_cart.quantity
     *
     * @param quantity the value for neuedu_cart.quantity
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_cart.create_time
     *
     * @return the value of neuedu_cart.create_time
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_cart.create_time
     *
     * @param createTime the value for neuedu_cart.create_time
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_cart.update_time
     *
     * @return the value of neuedu_cart.update_time
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_cart.update_time
     *
     * @param updateTime the value for neuedu_cart.update_time
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}