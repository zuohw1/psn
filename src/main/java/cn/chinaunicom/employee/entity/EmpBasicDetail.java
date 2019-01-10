package cn.chinaunicom.employee.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;

/**
 * <p>
 * 员工基本信息修改Entity，只保留需要修改的字段
 * </p>
 *
 * @author zhanggang
 * @since 2018-11-06
 */

@ApiModel("")
public class EmpBasicDetail implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 增员方式说明
	 */
	private String addStaffComments;

	private String addStaffCommentsName;

	/**
	 * 增员时间
	 */
	private String addStaffDate;
	/**
	 * 增员方式
	 */
	private String addStaffType;

	private String addStaffTypeName;

	/**
	 * 血型
	 */
	private String bloodType;
	private String bloodTypeName;

	/**
	 * 核算到划小单元
	 */
	private String cucOrgMinCost;
	/**
	 * 划小单元负责人
	 */
	private String cucOrgMinPerType;
	/**
	 * 当前系统时间
	 */
	private String currentSysDate;
	/**
	 * 出生日期
	 */
	private String dateOfBirth;
	/**
	 * 是否残疾
	 */
	private String disabilityFlag;
	private String disabilityFlagName;
	/**
	 * 失效日期
	 */
	private String effectiveEndDate;

	/**
	 * 生效日期
	 */
	private String effectiveStartDate;

	/**
	 * 更新时间
	 */
	private String effectiveUpdateStartDate;
	/**
	 * 电子邮箱
	 */
	private String emailAddress;

	/**
	 * 员工编号
	 */
	private String employeeNumber;
	
	// private String employeeNumberOld;

	private String englishName;
	/**
	 * 姓名
	 */
	private String fullName;
	/**
	 * 户口所在地
	 */
	private String householdRegisterPlace;
	private String householdRegisterPlaceName;
	/**
	 * 户口类型
	 */
	private String householdRegisterType;

	private String householdRegisterTypeName;
	/**
	 * 是否移居国外
	 */
	private String immigratedForeignFlag;
	private String immigratedForeignFlagName;
	/**
	 * 参加工作日期
	 */
	private String initialJobStartDate;
	/**
	 * 首次参加工作方式
	 */
	private String initialJobType;
	private String initialJobTypeName;
	/**
	 * 间断工龄(月)
	 */
	private String intervalWorkingAgesMonth;
	/**
	 * 职务Id
	 */
	private Long jobId;

	/**
	 * 加入本企业途径
	 */
	private String joinCucChannel;
	/**
	 * 加入本企业途径说明(新)
	 */
	private String joinCucChannelMarkNew;
	/**
	 * 加入本企业途径(新)
	 */
	private String joinCucChannelNew;
	/**
	 * 加入本企业日期
	 */
	private String joinCucDate;
	/**
	 * 加入本企业子途径
	 */
	private String joinCucOtherChannel;
	/**
	 * 加入本企业子途径(新)
	 */
	private String joinCucOtherChannelNew;
	/**
	 * 入局时间
	 */
	private String joinOfficeDate;
	/**
	 * 婚姻状况
	 */
	private String maritalStatus;
	private String maritalStatusName;
	/**
	 * 姓名 全拼
	 */
	private String nameOfLetters;

	/**
	 * 民族 lookup_type = 'CN_RACE' hades_lookups
	 */
	private String nation;
	/**
	 * 身份证号
	 */
	private String nationalIdentifier;
	/**
	 * 国籍
	 */
	private String nationality;
	private String nationalityName;
	private String nationName;
	// 操作类型，更新(UPDATE)和更正(CORRECTION)
	private String opt;
	/**
	 * 所属组织id
	 */
	private Long orgId;
	/**
	 * 其他用工类型
	 */
	private String otherUserPersonType;
	/**
	 * 主键
	 */
	private Long personId;
	/**
	 * 人员类型Id
	 */
	private Long personTypeId;
	/**
	 * 计划退休日期
	 */
	private String planOfRetirementDate;
	/**
	 * 曾用名
	 */
	// private String previousName;
	/**
	 * 户籍省份
	 */
	private String province;
	// private String quickAccessCode;
	/**
	 * 出生地
	 */
	private String regionOfBirth;
	/**
	 * 性别 lookup_type = 'SEX'
	 */
	private String sex;
	/**
	 * 性别(值)
	 */
	private String sexName;
	/**
	 * 社会保障号
	 */
	private String socialSecurityNum;
	/**
	 * 特殊专长
	 */
	private String specialties;
	/**
	 * 员工排序号
	 */
	private String staffSortNum;
	/**
	 * 健康状况
	 */
	private String stateOfHealth;
	private String stateOfHealthName;
	/**
	 * 籍贯
	 */
	private String townOfBirth;
	// private String ufidaSystemJoinChannel;
	/**
	 * 用友系统员工编码
	 */
	private String ufidaSystemNumber;
	/**
	 * 用工类型
	 */
	private String userPersonType;
	/**
	 * 工龄计算开始日期
	 */
	private String workingAgesStartDate;

	public String getAddStaffComments() {
		return addStaffComments;
	}

	public String getAddStaffCommentsName() {
		return addStaffCommentsName;
	}

	public String getAddStaffDate() {
		return addStaffDate;
	}

	public String getAddStaffType() {
		return addStaffType;
	}

	public String getAddStaffTypeName() {
		return addStaffTypeName;
	}

	public String getBloodType() {
		return bloodType;
	}

	public String getBloodTypeName() {
		return bloodTypeName;
	}

	public String getCucOrgMinCost() {
		return cucOrgMinCost;
	}

	public String getCucOrgMinPerType() {
		return cucOrgMinPerType;
	}

	public String getCurrentSysDate() {
		return currentSysDate;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getDisabilityFlag() {
		return disabilityFlag;
	}

	public String getDisabilityFlagName() {
		return disabilityFlagName;
	}

	public String getEffectiveEndDate() {
		return effectiveEndDate;
	}

	public String getEffectiveStartDate() {
		return effectiveStartDate;
	}

	public String getEffectiveUpdateStartDate() {
		return effectiveUpdateStartDate;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

//	public String getEmployeeNumberOld() {
//		return employeeNumberOld;
//	}

	public String getEnglishName() {
		return englishName;
	}

	public String getFullName() {
		return fullName;
	}

	public String getHouseholdRegisterPlace() {
		return householdRegisterPlace;
	}

	public String getHouseholdRegisterPlaceName() {
		return householdRegisterPlaceName;
	}

	public String getHouseholdRegisterType() {
		return householdRegisterType;
	}

	public String getHouseholdRegisterTypeName() {
		return householdRegisterTypeName;
	}

	public String getImmigratedForeignFlag() {
		return immigratedForeignFlag;
	}

	public String getImmigratedForeignFlagName() {
		return immigratedForeignFlagName;
	}

	public String getInitialJobStartDate() {
		return initialJobStartDate;
	}

	public String getInitialJobType() {
		return initialJobType;
	}

	public String getInitialJobTypeName() {
		return initialJobTypeName;
	}

	public String getIntervalWorkingAgesMonth() {
		return intervalWorkingAgesMonth;
	}

	public Long getJobId() {
		return jobId;
	}

	public String getJoinCucChannel() {
		return joinCucChannel;
	}

	public String getJoinCucChannelMarkNew() {
		return joinCucChannelMarkNew;
	}

	public String getJoinCucChannelNew() {
		return joinCucChannelNew;
	}

	public String getJoinCucDate() {
		return joinCucDate;
	}

	public String getJoinCucOtherChannel() {
		return joinCucOtherChannel;
	}

	public String getJoinCucOtherChannelNew() {
		return joinCucOtherChannelNew;
	}

	public String getJoinOfficeDate() {
		return joinOfficeDate;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public String getMaritalStatusName() {
		return maritalStatusName;
	}

	public String getNameOfLetters() {
		return nameOfLetters;
	}

	public String getNation() {
		return nation;
	}

	public String getNationalIdentifier() {
		return nationalIdentifier;
	}

	public String getNationality() {
		return nationality;
	}

	public String getNationalityName() {
		return nationalityName;
	}

	public String getNationName() {
		return nationName;
	}

	public String getOpt() {
		return opt;
	}

	public Long getOrgId() {
		return orgId;
	}

	public String getOtherUserPersonType() {
		return otherUserPersonType;
	}

	public Long getPersonId() {
		return personId;
	}

	public Long getPersonTypeId() {
		return personTypeId;
	}

	public String getPlanOfRetirementDate() {
		return planOfRetirementDate;
	}

	public String getProvince() {
		return province;
	}

	public String getRegionOfBirth() {
		return regionOfBirth;
	}

	public String getSex() {
		return sex;
	}

	public String getSexName() {
		return sexName;
	}

	public String getSocialSecurityNum() {
		return socialSecurityNum;
	}

	public String getSpecialties() {
		return specialties;
	}

	public String getStaffSortNum() {
		return staffSortNum;
	}

	public String getStateOfHealth() {
		return stateOfHealth;
	}

	public String getStateOfHealthName() {
		return stateOfHealthName;
	}

	public String getTownOfBirth() {
		return townOfBirth;
	}

//	public String getUfidaSystemJoinChannel() {
//		return ufidaSystemJoinChannel;
//	}

	public String getUfidaSystemNumber() {
		return ufidaSystemNumber;
	}

	public String getUserPersonType() {
		return userPersonType;
	}

	public String getWorkingAgesStartDate() {
		return workingAgesStartDate;
	}

	public void setAddStaffComments(String addStaffComments) {
		this.addStaffComments = addStaffComments;
	}

	public void setAddStaffCommentsName(String addStaffCommentsName) {
		this.addStaffCommentsName = addStaffCommentsName;
	}

	public void setAddStaffDate(String addStaffDate) {
		this.addStaffDate = addStaffDate;
	}

	public void setAddStaffType(String addStaffType) {
		this.addStaffType = addStaffType;
	}

	public void setAddStaffTypeName(String addStaffTypeName) {
		this.addStaffTypeName = addStaffTypeName;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public void setBloodTypeName(String bloodTypeName) {
		this.bloodTypeName = bloodTypeName;
	}

	public void setCucOrgMinCost(String cucOrgMinCost) {
		this.cucOrgMinCost = cucOrgMinCost;
	}

	public void setCucOrgMinPerType(String cucOrgMinPerType) {
		this.cucOrgMinPerType = cucOrgMinPerType;
	}

	public void setCurrentSysDate(String currentSysDate) {
		this.currentSysDate = currentSysDate;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setDisabilityFlag(String disabilityFlag) {
		this.disabilityFlag = disabilityFlag;
	}

	public void setDisabilityFlagName(String disabilityFlagName) {
		this.disabilityFlagName = disabilityFlagName;
	}

	public void setEffectiveEndDate(String effectiveEndDate) {
		this.effectiveEndDate = effectiveEndDate;
	}

	public void setEffectiveStartDate(String effectiveStartDate) {
		this.effectiveStartDate = effectiveStartDate;
	}

	public void setEffectiveUpdateStartDate(String effectiveUpdateStartDate) {
		this.effectiveUpdateStartDate = effectiveUpdateStartDate;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

//	public void setEmployeeNumberOld(String employeeNumberOld) {
//		this.employeeNumberOld = employeeNumberOld;
//	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

//    public void setGradeId(Long gradeId) {
//        this.gradeId = gradeId;
//    }
//
//    public void setHobbies(String hobbies) {
//        this.hobbies = hobbies;
//    }

	public void setHouseholdRegisterPlace(String householdRegisterPlace) {
		this.householdRegisterPlace = householdRegisterPlace;
	}

	public void setHouseholdRegisterPlaceName(String householdRegisterPlaceName) {
		this.householdRegisterPlaceName = householdRegisterPlaceName;
	}

	public void setHouseholdRegisterType(String householdRegisterType) {
		this.householdRegisterType = householdRegisterType;
	}

	public void setHouseholdRegisterTypeName(String householdRegisterTypeName) {
		this.householdRegisterTypeName = householdRegisterTypeName;
	}

	public void setImmigratedForeignFlag(String immigratedForeignFlag) {
		this.immigratedForeignFlag = immigratedForeignFlag;
	}

	public void setImmigratedForeignFlagName(String immigratedForeignFlagName) {
		this.immigratedForeignFlagName = immigratedForeignFlagName;
	}

	public void setInitialJobStartDate(String initialJobStartDate) {
		this.initialJobStartDate = initialJobStartDate;
	}

	public void setInitialJobType(String initialJobType) {
		this.initialJobType = initialJobType;
	}

	public void setInitialJobTypeName(String initialJobTypeName) {
		this.initialJobTypeName = initialJobTypeName;
	}

	public void setIntervalWorkingAgesMonth(String intervalWorkingAgesMonth) {
		this.intervalWorkingAgesMonth = intervalWorkingAgesMonth;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public void setJoinCucChannel(String joinCucChannel) {
		this.joinCucChannel = joinCucChannel;
	}

	public void setJoinCucChannelMarkNew(String joinCucChannelMarkNew) {
		this.joinCucChannelMarkNew = joinCucChannelMarkNew;
	}

	public void setJoinCucChannelNew(String joinCucChannelNew) {
		this.joinCucChannelNew = joinCucChannelNew;
	}

	public void setJoinCucDate(String joinCucDate) {
		this.joinCucDate = joinCucDate;
	}

	public void setJoinCucOtherChannel(String joinCucOtherChannel) {
		this.joinCucOtherChannel = joinCucOtherChannel;
	}

	public void setJoinCucOtherChannelNew(String joinCucOtherChannelNew) {
		this.joinCucOtherChannelNew = joinCucOtherChannelNew;
	}

	public void setJoinOfficeDate(String joinOfficeDate) {
		this.joinOfficeDate = joinOfficeDate;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public void setMaritalStatusName(String maritalStatusName) {
		this.maritalStatusName = maritalStatusName;
	}

	public void setNameOfLetters(String nameOfLetters) {
		this.nameOfLetters = nameOfLetters;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public void setNationalIdentifier(String nationalIdentifier) {
		this.nationalIdentifier = nationalIdentifier;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void setNationalityName(String nationalityName) {
		this.nationalityName = nationalityName;
	}

	public void setNationName(String nationName) {
		this.nationName = nationName;
	}

	public void setOpt(String opt) {
		this.opt = opt;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public void setOtherUserPersonType(String otherUserPersonType) {
		this.otherUserPersonType = otherUserPersonType;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public void setPersonTypeId(Long personTypeId) {
		this.personTypeId = personTypeId;
	}

	public void setPlanOfRetirementDate(String planOfRetirementDate) {
		this.planOfRetirementDate = planOfRetirementDate;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public void setRegionOfBirth(String regionOfBirth) {
		this.regionOfBirth = regionOfBirth;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setSexName(String sexName) {
		this.sexName = sexName;
	}

	public void setSocialSecurityNum(String socialSecurityNum) {
		this.socialSecurityNum = socialSecurityNum;
	}

	public void setSpecialties(String specialties) {
		this.specialties = specialties;
	}

	public void setStaffSortNum(String staffSortNum) {
		this.staffSortNum = staffSortNum;
	}

	public void setStateOfHealth(String stateOfHealth) {
		this.stateOfHealth = stateOfHealth;
	}

	public void setStateOfHealthName(String stateOfHealthName) {
		this.stateOfHealthName = stateOfHealthName;
	}

	public void setTownOfBirth(String townOfBirth) {
		this.townOfBirth = townOfBirth;
	}

//	public void setUfidaSystemJoinChannel(String ufidaSystemJoinChannel) {
//		this.ufidaSystemJoinChannel = ufidaSystemJoinChannel;
//	}

	public void setUfidaSystemNumber(String ufidaSystemNumber) {
		this.ufidaSystemNumber = ufidaSystemNumber;
	}

	public void setUserPersonType(String userPersonType) {
		this.userPersonType = userPersonType;
	}

	public void setWorkingAgesStartDate(String workingAgesStartDate) {
		this.workingAgesStartDate = workingAgesStartDate;
	}

}
