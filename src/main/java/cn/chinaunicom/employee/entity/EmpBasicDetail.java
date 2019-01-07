package cn.chinaunicom.employee.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModel;

/**
 * <p>
 * 员工基本信息Entity
 * </p>
 *
 * @author zhanggang
 * @since 2018-11-06
 */

@ApiModel("")
public class EmpBasicDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    
    //操作类型，更新(UPDATE)和更正(CORRECTION)
    private String opt ;
    /**
     * 主键
     */
    private Long personId;
    /**
     * 所属组织id
     */
    private Long orgId;
    /**
     * 人员类型Id
     */
    private Long personTypeId;
    /**
     * 职务Id
     */
    private Long jobId;
    
    private Long gradeId;
    /**
     * 生效日期
     */
    private String effectiveStartDate;
    /**
     * 失效日期
     */
    private String effectiveEndDate;
    /**
     * 员工编号
     */
    private String employeeNumber;
    /**
     * 姓名
     */
    private String fullName;
    /**
     * 曾用名
     */
    private String previousName;
    /**
     * 性别
     * lookup_type = 'SEX'
     */
    private String sex;
    
    /**
     * 性别(值)
     */
    private String sexValue;
    
    /**
     * 出生日期
     */
    private String dateOfBirth;
    /**
     * 国籍
     */
    private String nationality;
    
    private String nationalityValue;
    /**
     * 民族
     * lookup_type = 'CN_RACE'   hades_lookups 
     */
    private String nation;
    
    private String nationValue;
    /**
     * 户籍省份
     */
    private String province;
    /**
     * 籍贯
     */
    private String townOfBirth;
    /**
     * 出生地
     */
    private String regionOfBirth;
    /**
     * 户口所在地
     */
    private String householdRegisterPlace;
    private String householdRegisterPlaceValue;
    /**
     * 户口类型
     */
    private String householdRegisterType;
    
    private String householdRegisterTypeValue;
    /**
     * 用工类型
     */
    private String userPersonType;
    /**
     * 身份证号
     */
    private String nationalIdentifier;
    /**
     * 健康状况
     */
    private String stateOfHealth;
    private String stateOfHealthValue;
    /**
     * 特殊专长
     */
    private String specialties;
    private String hobbies;
    /**
     * 婚姻状况
     */
    private String maritalStatus;

    private String maritalStatusValue;
    /**
     * 电子邮箱
     */
    private String emailAddress;
    private String englishName;
    /**
     * 姓名 全拼
     */
    private String nameOfLetters;
    private String quickAccessCode;
    /**
     * 血型
     */
    private String bloodType;
    private String bloodTypeValue;
    /**
     * 是否残疾
     */
    private String disabilityFlag;
    private String disabilityFlagValue;
    /**
     * 是否移居国外
     */
    private String immigratedForeignFlag;
    
    private String immigratedForeignFlagValue;
    /**
     * 计划退休日期
     */
    private String planOfRetirementDate;
    /**
     * 其他用工类型
     */
    private String otherUserPersonType;
    /**
     * 参加工作日期
     */
    private String initialJobStartDate;
    /**
     * 工龄计算开始日期
     */
    private String workingAgesStartDate;
    /**
     * 间断工龄(月)
     */
    private String intervalWorkingAgesMonth;
    /**
     * 首次参加工作方式
     */
    private String initialJobType;
    private String initialJobTypeValue;
    /**
     * 加入本企业日期
     */
    private String joinCucDate;
    /**
     * 加入本企业途径
     */
    private String joinCucChannel;
    /**
     * 加入本企业子途径
     */
    private String joinCucOtherChannel;
    /**
     * 员工排序号
     */
    private String staffSortNum;
    private String employeeNumberOld;
    /**
     * 用友系统员工编码
     */
    private String ufidaSystemNumber;
    private String ufidaSystemJoinChannel;
    /**
     * 入局时间
     */
    private String joinOfficeDate;
    /**
     * 增员时间
     */
    private String addStaffDate;
    /**
     * 增员方式
     */
    private String addStaffType;
    private String addStaffTypeValue;
    /**
     * 增员方式说明
     */
    private String addStaffComments;
    private String addStaffCommentsValue;
    /**
     * 社会保障号
     */
    private String socialSecurityNum;
    private long createBy;
    private String createDate;
    private long updateBy;
    private String updateDate;
//    private String attribute1;
//    private String attribute2;
//    private String attribute3;
//    private String attribute4;
//    private String attribute5;
//    private String attribute6;
//    private String attribute7;
//    private String attribute8;
//    private String attribute9;
//    private String attribute10;
//    private String synchronizationState;
    /**
     * 加入本企业途径(新)
     */
    private String joinCucChannelNew;
    /**
     * 加入本企业子途径(新)
     */
    private String joinCucOtherChannelNew;
    /**
     * 加入本企业途径说明(新)
     */
    private String joinCucChannelMarkNew;
//    /**
//     * 政治面貌(档案编码) 
//     * hades_lookups  lookup_type = 'CN_PARTY_TYPE'
//     */
//    private String politicsLandscapeName;
//    private String educationExperience;
//    private String degree;
//    private String staffCategory;
//    private String assignmentCategory;
//    private String jobName;
//    private String qualificationLevel;
//    private String gradeName;
//    private String peopleGroup;
//    private String payRegulation;
//    private String emailName;
//    private String aliasName;
//    private String joinTelecomDate;
    /**
     * 核算到划小单元
     */
    private String cucOrgMinCost;
    /**
	 * 划小单元负责人
	 */
	private String cucOrgMinPerType;
	
    public String getCucOrgMinCost() {
		return cucOrgMinCost;
	}

	public void setCucOrgMinCost(String cucOrgMinCost) {
		this.cucOrgMinCost = cucOrgMinCost;
	}

	public String getCucOrgMinPerType() {
		return cucOrgMinPerType;
	}

	public void setCucOrgMinPerType(String cucOrgMinPerType) {
		this.cucOrgMinPerType = cucOrgMinPerType;
	}
	


    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getPersonTypeId() {
        return personTypeId;
    }

    public void setPersonTypeId(Long personTypeId) {
        this.personTypeId = personTypeId;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Long getGradeId() {
        return gradeId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    public String getEffectiveStartDate() {
        return effectiveStartDate;
    }

    public void setEffectiveStartDate(String effectiveStartDate) {
        this.effectiveStartDate = effectiveStartDate;
    }

    public String getEffectiveEndDate() {
        return effectiveEndDate;
    }

    public void setEffectiveEndDate(String effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPreviousName() {
        return previousName;
    }

    public void setPreviousName(String previousName) {
        this.previousName = previousName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSexValue() {
		return sexValue;
	}

	public void setSexValue(String sexValue) {
		this.sexValue = sexValue;
	}

	public String getNationalityValue() {
		return nationalityValue;
	}

	public void setNationalityValue(String nationalityValue) {
		this.nationalityValue = nationalityValue;
	}

	public String getNationValue() {
		return nationValue;
	}

	public void setNationValue(String nationValue) {
		this.nationValue = nationValue;
	}

	public String getHouseholdRegisterPlaceValue() {
		return householdRegisterPlaceValue;
	}

	public void setHouseholdRegisterPlaceValue(String householdRegisterPlaceValue) {
		this.householdRegisterPlaceValue = householdRegisterPlaceValue;
	}

	public String getHouseholdRegisterTypeValue() {
		return householdRegisterTypeValue;
	}

	public void setHouseholdRegisterTypeValue(String householdRegisterTypeValue) {
		this.householdRegisterTypeValue = householdRegisterTypeValue;
	}

	public String getStateOfHealthValue() {
		return stateOfHealthValue;
	}

	public void setStateOfHealthValue(String stateOfHealthValue) {
		this.stateOfHealthValue = stateOfHealthValue;
	}

	public String getMaritalStatusValue() {
		return maritalStatusValue;
	}

	public void setMaritalStatusValue(String maritalStatusValue) {
		this.maritalStatusValue = maritalStatusValue;
	}

	public String getBloodTypeValue() {
		return bloodTypeValue;
	}

	public void setBloodTypeValue(String bloodTypeValue) {
		this.bloodTypeValue = bloodTypeValue;
	}

	public String getDisabilityFlagValue() {
		return disabilityFlagValue;
	}

	public void setDisabilityFlagValue(String disabilityFlagValue) {
		this.disabilityFlagValue = disabilityFlagValue;
	}

	public String getImmigratedForeignFlagValue() {
		return immigratedForeignFlagValue;
	}

	public void setImmigratedForeignFlagValue(String immigratedForeignFlagValue) {
		this.immigratedForeignFlagValue = immigratedForeignFlagValue;
	}

	public String getInitialJobTypeValue() {
		return initialJobTypeValue;
	}

	public void setInitialJobTypeValue(String initialJobTypeValue) {
		this.initialJobTypeValue = initialJobTypeValue;
	}

	public String getAddStaffTypeValue() {
		return addStaffTypeValue;
	}

	public void setAddStaffTypeValue(String addStaffTypeValue) {
		this.addStaffTypeValue = addStaffTypeValue;
	}

	public String getAddStaffCommentsValue() {
		return addStaffCommentsValue;
	}

	public void setAddStaffCommentsValue(String addStaffCommentsValue) {
		this.addStaffCommentsValue = addStaffCommentsValue;
	}

	public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getTownOfBirth() {
        return townOfBirth;
    }

    public void setTownOfBirth(String townOfBirth) {
        this.townOfBirth = townOfBirth;
    }

    public String getRegionOfBirth() {
        return regionOfBirth;
    }

    public void setRegionOfBirth(String regionOfBirth) {
        this.regionOfBirth = regionOfBirth;
    }

    public String getHouseholdRegisterPlace() {
        return householdRegisterPlace;
    }

    public void setHouseholdRegisterPlace(String householdRegisterPlace) {
        this.householdRegisterPlace = householdRegisterPlace;
    }

    public String getHouseholdRegisterType() {
        return householdRegisterType;
    }

    public void setHouseholdRegisterType(String householdRegisterType) {
        this.householdRegisterType = householdRegisterType;
    }

    public String getUserPersonType() {
        return userPersonType;
    }

    public void setUserPersonType(String userPersonType) {
        this.userPersonType = userPersonType;
    }

    public String getNationalIdentifier() {
        return nationalIdentifier;
    }

    public void setNationalIdentifier(String nationalIdentifier) {
        this.nationalIdentifier = nationalIdentifier;
    }

    public String getStateOfHealth() {
        return stateOfHealth;
    }

    public void setStateOfHealth(String stateOfHealth) {
        this.stateOfHealth = stateOfHealth;
    }

    public String getSpecialties() {
        return specialties;
    }

    public void setSpecialties(String specialties) {
        this.specialties = specialties;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getNameOfLetters() {
        return nameOfLetters;
    }

    public void setNameOfLetters(String nameOfLetters) {
        this.nameOfLetters = nameOfLetters;
    }

    public String getQuickAccessCode() {
        return quickAccessCode;
    }

    public void setQuickAccessCode(String quickAccessCode) {
        this.quickAccessCode = quickAccessCode;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getDisabilityFlag() {
        return disabilityFlag;
    }

    public void setDisabilityFlag(String disabilityFlag) {
        this.disabilityFlag = disabilityFlag;
    }

    public String getImmigratedForeignFlag() {
        return immigratedForeignFlag;
    }

    public void setImmigratedForeignFlag(String immigratedForeignFlag) {
        this.immigratedForeignFlag = immigratedForeignFlag;
    }

    public String getPlanOfRetirementDate() {
        return planOfRetirementDate;
    }

    public void setPlanOfRetirementDate(String planOfRetirementDate) {
        this.planOfRetirementDate = planOfRetirementDate;
    }

    public String getOtherUserPersonType() {
        return otherUserPersonType;
    }

    public void setOtherUserPersonType(String otherUserPersonType) {
        this.otherUserPersonType = otherUserPersonType;
    }

    public String getInitialJobStartDate() {
        return initialJobStartDate;
    }

    public void setInitialJobStartDate(String initialJobStartDate) {
        this.initialJobStartDate = initialJobStartDate;
    }

    public String getWorkingAgesStartDate() {
        return workingAgesStartDate;
    }

    public void setWorkingAgesStartDate(String workingAgesStartDate) {
        this.workingAgesStartDate = workingAgesStartDate;
    }

    public String getIntervalWorkingAgesMonth() {
        return intervalWorkingAgesMonth;
    }

    public void setIntervalWorkingAgesMonth(String intervalWorkingAgesMonth) {
        this.intervalWorkingAgesMonth = intervalWorkingAgesMonth;
    }

    public String getInitialJobType() {
        return initialJobType;
    }

    public void setInitialJobType(String initialJobType) {
        this.initialJobType = initialJobType;
    }

    public String getJoinCucDate() {
        return joinCucDate;
    }

    public void setJoinCucDate(String joinCucDate) {
        this.joinCucDate = joinCucDate;
    }

    public String getJoinCucChannel() {
        return joinCucChannel;
    }

    public void setJoinCucChannel(String joinCucChannel) {
        this.joinCucChannel = joinCucChannel;
    }

    public String getJoinCucOtherChannel() {
        return joinCucOtherChannel;
    }

    public void setJoinCucOtherChannel(String joinCucOtherChannel) {
        this.joinCucOtherChannel = joinCucOtherChannel;
    }

    public String getStaffSortNum() {
        return staffSortNum;
    }

    public void setStaffSortNum(String staffSortNum) {
        this.staffSortNum = staffSortNum;
    }

    public String getEmployeeNumberOld() {
        return employeeNumberOld;
    }

    public void setEmployeeNumberOld(String employeeNumberOld) {
        this.employeeNumberOld = employeeNumberOld;
    }

    public String getUfidaSystemNumber() {
        return ufidaSystemNumber;
    }

    public void setUfidaSystemNumber(String ufidaSystemNumber) {
        this.ufidaSystemNumber = ufidaSystemNumber;
    }

    public String getUfidaSystemJoinChannel() {
        return ufidaSystemJoinChannel;
    }

    public void setUfidaSystemJoinChannel(String ufidaSystemJoinChannel) {
        this.ufidaSystemJoinChannel = ufidaSystemJoinChannel;
    }

    public String getJoinOfficeDate() {
        return joinOfficeDate;
    }

    public void setJoinOfficeDate(String joinOfficeDate) {
        this.joinOfficeDate = joinOfficeDate;
    }

    public String getAddStaffDate() {
        return addStaffDate;
    }

    public void setAddStaffDate(String addStaffDate) {
        this.addStaffDate = addStaffDate;
    }

    public String getAddStaffType() {
        return addStaffType;
    }

    public void setAddStaffType(String addStaffType) {
        this.addStaffType = addStaffType;
    }

    public String getAddStaffComments() {
        return addStaffComments;
    }

    public void setAddStaffComments(String addStaffComments) {
        this.addStaffComments = addStaffComments;
    }

    public String getSocialSecurityNum() {
        return socialSecurityNum;
    }

    public void setSocialSecurityNum(String socialSecurityNum) {
        this.socialSecurityNum = socialSecurityNum;
    }

    public long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(long createBy) {
        this.createBy = createBy;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(long updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

//    public String getAttribute1() {
//        return attribute1;
//    }
//
//    public void setAttribute1(String attribute1) {
//        this.attribute1 = attribute1;
//    }
//
//    public String getAttribute2() {
//        return attribute2;
//    }
//
//    public void setAttribute2(String attribute2) {
//        this.attribute2 = attribute2;
//    }
//
//    public String getAttribute3() {
//        return attribute3;
//    }
//
//    public void setAttribute3(String attribute3) {
//        this.attribute3 = attribute3;
//    }
//
//    public String getAttribute4() {
//        return attribute4;
//    }
//
//    public void setAttribute4(String attribute4) {
//        this.attribute4 = attribute4;
//    }
//
//    public String getAttribute5() {
//        return attribute5;
//    }
//
//    public void setAttribute5(String attribute5) {
//        this.attribute5 = attribute5;
//    }
//
//    public String getAttribute6() {
//        return attribute6;
//    }
//
//    public void setAttribute6(String attribute6) {
//        this.attribute6 = attribute6;
//    }
//
//    public String getAttribute7() {
//        return attribute7;
//    }
//
//    public void setAttribute7(String attribute7) {
//        this.attribute7 = attribute7;
//    }
//
//    public String getAttribute8() {
//        return attribute8;
//    }
//
//    public void setAttribute8(String attribute8) {
//        this.attribute8 = attribute8;
//    }
//
//    public String getAttribute9() {
//        return attribute9;
//    }
//
//    public void setAttribute9(String attribute9) {
//        this.attribute9 = attribute9;
//    }
//
//    public String getAttribute10() {
//        return attribute10;
//    }
//
//    public void setAttribute10(String attribute10) {
//        this.attribute10 = attribute10;
//    }

//    public String getSynchronizationState() {
//        return synchronizationState;
//    }
//
//    public void setSynchronizationState(String synchronizationState) {
//        this.synchronizationState = synchronizationState;
//    }

    public String getJoinCucChannelNew() {
        return joinCucChannelNew;
    }

    public void setJoinCucChannelNew(String joinCucChannelNew) {
        this.joinCucChannelNew = joinCucChannelNew;
    }

    public String getJoinCucOtherChannelNew() {
        return joinCucOtherChannelNew;
    }

    public void setJoinCucOtherChannelNew(String joinCucOtherChannelNew) {
        this.joinCucOtherChannelNew = joinCucOtherChannelNew;
    }

    public String getJoinCucChannelMarkNew() {
        return joinCucChannelMarkNew;
    }

    public void setJoinCucChannelMarkNew(String joinCucChannelMarkNew) {
        this.joinCucChannelMarkNew = joinCucChannelMarkNew;
    }

	public String getOpt() {
		return opt;
	}

	public void setOpt(String opt) {
		this.opt = opt;
	}

//    public String getPoliticsLandscapeName() {
//        return politicsLandscapeName;
//    }
//
//    public void setPoliticsLandscapeName(String politicsLandscapeName) {
//        this.politicsLandscapeName = politicsLandscapeName;
//    }

//    public String getEducationExperience() {
//        return educationExperience;
//    }
//
//    public void setEducationExperience(String educationExperience) {
//        this.educationExperience = educationExperience;
//    }

//    public String getDegree() {
//        return degree;
//    }
//
//    public void setDegree(String degree) {
//        this.degree = degree;
//    }

//    public String getStaffCategory() {
//        return staffCategory;
//    }
//
//    public void setStaffCategory(String staffCategory) {
//        this.staffCategory = staffCategory;
//    }
//
//    public String getAssignmentCategory() {
//        return assignmentCategory;
//    }
//
//    public void setAssignmentCategory(String assignmentCategory) {
//        this.assignmentCategory = assignmentCategory;
//    }
//
//    public String getJobName() {
//        return jobName;
//    }
//
//    public void setJobName(String jobName) {
//        this.jobName = jobName;
//    }
//
//    public String getQualificationLevel() {
//        return qualificationLevel;
//    }
//
//    public void setQualificationLevel(String qualificationLevel) {
//        this.qualificationLevel = qualificationLevel;
//    }
//
//    public String getGradeName() {
//        return gradeName;
//    }
//
//    public void setGradeName(String gradeName) {
//        this.gradeName = gradeName;
//    }
//
//    public String getPeopleGroup() {
//        return peopleGroup;
//    }
//
//    public void setPeopleGroup(String peopleGroup) {
//        this.peopleGroup = peopleGroup;
//    }
//
//    public String getPayRegulation() {
//        return payRegulation;
//    }
//
//    public void setPayRegulation(String payRegulation) {
//        this.payRegulation = payRegulation;
//    }
//
//    public String getEmailName() {
//        return emailName;
//    }
//
//    public void setEmailName(String emailName) {
//        this.emailName = emailName;
//    }
//
//    public String getAliasName() {
//        return aliasName;
//    }
//
//    public void setAliasName(String aliasName) {
//        this.aliasName = aliasName;
//    }
//
//    public String getJoinTelecomDate() {
//        return joinTelecomDate;
//    }
//
//    public void setJoinTelecomDate(String joinTelecomDate) {
//        this.joinTelecomDate = joinTelecomDate;
//    }

}
