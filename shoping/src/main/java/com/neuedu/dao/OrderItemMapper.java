package com.neuedu.dao;

import com.neuedu.pojo.OrderItem;

public interface OrderItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_order_item
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_order_item
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    int insert(OrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_order_item
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    int insertSelective(OrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_order_item
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    OrderItem selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_order_item
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    int updateByPrimaryKeySelective(OrderItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_order_item
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    int updateByPrimaryKey(OrderItem record);
}