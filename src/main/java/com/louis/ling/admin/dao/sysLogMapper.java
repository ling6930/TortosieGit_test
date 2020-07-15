package com.louis.ling.admin.dao;

import com.louis.ling.admin.model.sysLog;
import com.louis.ling.admin.model.sysLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sysLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int countByExample(sysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int deleteByExample(sysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int insert(sysLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int insertSelective(sysLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    List<sysLog> selectByExample(sysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    sysLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int updateByExampleSelective(@Param("record") sysLog record, @Param("example") sysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int updateByExample(@Param("record") sysLog record, @Param("example") sysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int updateByPrimaryKeySelective(sysLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int updateByPrimaryKey(sysLog record);

    List<sysLog> findPage();

    List<sysLog> findPageByUserName(@Param(value="userName") String userName);
}