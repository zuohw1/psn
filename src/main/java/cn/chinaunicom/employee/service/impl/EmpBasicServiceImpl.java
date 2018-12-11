package cn.chinaunicom.employee.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;

import cn.chinaunicom.employee.dao.EmpBasicMapper;
import cn.chinaunicom.employee.entity.AssignmentsInfo;
import cn.chinaunicom.employee.entity.EmpBasic;
import cn.chinaunicom.employee.entity.EmpBasicDTO;
import cn.chinaunicom.employee.service.EmpBasicService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhanggang
 * @since 2018-11-06
 */
@Service
public class EmpBasicServiceImpl extends HrServiceImpl<EmpBasicMapper, EmpBasic> implements EmpBasicService {

	@Autowired
	EmpBasicMapper mapper;
	
	@Override
	public Page<EmpBasic> getEmpBasicList(Integer pageNumber,Integer pageSize,String fullName,String employeeNumber,String org_id,String userPersonType) {
		
		Page<EmpBasic> page = new Page<EmpBasic>(pageNumber, pageSize);
		EntityWrapper<EmpBasic> entityWrapper = new EntityWrapper<EmpBasic>();
		entityWrapper.eq("1", "1");
		if(!StringUtils.isEmpty(fullName)) {
			entityWrapper.like("FULL_NAME", fullName);
		}
		if(!StringUtils.isEmpty(employeeNumber)) {
			entityWrapper.like("EMPLOYEE_NUMBER", employeeNumber);
		}
		if(!StringUtils.isEmpty(org_id)) {
			entityWrapper.eq("ORG_ID", org_id);
		}
		if(!StringUtils.isEmpty(userPersonType)) {
			entityWrapper.like("USER_PERSON_TYPE", userPersonType);
		}
		return page.setRecords(mapper.selectPage(page,entityWrapper ));
	
	}

	@Override
	public Integer saveEmpBasic(EmpBasic entity) {
		return mapper.insert(entity);
	}
	
	@Override
	public Integer updateEmpBasic(EmpBasic entity) {
		return mapper.updateById(entity);
	}
	
	@Override
	public Integer deleteEmpBasic(Long id) {
		return mapper.deleteById(id);
	}

	@Override
	public Page<Map<String, Object>> queryPsnRoster(Integer pageNumber, Integer pageSize, String fullName,
			String employeeNumber, String org_id, String userPersonType) {
		
		Page<Map<String, Object>> page = new Page<Map<String, Object>>(pageNumber, pageSize);
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("fullName", fullName);
		params.put("employeeNumber", employeeNumber);
		params.put("org_id", org_id);
		params.put("userPersonType", userPersonType);
		page.setSearchCount(false);
		long totalCount= this.mapper.queryPsnRosterTotal(params).get("total");
		page.setTotal(totalCount);
		return page.setRecords(this.mapper.queryPsnRoster(page,params));
	
		
	}

	@Override
	public List<EmpBasicDTO> queryPsnBasicInfoById(Long personId) {
		Map<String,Object> params = new HashMap<String,Object>();
		
		params.put("personId", personId);
		Map<String,Object> dataMap = this.mapper.queryPsnBasicInfoById(params);
		//将dataMap加工为含中文字段名称的Map，示例：Map<key='fullName',value={dispName:姓名，value:张三}>
		List<EmpBasicDTO> returnList = new ArrayList<EmpBasicDTO>();
		//字段名称先固定
		//1.name_of_letters  姓名全拼
		EmpBasicDTO nameOfLetters = new EmpBasicDTO("name_of_letters","姓名全拼：",dataMap.get("name_of_letters"));
		returnList.add(nameOfLetters);
		//2.user_person_type 人员类型
		EmpBasicDTO userPersonType = new EmpBasicDTO("user_person_type","人员类型：",dataMap.get("user_person_type"));
		returnList.add(userPersonType);
		//3.national_identifier 身份证号
		EmpBasicDTO nationalIdentifier = new EmpBasicDTO("national_identifier","身份证号：",dataMap.get("national_identifier"));
		returnList.add(nationalIdentifier);
		//4.date_of_birth 出生日期
		EmpBasicDTO dateOfBirth = new EmpBasicDTO("date_of_birth","出生日期：",dataMap.get("date_of_birth"));
		returnList.add(dateOfBirth);
		//5.sex 性别
		EmpBasicDTO sex = new EmpBasicDTO("sex","性别：",dataMap.get("sex")!=null?dataMap.get("sex"):"");
		returnList.add(sex);
		//6.blood_type 血型
		EmpBasicDTO bloodType = new EmpBasicDTO("blood_type","血型：",dataMap.get("blood_type")!=null?dataMap.get("blood_type"):"");
		returnList.add(bloodType);		
		//7.nationality 国籍
		EmpBasicDTO nationality = new EmpBasicDTO("nationality","国籍：",dataMap.get("nationality")!=null?dataMap.get("nationality"):"");
		returnList.add(nationality);		
		//8.nation 民族
		EmpBasicDTO nation = new EmpBasicDTO("nation","民族：",dataMap.get("nation"));
		returnList.add(nation);		
		//9.town_of_birth 籍贯
		EmpBasicDTO townOfBirth = new EmpBasicDTO("town_of_birth","籍贯：",dataMap.get("town_of_birth"));
		returnList.add(townOfBirth);		
		//10.blood_type 出生地
		EmpBasicDTO regionOfBirth = new EmpBasicDTO("region_of_birth","出生地：",dataMap.get("region_of_birth"));
		returnList.add(regionOfBirth);		
		//11.household_register_type 户口类型
		EmpBasicDTO householdRegisterType = new EmpBasicDTO("household_register_type","户口类型：",dataMap.get("household_register_type"));
		returnList.add(householdRegisterType);		
		//12.household_register_place 户口所在地
		EmpBasicDTO householdRegisterPlace = new EmpBasicDTO("household_register_place","户口所在地：",dataMap.get("household_register_place"));
		returnList.add(householdRegisterPlace);		
		//13.marital_status 婚姻状况
		EmpBasicDTO maritalStatus = new EmpBasicDTO("marital_status","婚姻状况：",dataMap.get("marital_status"));
		returnList.add(maritalStatus);		
		//14.state_of_health 健康状况
		EmpBasicDTO stateOfHealth = new EmpBasicDTO("state_of_health","健康状况：",dataMap.get("state_of_health"));
		returnList.add(stateOfHealth);		
		/**
		 * 根据ehrbase_emp_phones 表单独获取
		 */
		//15.mobilePhone 手机号码? (在子表中ehrbase_emp_phones)
		Object mPhone = this.queryPsnMobilePhoneById(personId).get("mobilePhone");
		EmpBasicDTO mobilePhone = new EmpBasicDTO("mobilePhone","手机号码：",mPhone!=null?mPhone:"");
		returnList.add(mobilePhone);		
		//16.EMAIL_ADDRESS 电子邮箱
		EmpBasicDTO emailAddress = new EmpBasicDTO("email_address","电子邮箱：",dataMap.get("email_address")!=null?dataMap.get("email_address"):"");
		returnList.add(emailAddress);		
		//17.social_security_num 社会保障号
		EmpBasicDTO socialSecurityNum = new EmpBasicDTO("social_security_num","社会保障号：",dataMap.get("social_security_num")!=null?dataMap.get("social_security_num"):"");
		returnList.add(socialSecurityNum);		
		//18.enjoy_tax_perfer 是否享受纳税优惠（没有值）
		EmpBasicDTO enjoyTaxPerfer = new EmpBasicDTO("enjoy_tax_perfer","是否享受纳税优惠：","");
		returnList.add(enjoyTaxPerfer);		
		//19.initial_job_start_date 参加工作时间
		EmpBasicDTO initialJobStartDate = new EmpBasicDTO("initial_job_start_date","参加工作时间：",dataMap.get("initial_job_start_date")!=null?dataMap.get("initial_job_start_date"):"");
		returnList.add(initialJobStartDate);		
		//20.JOIN_CUC_DATE 加入本企业日期
		EmpBasicDTO joinCucDate = new EmpBasicDTO("join_cuc_date","加入本企业日期：",dataMap.get("join_cuc_date")!=null?dataMap.get("join_cuc_date"):"");
		returnList.add(joinCucDate);		
		//21.join_cuc_channel 加入公司系统途径
		EmpBasicDTO joinCucChannel = new EmpBasicDTO("join_cuc_channel","加入公司系统途径：",dataMap.get("join_cuc_channel")!=null?dataMap.get("join_cuc_channel"):"");
		returnList.add(joinCucChannel);		
		//22.join_cuc_other_channel 加入公司系统子途径
		EmpBasicDTO joinCucOtherChannel = new EmpBasicDTO("join_cuc_other_channel","加入公司系统子途径：",dataMap.get("join_cuc_other_channel")!=null?dataMap.get("join_cuc_other_channel"):"");
		returnList.add(joinCucOtherChannel);	
		//23.specialties 特殊专长
		EmpBasicDTO specialties = new EmpBasicDTO("specialties","特殊专长：",dataMap.get("specialties")!=null?dataMap.get("specialties"):"");
		returnList.add(specialties);	
		//24.planOfRetirementDate 预计退休时间
		EmpBasicDTO planOfRetirementDate = new EmpBasicDTO("plan_of_retirement_date","预计退休时间：",dataMap.get("plan_of_retirement_date")!=null?dataMap.get("plan_of_retirement_date"):"");
		returnList.add(planOfRetirementDate);	
		//25.other_user_person_type 其他人员类型
		EmpBasicDTO otherUserPersonType = new EmpBasicDTO("other_user_person_type","其他人员类型：",dataMap.get("other_user_person_type")!=null?dataMap.get("other_user_person_type"):"");
		returnList.add(otherUserPersonType);	
		//26.join_cuc_channel_new 加入本企业途径（新）
		EmpBasicDTO joinCucChannelNew = new EmpBasicDTO("join_cuc_channel_new","加入本企业途径（新）：",dataMap.get("join_cuc_channel_new"));
		returnList.add(joinCucChannelNew);	
		//27.join_cuc_other_channel_new 加入本企业子途径（新）
		EmpBasicDTO joinCucOtherChannelNew = new EmpBasicDTO("join_cuc_other_channel_new","加入本企业子途径（新）：",dataMap.get("join_cuc_other_channel_new"));
		returnList.add(joinCucOtherChannelNew);	
		//28.join_cuc_channel_mark_new 加入本企业途径说明（新）
		EmpBasicDTO joinCucChannelMarkNew = new EmpBasicDTO("join_cuc_channel_mark_new","加入本企业途径说明（新）：",dataMap.get("join_cuc_channel_mark_new"));
		returnList.add(joinCucChannelMarkNew);	
		//29.join_cuc_other_channel 工龄计算开始日期
		EmpBasicDTO workingAgesStartDate = new EmpBasicDTO("working_ages_start_date","工龄计算开始日期：",dataMap.get("working_ages_start_date")==null?"":dataMap.get("working_ages_start_date"));
		returnList.add(workingAgesStartDate);	
		//30.join_cuc_other_channel 间断工作时间（月）
		EmpBasicDTO intervalWorkingAgesMonth = new EmpBasicDTO("interval_working_ages_month","间断工作时间（月）：",dataMap.get("interval_working_ages_month")!=null?dataMap.get("interval_working_ages_month"):"");
		returnList.add(intervalWorkingAgesMonth);	
		//31.join_office_date 入局时间
		EmpBasicDTO joinOfficeDate = new EmpBasicDTO("join_office_date","入局时间：",dataMap.get("join_office_date")==null?"":dataMap.get("join_office_date"));
		returnList.add(joinOfficeDate);	
		/**
		 * 根据Ehrbase_Assignments_All单独获取
		 */
		AssignmentsInfo  assignmentsInfo = this.queryPsnAssignmentsById(personId);
		if(assignmentsInfo!=null) {
			//32. cuc_org_min_cost 核算到划小单元 (Ehrbase_Assignments_All)
			EmpBasicDTO cucOrgMinCost = new EmpBasicDTO("cuc_org_min_cost","核算到划小单元：",assignmentsInfo.getCucOrgMinCost()=="Y"?"是":"否");
			returnList.add(cucOrgMinCost);	
			//33. cuc_org_min_per_type 划小单元负责人 (Ehrbase_Assignments_All)
			EmpBasicDTO cucOrgMinPerType = new EmpBasicDTO("cuc_org_min_per_type","划小单元负责人：",assignmentsInfo.getCucOrgMinPerType());
			returnList.add(cucOrgMinPerType);	
		}else {
			//32. cuc_org_min_cost 核算到划小单元 (Ehrbase_Assignments_All)
			EmpBasicDTO cucOrgMinCost = new EmpBasicDTO("cuc_org_min_cost","核算到划小单元：","");
			returnList.add(cucOrgMinCost);	
			//33. cuc_org_min_per_type 划小单元负责人 (Ehrbase_Assignments_All)
			EmpBasicDTO cucOrgMinPerType = new EmpBasicDTO("cuc_org_min_per_type","划小单元负责人：","");
			returnList.add(cucOrgMinPerType);	
		}
		
		//34. add_staff_date 增员日期
		EmpBasicDTO addDtaffDate = new EmpBasicDTO("add_staff_date","增员日期：",dataMap.get("add_staff_date")==null?"":dataMap.get("add_staff_date"));
		returnList.add(addDtaffDate);	
		//35. add_staff_type 增员方式
		EmpBasicDTO addStaffType = new EmpBasicDTO("add_staff_type","增员方式：",dataMap.get("add_staff_type")==null?"":dataMap.get("add_staff_type"));
		returnList.add(addStaffType);	
		//36. add_staff_comments 增员方式说明
		EmpBasicDTO addStaffComments = new EmpBasicDTO("add_staff_comments","增员方式说明：",dataMap.get("add_staff_comments")!=null?dataMap.get("add_staff_comments"):"");
		returnList.add(addStaffComments);	
		//37. staff_sort_num 员工排序号
		EmpBasicDTO staffSortNum = new EmpBasicDTO("staff_sort_num","员工排序号：",dataMap.get("staff_sort_num")==null?"":dataMap.get("staff_sort_num"));
		returnList.add(staffSortNum);
		//38. ufidaSystemNumber 用友系统员工编号 
		EmpBasicDTO ufidaSystemNumber = new EmpBasicDTO("ufida_system_number","用友系统员工编号 ：",dataMap.get("ufida_system_number")!=null?dataMap.get("ufida_system_number"):"");
		returnList.add(ufidaSystemNumber);
		/**
		 * 根据EHRCUC_HMHAT_MANAGER_OTHER单独获取
		 */
		List<Map<String,Object>> mgrOtherInfoList = this.queryPsnMgrOtherInfoById(personId);
		if(mgrOtherInfoList!=null && mgrOtherInfoList.size()>0) {
			//39. is_romote_senior 是否异地 (?) EHRCUC_HMHAT_MANAGER_OTHER
			EmpBasicDTO isRomoteSenior = new EmpBasicDTO("is_romote_senior","是否异地 ：",mgrOtherInfoList.get(0).get("isRomoteSenior"));
			returnList.add(isRomoteSenior);
			//40. workingplace 工作地点(?) EHRCUC_HMHAT_MANAGER_OTHER
			EmpBasicDTO workingPlace = new EmpBasicDTO("workingplace","工作地点 ：",mgrOtherInfoList.get(0).get("workingPlace"));
			returnList.add(workingPlace);
		}else {
			//39. is_romote_senior 是否异地 (?) EHRCUC_HMHAT_MANAGER_OTHER
			EmpBasicDTO isRomoteSenior = new EmpBasicDTO("is_romote_senior","是否异地 ：","");
			returnList.add(isRomoteSenior);
			//40. workingplace 工作地点(?) EHRCUC_HMHAT_MANAGER_OTHER
			EmpBasicDTO workingPlace = new EmpBasicDTO("workingplace","工作地点 ：","");
			returnList.add(workingPlace);
		}
		
		
		return returnList;
	}

	@Override
	public Map<String, Object> queryPsnMobilePhoneById(Long personId) {
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("personId", personId);
		List<Map<String,Object>> dataMap = this.mapper.queryPsnMobilePhoneById(params);
		if(dataMap!=null && dataMap.size()>0) {
			return dataMap.get(0);
		}else {
			return new HashMap<String,Object>() ;
		}
	}

	@Override
	public AssignmentsInfo queryPsnAssignmentsById(Long personId) {
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("personId", personId);
		return this.mapper.queryPsnAssignmentsById(params);
	}

	@Override
	public List<Map<String, Object>> queryPsnMgrOtherInfoById(Long personId) {
		
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("personId", personId);
		
		return this.mapper.queryPsnMgrOtherInfoById(params);
	
	}

	@Override
	public List<Map<String, Object>> queryPsnEducationsByPersonId(Long personId) {
		
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("personId", personId);
		List<Map<String, Object>> returnList = this.mapper.queryPsnEducationsByPersonId(params);
		
		return returnList;
	}

	@Override
	public List<Map<String, Object>> queryPsnPreviousJobsByPersonId(Long personId) {
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("personId", personId);
		List<Map<String, Object>> returnList = this.mapper.queryPsnPreviousJobsByPersonId(params);
		
		return returnList;
	}

	@Override
	public List<Map<String, Object>> queryPsnQualificationsAppByPersonId(Long personId) {
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("personId", personId);
		List<Map<String, Object>> returnList = this.mapper.queryPsnQualificationsAppByPersonId(params);
		
		return returnList;
	}

	@Override
	public List<Map<String, Object>> queryPsnTechAppointByPersonId(Long personId) {
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("personId", personId);
		List<Map<String, Object>> returnList = this.mapper.queryPsnTechAppointByPersonId(params);
		
		return returnList;
	}

	@Override
	public List<Map<String, Object>> queryPsnPoliticsLandscapeByPersonId(Long personId) {
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("personId", personId);
		List<Map<String, Object>> returnList = this.mapper.queryPsnPoliticsLandscapeByPersonId(params);
		
		return returnList;
	}

	@Override
	public List<Map<String, Object>> queryPsnPunishmentByPersonId(Long personId) {
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("personId", personId);
		List<Map<String, Object>> returnList = this.mapper.queryPsnPunishmentByPersonId(params);
		
		return returnList;
	}

	@Override
	public List<Map<String, Object>> queryPsnRewardByPersonId(Long personId) {
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("personId", personId);
		List<Map<String, Object>> returnList = this.mapper.queryPsnRewardByPersonId(params);
		
		return returnList;
	}

	@Override
	public List<Map<String, Object>> queryPsnTechQualificationsByPersonId(Long personId) {
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("personId", personId);
		List<Map<String, Object>> returnList = this.mapper.queryPsnTechQualificationsByPersonId(params);
		
		return returnList;
	}

	@Override
	public List<Map<String, Object>> queryPsnQualificationsByPersonId(Long personId) {
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("personId", personId);
		List<Map<String, Object>> returnList = this.mapper.queryPsnQualificationsByPersonId(params);
		
		return returnList;
	}

	@Override
	public Page<Map<String, Object>> queryOrgListByName(Integer pageNumber, Integer pageSize, String orgName) {
	
		Page<Map<String, Object>> page = new Page<Map<String, Object>>(pageNumber, pageSize);
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("orgName", orgName);
		page.setSearchCount(false);
		long totalCount= this.mapper.queryOrgListByNameCount(params).get("total");
		page.setTotal(totalCount);
		return page.setRecords(this.mapper.queryOrgListByName(page,params));
	}
}
