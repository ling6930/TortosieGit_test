package com.louis.ling.admin.model;

import java.util.Date;

public class sysRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.id
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.name
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.remark
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.create_by
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    private String createBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.create_time
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.last_update_by
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    private String lastUpdateBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.last_update_time
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    private Date lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.del_flag
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    private Byte delFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.id
     *
     * @return the value of sys_role.id
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.id
     *
     * @param id the value for sys_role.id
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.name
     *
     * @return the value of sys_role.name
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.name
     *
     * @param name the value for sys_role.name
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.remark
     *
     * @return the value of sys_role.remark
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.remark
     *
     * @param remark the value for sys_role.remark
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.create_by
     *
     * @return the value of sys_role.create_by
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.create_by
     *
     * @param createBy the value for sys_role.create_by
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.create_time
     *
     * @return the value of sys_role.create_time
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.create_time
     *
     * @param createTime the value for sys_role.create_time
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.last_update_by
     *
     * @return the value of sys_role.last_update_by
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.last_update_by
     *
     * @param lastUpdateBy the value for sys_role.last_update_by
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.last_update_time
     *
     * @return the value of sys_role.last_update_time
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.last_update_time
     *
     * @param lastUpdateTime the value for sys_role.last_update_time
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.del_flag
     *
     * @return the value of sys_role.del_flag
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    public Byte getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.del_flag
     *
     * @param delFlag the value for sys_role.del_flag
     *
     * @mbggenerated Fri Jun 19 15:59:56 CST 2020
     */
    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }
}