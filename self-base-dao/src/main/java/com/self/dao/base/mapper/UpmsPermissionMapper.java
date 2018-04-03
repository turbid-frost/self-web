package com.self.dao.base.mapper;

import com.self.base.entity.UpmsPermission;
import com.self.base.entity.UpmsPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsPermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated Tue Apr 03 14:04:18 CST 2018
     */
    long countByExample(UpmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated Tue Apr 03 14:04:18 CST 2018
     */
    int deleteByExample(UpmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated Tue Apr 03 14:04:18 CST 2018
     */
    int deleteByPrimaryKey(Integer permissionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated Tue Apr 03 14:04:18 CST 2018
     */
    int insert(UpmsPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated Tue Apr 03 14:04:18 CST 2018
     */
    int insertSelective(UpmsPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated Tue Apr 03 14:04:18 CST 2018
     */
    List<UpmsPermission> selectByExample(UpmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated Tue Apr 03 14:04:18 CST 2018
     */
    UpmsPermission selectByPrimaryKey(Integer permissionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated Tue Apr 03 14:04:18 CST 2018
     */
    int updateByExampleSelective(@Param("record") UpmsPermission record, @Param("example") UpmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated Tue Apr 03 14:04:18 CST 2018
     */
    int updateByExample(@Param("record") UpmsPermission record, @Param("example") UpmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated Tue Apr 03 14:04:18 CST 2018
     */
    int updateByPrimaryKeySelective(UpmsPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated Tue Apr 03 14:04:18 CST 2018
     */
    int updateByPrimaryKey(UpmsPermission record);
}