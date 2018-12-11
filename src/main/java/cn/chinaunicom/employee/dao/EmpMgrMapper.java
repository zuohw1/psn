package cn.chinaunicom.employee.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import cn.chinaunicom.employee.entity.AssignmentsInfo;
import cn.chinaunicom.employee.entity.EmpBasic;
import cn.chinaunicom.platform.dao.HrBaseMapper;

/**
 * <p>
 *  员工信息维护Mapper 接口
 * </p>
 *
 * @author zhanggang
 * @since 2018-11-27
 */
public interface EmpMgrMapper extends HrBaseMapper<EmpBasic> {
	
	
	List<Map<String, Object>> queryPsnRoster(RowBounds rowBounds, Map<String,Object> params);
	
	Map<String,Long> queryPsnRosterTotal(Map<String,Object> params);
	
	/**
	 * 根据员工Id获取基本信息
	 * @param params
	 * @return
	 */
	Map<String,Object> queryPsnBasicInfoById(Map<String,Object> params);
	/**
	 * 根据员工Id获取手机号
	 * @param params
	 * @return
	 */
	List<Map<String,Object>> queryPsnMobilePhoneById(Map<String,Object> params);
	/**
	 * 根据员工Id获取分配信息
	 * @param params
	 * @return
	 */
	AssignmentsInfo queryPsnAssignmentsById(Map<String,Object> params);
	/**
	 * 根据员工Id获取其他管理信息
	 * @param params
	 * @return
	 */
	List<Map<String,Object>> queryPsnMgrOtherInfoById(Map<String,Object> params);
	
	/**
	 * 根据员工Id获取学历信息
	 * @param params
	 * @return
	 */
	List<Map<String,Object>> queryPsnEducationsByPersonId(Map<String,Object> params);
	
	/**
	 * 根据员工Id获取工作经历信息
	 * @param params
	 * @return
	 */
	List<Map<String,Object>> queryPsnPreviousJobsByPersonId(Map<String,Object> params);
	/**
	 * 根据员工Id获取职业技能信息
	 * @param params
	 * @return
	 */
	List<Map<String,Object>> queryPsnQualificationsByPersonId(Map<String,Object> params);
	/**
	 * 根据员工Id获取专业技术资格信息
	 * @param params
	 * @return
	 */
	List<Map<String,Object>> queryPsnTechQualificationsByPersonId(Map<String,Object> params);
	/**
	 * 根据员工Id获取奖励信息
	 * @param params
	 * @return
	 */
	List<Map<String,Object>> queryPsnRewardByPersonId(Map<String,Object> params);
	/**
	 * 根据员工Id获取处分信息
	 * @param params
	 * @return
	 */
	List<Map<String,Object>> queryPsnPunishmentByPersonId(Map<String,Object> params);
	/**
	 * 根据员工Id获取党派信息
	 * @param params
	 * @return
	 */
	List<Map<String,Object>> queryPsnPoliticsLandscapeByPersonId(Map<String,Object> params);
	/**
	 * 根据员工Id获取专业技术资格聘任信息
	 * @param params
	 * @return
	 */
	List<Map<String,Object>> queryPsnTechAppointByPersonId(Map<String,Object> params);
	
	/**
	 * 根据员工Id获取职业鉴定信息
	 * @param params
	 * @return
	 */
	List<Map<String,Object>> queryPsnQualificationsAppByPersonId(Map<String,Object> params);
	
	/**
	 * 根据组织名称查询组织列表
	 * @param rowBounds
	 * @param params
	 * @return
	 */
	List<Map<String, Object>> queryOrgListByName(RowBounds rowBounds, Map<String,Object> params);
	/**
	 * 根据组织名称查询组织总数
	 * @param rowBounds
	 * @param params
	 * @return
	 */
	Map<String,Long> queryOrgListByNameCount(Map<String,Object> params);
	
	

}
