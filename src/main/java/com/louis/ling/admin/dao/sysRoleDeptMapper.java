package com.louis.ling.admin.dao;

import com.louis.ling.admin.model.sysRoleDept;
import com.louis.ling.admin.model.sysRoleDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sysRoleDeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_dept
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int countByExample(sysRoleDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_dept
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int deleteByExample(sysRoleDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_dept
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_dept
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int insert(sysRoleDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_dept
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int insertSelective(sysRoleDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_dept
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    List<sysRoleDept> selectByExample(sysRoleDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_dept
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    sysRoleDept selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_dept
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int updateByExampleSelective(@Param("record") sysRoleDept record, @Param("example") sysRoleDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_dept
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int updateByExample(@Param("record") sysRoleDept record, @Param("example") sysRoleDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_dept
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int updateByPrimaryKeySelective(sysRoleDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_dept
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    int updateByPrimaryKey(sysRoleDept record);
}