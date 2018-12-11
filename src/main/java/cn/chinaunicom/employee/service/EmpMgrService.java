package cn.chinaunicom.employee.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.plugins.Page;

import cn.chinaunicom.employee.entity.AssignmentsInfo;
import cn.chinaunicom.employee.entity.EmpBasic;
import cn.chinaunicom.employee.entity.EmpBasicDTO;
import cn.chinaunicom.platform.service.IHrService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhanggang
 * @since 2018-11-27
 */
public interface EmpMgrService extends IHrService<EmpBasic> {

	public Page<EmpBasic> getEmpBasicList(Integer pageNumber,Integer pageSize,String fullName,String employeeNumber,String org_id,String userPersonType);
	
	public Integer saveEmpBasic(EmpBasic entity);
	
	public Integer updateEmpBasic(EmpBasic entity);
	
	public Integer deleteEmpBasic(Long id);
	
	/**
	 * 花名册查询方法
	 * @param pageNumber
	 * @param pageSize
	 * @param fullName
	 * @param employeeNumber
	 * @param org_id
	 * @param userPersonType
	 * @return
	 */
	public Page<Map<String, Object>> queryPsnRoster(Integer pageNumber,Integer pageSize,String fullName,String employeeNumber,String org_id,String userPersonType);
	
	/**
	 * 根据人员Id查询基本信息
	 * @param personId
	 * @return
	 */
	public List<EmpBasicDTO> queryPsnBasicInfoById(Long personId);
	
	/**
	 * 根据员工Id获取手机号
	 * @param params
	 * @return
	 */
	Map<String,Object> queryPsnMobilePhoneById(Long personId);
	/**
	 * 根据员工Id获取分配信息
	 * @param params
	 * @return
	 */
	AssignmentsInfo queryPsnAssignmentsById(Long personId);
	/**
	 * 根据员工Id获取其他管理信息
	 * @param params
	 * @return
	 */
	List<Map<String,Object>> queryPsnMgrOtherInfoById(Long personId);
	
	/**
	 * 根据人员Id查询所有学历信息
	 * @param personId
	 * @return
	 */
	List<Map<String,Object>> queryPsnEducationsByPersonId(Long personId);
	
	/**
	 * 根据人员Id查询工作经历信息
	 * @param personId
	 * @return
	 */
	List<Map<String,Object>> queryPsnPreviousJobsByPersonId(Long personId);
	/**
	 * 根据人员Id查询职业鉴定信息
	 * @param personId
	 * @return
	 */
	List<Map<String,Object>> queryPsnQualificationsAppByPersonId(Long personId);
	/**
	 * 根据人员Id查询所有专业技术资格聘任信息
	 * @param personId
	 * @return
	 */
	List<Map<String,Object>> queryPsnTechAppointByPersonId(Long personId);
	/**
	 * 根据人员Id查询党派信息
	 * @param personId
	 * @return
	 */
	List<Map<String,Object>> queryPsnPoliticsLandscapeByPersonId(Long personId);
	/**
	 * 根据人员Id查询所有处分信息
	 * @param personId
	 * @return
	 */
	List<Map<String,Object>> queryPsnPunishmentByPersonId(Long personId);
	/**
	 * 根据人员Id查询所有奖励信息
	 * @param personId
	 * @return
	 */
	List<Map<String,Object>> queryPsnRewardByPersonId(Long personId);
	/**
	 * 根据人员Id查询所有专业技术资格信息
	 * @param personId
	 * @return
	 */
	List<Map<String,Object>> queryPsnTechQualificationsByPersonId(Long personId);
	/**
	 * 根据人员Id查询所有职业技能信息
	 * @param personId
	 * @return
	 */
	List<Map<String,Object>> queryPsnQualificationsByPersonId(Long personId);
	
	/**
	 * 根据组织名称查询组织列表
	 * @param pageNumber
	 * @param pageSize
	 * @param orgName
	 * @return
	 */
	public Page<Map<String, Object>> queryOrgListByName(Integer pageNumber,Integer pageSize,String orgName);


}
