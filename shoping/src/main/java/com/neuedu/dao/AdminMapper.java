package com.neuedu.dao;

import com.neuedu.pojo.Admin;

public interface AdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_admin
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_admin
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    int insert(Admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_admin
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    int insertSelective(Admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_admin
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    Admin selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_admin
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    int updateByPrimaryKeySelective(Admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_admin
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    int updateByPrimaryKey(Admin record);
}