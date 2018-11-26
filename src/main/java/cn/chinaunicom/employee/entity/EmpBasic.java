package cn.chinaunicom.employee.entity;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 员工基本信息Entity
 * </p>
 *
 * @author zhanggang
 * @since 2018-11-06
 */
@TableName("ehrbase_emp_basic")
@ApiModel("")
public class EmpBasic extends Model<EmpBasic> {

    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @TableId("person_id")
    private BigDecimal personId;
    /**
     * 所属组织id
     */
    @TableField("org_id")
    private BigDecimal orgId;
    /**
     * 人员类型Id
     */
    @TableField("person_type_id")
    private BigDecimal personTypeId;
    /**
     * 职务Id
     */
    @TableField("job_id")
    private BigDecimal jobId;
    
    @TableField("grade_id")
    private BigDecimal gradeId;
    
    @TableField("effective_start_date")
    private Date effectiveStartDate;
    
    @TableField("effective_end_date")
    private Date effectiveEndDate;
    /**
     * 员工编号
     */
    @TableField("employee_number")
    private String employeeNumber;
    /**
     * 姓名
     */
    @TableField("full_name")
    private String fullName;
    /**
     * 曾用名
     */
    @TableField("previous_name")
    private String previousName;
    /**
     * 性别
     * lookup_type = 'SEX'
     */
    private String sex;
    
    /**
     * 出生日期
     */
    @TableField("date_of_birth")
    private Date dateOfBirth;
    /**
     * 国籍
     */
    private String nationality;
    /**
     * 民族
     * lookup_type = 'CN_RACE'   hades_lookups 
     */
    private String nation;
    /**
     * 户籍省份
     */
    private String province;
    /**
     * 籍贯
     */
    @TableField("town_of_birth")
    private String townOfBirth;
    /**
     * 出生地
     */
    @TableField("region_of_birth")
    private String regionOfBirth;
    /**
     * 户口所在地
     */
    @TableField("household_register_place")
    private String householdRegisterPlace;
    @TableField("household_register_type")
    private String householdRegisterType;
    /**
     * 用工类型
     */
    @TableField("user_person_type")
    private String userPersonType;
    @TableField("national_identifier")
    private String nationalIdentifier;
    @TableField("state_of_health")
    private String stateOfHealth;
    private String specialties;
    private String hobbies;
    @TableField("marital_status")
    private String maritalStatus;
    @TableField("email_address")
    private String emailAddress;
    @TableField("english_name")
    private String englishName;
    @TableField("name_of_letters")
    private String nameOfLetters;
    @TableField("quick_access_code")
    private String quickAccessCode;
    @TableField("blood_type")
    private String bloodType;
    @TableField("disability_flag")
    private String disabilityFlag;
    @TableField("immigrated_foreign_flag")
    private String immigratedForeignFlag;
    @TableField("plan_of_retirement_date")
    private Date planOfRetirementDate;
    @TableField("other_user_person_type")
    private String otherUserPersonType;
    @TableField("initial_job_start_date")
    private Date initialJobStartDate;
    @TableField("working_ages_start_date")
    private Date workingAgesStartDate;
    @TableField("interval_working_ages_month")
    private String intervalWorkingAgesMonth;
    @TableField("initial_job_type")
    private String initialJobType;
    @TableField("join_cuc_date")
    private Date joinCucDate;
    @TableField("join_cuc_channel")
    private String joinCucChannel;
    @TableField("join_cuc_other_channel")
    private String joinCucOtherChannel;
    @TableField("staff_sort_num")
    private String staffSortNum;
    @TableField("employee_number_old")
    private String employeeNumberOld;
    @TableField("ufida_system_number")
    private String ufidaSystemNumber;
    @TableField("ufida_system_join_channel")
    private String ufidaSystemJoinChannel;
    @TableField("join_office_date")
    private Date joinOfficeDate;
    @TableField("add_staff_date")
    private Date addStaffDate;
    @TableField("add_staff_type")
    private String addStaffType;
    @TableField("add_staff_comments")
    private String addStaffComments;
    @TableField("social_security_num")
    private String socialSecurityNum;
    @TableField("create_by")
    private BigDecimal createBy;
    @TableField("create_date")
    private Date createDate;
    @TableField("update_by")
    private BigDecimal updateBy;
    @TableField("update_date")
    private Date updateDate;
    private String attribute1;
    private String attribute2;
    private String attribute3;
    private String attribute4;
    private String attribute5;
    private String attribute6;
    private String attribute7;
    private String attribute8;
    private String attribute9;
    private String attribute10;
    @TableField("synchronization_state")
    private String synchronizationState;
    @TableField("join_cuc_channel_new")
    private String joinCucChannelNew;
    @TableField("join_cuc_other_channel_new")
    private String joinCucOtherChannelNew;
    @TableField("join_cuc_channel_mark_new")
    private String joinCucChannelMarkNew;
    /**
     * 政治面貌(档案编码) 
     * hades_lookups  lookup_type = 'CN_PARTY_TYPE'
     */
    @TableField("politics_landscape_name")
    private String politicsLandscapeName;
    @TableField("education_experience")
    private String educationExperience;
    private String degree;
    @TableField("staff_category")
    private String staffCategory;
    @TableField("assignment_category")
    private String assignmentCategory;
    @TableField("job_name")
    private String jobName;
    @TableField("qualification_level")
    private String qualificationLevel;
    @TableField("grade_name")
    private String gradeName;
    @TableField("people_group")
    private String peopleGroup;
    @TableField("pay_regulation")
    private String payRegulation;
    @TableField("email_name")
    private String emailName;
    @TableField("alias_name")
    private String aliasName;
    @TableField("join_telecom_date")
    private String joinTelecomDate;


    public BigDecimal getPersonId() {
        return personId;
    }

    public void setPersonId(BigDecimal personId) {
        this.personId = personId;
    }

    public BigDecimal getOrgId() {
        return orgId;
    }

    public void setOrgId(BigDecimal orgId) {
        this.orgId = orgId;
    }

    public BigDecimal getPersonTypeId() {
        return personTypeId;
    }

    public void setPersonTypeId(BigDecimal personTypeId) {
        this.personTypeId = personTypeId;
    }

    public BigDecimal getJobId() {
        return jobId;
    }

    public void setJobId(BigDecimal jobId) {
        this.jobId = jobId;
    }

    public BigDecimal getGradeId() {
        return gradeId;
    }

    public void setGradeId(BigDecimal gradeId) {
        this.gradeId = gradeId;
    }

    public Date getEffectiveStartDate() {
        return effectiveStartDate;
    }

    public void setEffectiveStartDate(Date effectiveStartDate) {
        this.effectiveStartDate = effectiveStartDate;
    }

    public Date getEffectiveEndDate() {
        return effectiveEndDate;
    }

    public void setEffectiveEndDate(Date effectiveEndDate) {
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public Date getPlanOfRetirementDate() {
        return planOfRetirementDate;
    }

    public void setPlanOfRetirementDate(Date planOfRetirementDate) {
        this.planOfRetirementDate = planOfRetirementDate;
    }

    public String getOtherUserPersonType() {
        return otherUserPersonType;
    }

    public void setOtherUserPersonType(String otherUserPersonType) {
        this.otherUserPersonType = otherUserPersonType;
    }

    public Date getInitialJobStartDate() {
        return initialJobStartDate;
    }

    public void setInitialJobStartDate(Date initialJobStartDate) {
        this.initialJobStartDate = initialJobStartDate;
    }

    public Date getWorkingAgesStartDate() {
        return workingAgesStartDate;
    }

    public void setWorkingAgesStartDate(Date workingAgesStartDate) {
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

    public Date getJoinCucDate() {
        return joinCucDate;
    }

    public void setJoinCucDate(Date joinCucDate) {
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

    public Date getJoinOfficeDate() {
        return joinOfficeDate;
    }

    public void setJoinOfficeDate(Date joinOfficeDate) {
        this.joinOfficeDate = joinOfficeDate;
    }

    public Date getAddStaffDate() {
        return addStaffDate;
    }

    public void setAddStaffDate(Date addStaffDate) {
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

    public BigDecimal getCreateBy() {
        return createBy;
    }

    public void setCreateBy(BigDecimal createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public BigDecimal getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(BigDecimal updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }

    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8;
    }

    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9;
    }

    public String getAttribute10() {
        return attribute10;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10;
    }

    public String getSynchronizationState() {
        return synchronizationState;
    }

    public void setSynchronizationState(String synchronizationState) {
        this.synchronizationState = synchronizationState;
    }

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

    public String getPoliticsLandscapeName() {
        return politicsLandscapeName;
    }

    public void setPoliticsLandscapeName(String politicsLandscapeName) {
        this.politicsLandscapeName = politicsLandscapeName;
    }

    public String getEducationExperience() {
        return educationExperience;
    }

    public void setEducationExperience(String educationExperience) {
        this.educationExperience = educationExperience;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getStaffCategory() {
        return staffCategory;
    }

    public void setStaffCategory(String staffCategory) {
        this.staffCategory = staffCategory;
    }

    public String getAssignmentCategory() {
        return assignmentCategory;
    }

    public void setAssignmentCategory(String assignmentCategory) {
        this.assignmentCategory = assignmentCategory;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getQualificationLevel() {
        return qualificationLevel;
    }

    public void setQualificationLevel(String qualificationLevel) {
        this.qualificationLevel = qualificationLevel;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getPeopleGroup() {
        return peopleGroup;
    }

    public void setPeopleGroup(String peopleGroup) {
        this.peopleGroup = peopleGroup;
    }

    public String getPayRegulation() {
        return payRegulation;
    }

    public void setPayRegulation(String payRegulation) {
        this.payRegulation = payRegulation;
    }

    public String getEmailName() {
        return emailName;
    }

    public void setEmailName(String emailName) {
        this.emailName = emailName;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getJoinTelecomDate() {
        return joinTelecomDate;
    }

    public void setJoinTelecomDate(String joinTelecomDate) {
        this.joinTelecomDate = joinTelecomDate;
    }

    @Override
    protected Serializable pkVal() {
        return this.personId;
    }

    @Override
    public String toString() {
        return "EmpBasic{" +
        ", personId=" + personId +
        ", orgId=" + orgId +
        ", personTypeId=" + personTypeId +
        ", jobId=" + jobId +
        ", gradeId=" + gradeId +
        ", effectiveStartDate=" + effectiveStartDate +
        ", effectiveEndDate=" + effectiveEndDate +
        ", employeeNumber=" + employeeNumber +
        ", fullName=" + fullName +
        ", previousName=" + previousName +
        ", sex=" + sex +
        ", dateOfBirth=" + dateOfBirth +
        ", nationality=" + nationality +
        ", nation=" + nation +
        ", province=" + province +
        ", townOfBirth=" + townOfBirth +
        ", regionOfBirth=" + regionOfBirth +
        ", householdRegisterPlace=" + householdRegisterPlace +
        ", householdRegisterType=" + householdRegisterType +
        ", userPersonType=" + userPersonType +
        ", nationalIdentifier=" + nationalIdentifier +
        ", stateOfHealth=" + stateOfHealth +
        ", specialties=" + specialties +
        ", hobbies=" + hobbies +
        ", maritalStatus=" + maritalStatus +
        ", emailAddress=" + emailAddress +
        ", englishName=" + englishName +
        ", nameOfLetters=" + nameOfLetters +
        ", quickAccessCode=" + quickAccessCode +
        ", bloodType=" + bloodType +
        ", disabilityFlag=" + disabilityFlag +
        ", immigratedForeignFlag=" + immigratedForeignFlag +
        ", planOfRetirementDate=" + planOfRetirementDate +
        ", otherUserPersonType=" + otherUserPersonType +
        ", initialJobStartDate=" + initialJobStartDate +
        ", workingAgesStartDate=" + workingAgesStartDate +
        ", intervalWorkingAgesMonth=" + intervalWorkingAgesMonth +
        ", initialJobType=" + initialJobType +
        ", joinCucDate=" + joinCucDate +
        ", joinCucChannel=" + joinCucChannel +
        ", joinCucOtherChannel=" + joinCucOtherChannel +
        ", staffSortNum=" + staffSortNum +
        ", employeeNumberOld=" + employeeNumberOld +
        ", ufidaSystemNumber=" + ufidaSystemNumber +
        ", ufidaSystemJoinChannel=" + ufidaSystemJoinChannel +
        ", joinOfficeDate=" + joinOfficeDate +
        ", addStaffDate=" + addStaffDate +
        ", addStaffType=" + addStaffType +
        ", addStaffComments=" + addStaffComments +
        ", socialSecurityNum=" + socialSecurityNum +
        ", createBy=" + createBy +
        ", createDate=" + createDate +
        ", updateBy=" + updateBy +
        ", updateDate=" + updateDate +
        ", attribute1=" + attribute1 +
        ", attribute2=" + attribute2 +
        ", attribute3=" + attribute3 +
        ", attribute4=" + attribute4 +
        ", attribute5=" + attribute5 +
        ", attribute6=" + attribute6 +
        ", attribute7=" + attribute7 +
        ", attribute8=" + attribute8 +
        ", attribute9=" + attribute9 +
        ", attribute10=" + attribute10 +
        ", synchronizationState=" + synchronizationState +
        ", joinCucChannelNew=" + joinCucChannelNew +
        ", joinCucOtherChannelNew=" + joinCucOtherChannelNew +
        ", joinCucChannelMarkNew=" + joinCucChannelMarkNew +
        ", politicsLandscapeName=" + politicsLandscapeName +
        ", educationExperience=" + educationExperience +
        ", degree=" + degree +
        ", staffCategory=" + staffCategory +
        ", assignmentCategory=" + assignmentCategory +
        ", jobName=" + jobName +
        ", qualificationLevel=" + qualificationLevel +
        ", gradeName=" + gradeName +
        ", peopleGroup=" + peopleGroup +
        ", payRegulation=" + payRegulation +
        ", emailName=" + emailName +
        ", aliasName=" + aliasName +
        ", joinTelecomDate=" + joinTelecomDate +
        "}";
    }
}
