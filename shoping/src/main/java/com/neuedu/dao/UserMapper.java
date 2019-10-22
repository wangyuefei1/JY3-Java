package com.neuedu.dao;

import com.neuedu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_user
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_user
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_user
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_user
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_user
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_user
     *
     * @mbggenerated Wed Aug 07 15:08:53 CST 2019
     */
    List<User>  queryUser();

    int updateByPrimaryKey(User record);

    int selectUserByusername(String username);

    User selectUser(@Param("name") String username, @Param("psw") String password);

    String seclectQues(String username);

    int checkAnswer(@Param("username") String username,@Param("question") String question,@Param("answer") String answer);

    int resetPsw(@Param("username") String username, @Param("newpsw") String newpsw);

    int selectEmail(String email);

    User queryUserInfo(String username);


}