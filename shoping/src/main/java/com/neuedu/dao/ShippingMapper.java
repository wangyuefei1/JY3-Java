package com.neuedu.dao;

import com.neuedu.pojo.Shipping;

public interface ShippingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_shipping
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_shipping
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    int insert(Shipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_shipping
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    int insertSelective(Shipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_shipping
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    Shipping selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_shipping
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    int updateByPrimaryKeySelective(Shipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_shipping
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    int updateByPrimaryKey(Shipping record);
}