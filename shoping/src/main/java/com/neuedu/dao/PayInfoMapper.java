package com.neuedu.dao;

import com.neuedu.pojo.PayInfo;

public interface PayInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_payinfo
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_payinfo
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    int insert(PayInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_payinfo
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    int insertSelective(PayInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_payinfo
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    PayInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_payinfo
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    int updateByPrimaryKeySelective(PayInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_payinfo
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    int updateByPrimaryKey(PayInfo record);
}