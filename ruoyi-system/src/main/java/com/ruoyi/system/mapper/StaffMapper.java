package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Staff;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2021-05-13
 */
public interface StaffMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Staff selectStaffById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param staff 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Staff> selectStaffList(Staff staff);

    /**
     * 新增【请填写功能名称】
     * 
     * @param staff 【请填写功能名称】
     * @return 结果
     */
    public int insertStaff(Staff staff);

    /**
     * 修改【请填写功能名称】
     * 
     * @param staff 【请填写功能名称】
     * @return 结果
     */
    public int updateStaff(Staff staff);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteStaffById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteStaffByIds(String[] ids);
}
