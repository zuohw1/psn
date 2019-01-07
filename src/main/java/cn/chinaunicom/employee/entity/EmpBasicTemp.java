package cn.chinaunicom.employee.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.sql.Blob;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 流程审批结束后用户基本信息表
 * </p>
 *
 * @author zhanggang
 * @since 2019-01-04
 */
@TableName("ehrbase_emp_basic_temp")
@ApiModel("流程审批结束后用户基本信息表")
public class EmpBasicTemp extends Model<EmpBasicTemp> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
     @ApiModelProperty(value="主键")
    @TableId("temp_id")
    private Long tempId;
    @TableField("instance_guid")
    private String instanceGuid;
    /**
     * 人员ID
     */
     @ApiModelProperty(value="人员ID")
    @TableField("person_id")
    private Long personId;
    /**
     * 组织ID
     */
     @ApiModelProperty(value="组织ID")
    @TableField("org_id")
    private Long orgId;
    @TableField("person_type_id")
    private Integer personTypeId;
    @TableField("effective_start_date")
    private Date effectiveStartDate;
    @TableField("effective_end_date")
    private Date effectiveEndDate;
    /**
     * 员工编码
     */
     @ApiModelProperty(value="员工编码")
    @TableField("employee_number")
    private String employeeNumber;
    @TableField("full_name")
    private String fullName;
    @TableField("previous_name")
    private String previousName;
    private String sex;
    @TableField("date_of_birth")
    private Date dateOfBirth;
    private String nationality;
    private String nation;
    private String province;
    @TableField("town_of_birth")
    private String townOfBirth;
    @TableField("region_of_birth")
    private String regionOfBirth;
    @TableField("household_register_place")
    private String householdRegisterPlace;
    @TableField("household_register_type")
    private String householdRegisterType;
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
    private Long createBy;
    @TableField("create_date")
    private Date createDate;
    @TableField("update_by")
    private Long updateBy;
    @TableField("update_date")
    private Date updateDate;
    private String attribute1;
    private String attribute2;
    private String attribute3;
    /**
     * title组织
     */
     @ApiModelProperty(value="title组织")
    private String attribute4;
    /**
     * 原组织Id（业务工作记录查询用）
     */
     @ApiModelProperty(value="原组织Id（业务工作记录查询用）")
    private String attribute5;
    /**
     * 输入组织
     */
     @ApiModelProperty(value="输入组织")
    private String attribute6;
    /**
     * 因。。。原因
     */
     @ApiModelProperty(value="因。。。原因")
    private String attribute7;
    /**
     * 报道组织
     */
     @ApiModelProperty(value="报道组织")
    private String attribute8;
    /**
     * 成文日期
     */
     @ApiModelProperty(value="成文日期")
    private String attribute9;
    private String attribute10;
    @TableField("operate_type")
    private String operateType;
    @TableField("operate_order")
    private String operateOrder;
    @TableField("job_id")
    private Long jobId;
    @TableField("grade_id")
    private Long gradeId;
    @TableField("operate_state")
    private String operateState;
    @TableField("is_realtime")
    private String isRealtime;
    @TableField("effective_update_start_date")
    private Date effectiveUpdateStartDate;
    @TableField("assignment_id")
    private Long assignmentId;
    @TableField("employee_category")
    private String employeeCategory;
    @TableField("assignment_type")
    private String assignmentType;
    @TableField("business_type")
    private String businessType;
    @TableField("notice_name_id")
    private Long noticeNameId;
    @TableField("phone_flag")
    private String phoneFlag;
    @TableField("email_flag")
    private String emailFlag;
    @TableField("batch_num")
    private String batchNum;
    @TableField("is_pass")
    private String isPass;
    @TableField("document_name")
    private String documentName;
    @TableField("document_files")
    private Blob documentFiles;
    @TableField("line_number")
    private String lineNumber;
    @TableField("go_org_id")
    private Long goOrgId;
    private Long respid;
    @TableField("verson_num")
    private String versonNum;
    @TableField("wf_state")
    private String wfState;
    @TableField("special_mark")
    private String specialMark;
    @TableField("join_cuc_channel_new")
    private String joinCucChannelNew;
    @TableField("join_cuc_other_channel_new")
    private String joinCucOtherChannelNew;
    @TableField("join_cuc_channel_mark_new")
    private String joinCucChannelMarkNew;
    @TableField("join_cuc_date_new")
    private Date joinCucDateNew;
    @TableField("job_name")
    private String jobName;
    @TableField("post_date")
    private Date postDate;
    @TableField("assignment_category")
    private String assignmentCategory;
    @TableField("phone_number")
    private String phoneNumber;
    @TableField("level_type")
    private String levelType;
    @TableField("job_flag")
    private String jobFlag;
    @TableField("grade_flag")
    private String gradeFlag;
    @TableField("payroll_flag")
    private String payrollFlag;
    @TableField("notice_name_id2")
    private Long noticeNameId2;
    private String reportedtable;
    private String commitdatevalue;
    private String gridunit;
    private String iscounty;
    @TableField("cuc_org_min_cost")
    private String cucOrgMinCost;
    @TableField("cuc_org_min_per_type")
    private String cucOrgMinPerType;
    @TableField("min_unit")
    private String minUnit;
    @TableField("is_exceptional_hired")
    private String isExceptionalHired;
    @TableField("wf_status1")
    private String wfStatus1;
    @TableField("operator_type1")
    private String operatorType1;
    private String firstnum;
    private String contractnum;
    private String archivesnum;
    private String positionnum;
    private String salarynum;
    @TableField("document_fileid")
    private String documentFileid;
    @TableField("document_filename")
    private String documentFilename;
    private String wfremark;
    private String remark;
    @TableField("pay_regulation")
    private String payRegulation;
    @TableField("email_name")
    private String emailName;
    @TableField("alias_name")
    private String aliasName;
    @TableField("join_telecom_date")
    private Date joinTelecomDate;
    @TableField("post_select_start_date")
    private Date postSelectStartDate;
    @TableField("post_select_end_date")
    private Date postSelectEndDate;
    @TableField("post_wait_start_date")
    private Date postWaitStartDate;
    @TableField("wait_post_reason")
    private String waitPostReason;
    @TableField("post_wait_end_date")
    private Date postWaitEndDate;


    public Long getTempId() {
        return tempId;
    }

    public void setTempId(Long tempId) {
        this.tempId = tempId;
    }

    public String getInstanceGuid() {
        return instanceGuid;
    }

    public void setInstanceGuid(String instanceGuid) {
        this.instanceGuid = instanceGuid;
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

    public Integer getPersonTypeId() {
        return personTypeId;
    }

    public void setPersonTypeId(Integer personTypeId) {
        this.personTypeId = personTypeId;
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

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
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

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public String getOperateOrder() {
        return operateOrder;
    }

    public void setOperateOrder(String operateOrder) {
        this.operateOrder = operateOrder;
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

    public String getOperateState() {
        return operateState;
    }

    public void setOperateState(String operateState) {
        this.operateState = operateState;
    }

    public String getIsRealtime() {
        return isRealtime;
    }

    public void setIsRealtime(String isRealtime) {
        this.isRealtime = isRealtime;
    }

    public Date getEffectiveUpdateStartDate() {
        return effectiveUpdateStartDate;
    }

    public void setEffectiveUpdateStartDate(Date effectiveUpdateStartDate) {
        this.effectiveUpdateStartDate = effectiveUpdateStartDate;
    }

    public Long getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Long assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getEmployeeCategory() {
        return employeeCategory;
    }

    public void setEmployeeCategory(String employeeCategory) {
        this.employeeCategory = employeeCategory;
    }

    public String getAssignmentType() {
        return assignmentType;
    }

    public void setAssignmentType(String assignmentType) {
        this.assignmentType = assignmentType;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public Long getNoticeNameId() {
        return noticeNameId;
    }

    public void setNoticeNameId(Long noticeNameId) {
        this.noticeNameId = noticeNameId;
    }

    public String getPhoneFlag() {
        return phoneFlag;
    }

    public void setPhoneFlag(String phoneFlag) {
        this.phoneFlag = phoneFlag;
    }

    public String getEmailFlag() {
        return emailFlag;
    }

    public void setEmailFlag(String emailFlag) {
        this.emailFlag = emailFlag;
    }

    public String getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(String batchNum) {
        this.batchNum = batchNum;
    }

    public String getIsPass() {
        return isPass;
    }

    public void setIsPass(String isPass) {
        this.isPass = isPass;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public Blob getDocumentFiles() {
        return documentFiles;
    }

    public void setDocumentFiles(Blob documentFiles) {
        this.documentFiles = documentFiles;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Long getGoOrgId() {
        return goOrgId;
    }

    public void setGoOrgId(Long goOrgId) {
        this.goOrgId = goOrgId;
    }

    public Long getRespid() {
        return respid;
    }

    public void setRespid(Long respid) {
        this.respid = respid;
    }

    public String getVersonNum() {
        return versonNum;
    }

    public void setVersonNum(String versonNum) {
        this.versonNum = versonNum;
    }

    public String getWfState() {
        return wfState;
    }

    public void setWfState(String wfState) {
        this.wfState = wfState;
    }

    public String getSpecialMark() {
        return specialMark;
    }

    public void setSpecialMark(String specialMark) {
        this.specialMark = specialMark;
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

    public Date getJoinCucDateNew() {
        return joinCucDateNew;
    }

    public void setJoinCucDateNew(Date joinCucDateNew) {
        this.joinCucDateNew = joinCucDateNew;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public String getAssignmentCategory() {
        return assignmentCategory;
    }

    public void setAssignmentCategory(String assignmentCategory) {
        this.assignmentCategory = assignmentCategory;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLevelType() {
        return levelType;
    }

    public void setLevelType(String levelType) {
        this.levelType = levelType;
    }

    public String getJobFlag() {
        return jobFlag;
    }

    public void setJobFlag(String jobFlag) {
        this.jobFlag = jobFlag;
    }

    public String getGradeFlag() {
        return gradeFlag;
    }

    public void setGradeFlag(String gradeFlag) {
        this.gradeFlag = gradeFlag;
    }

    public String getPayrollFlag() {
        return payrollFlag;
    }

    public void setPayrollFlag(String payrollFlag) {
        this.payrollFlag = payrollFlag;
    }

    public Long getNoticeNameId2() {
        return noticeNameId2;
    }

    public void setNoticeNameId2(Long noticeNameId2) {
        this.noticeNameId2 = noticeNameId2;
    }

    public String getReportedtable() {
        return reportedtable;
    }

    public void setReportedtable(String reportedtable) {
        this.reportedtable = reportedtable;
    }

    public String getCommitdatevalue() {
        return commitdatevalue;
    }

    public void setCommitdatevalue(String commitdatevalue) {
        this.commitdatevalue = commitdatevalue;
    }

    public String getGridunit() {
        return gridunit;
    }

    public void setGridunit(String gridunit) {
        this.gridunit = gridunit;
    }

    public String getIscounty() {
        return iscounty;
    }

    public void setIscounty(String iscounty) {
        this.iscounty = iscounty;
    }

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

    public String getMinUnit() {
        return minUnit;
    }

    public void setMinUnit(String minUnit) {
        this.minUnit = minUnit;
    }

    public String getIsExceptionalHired() {
        return isExceptionalHired;
    }

    public void setIsExceptionalHired(String isExceptionalHired) {
        this.isExceptionalHired = isExceptionalHired;
    }

    public String getWfStatus1() {
        return wfStatus1;
    }

    public void setWfStatus1(String wfStatus1) {
        this.wfStatus1 = wfStatus1;
    }

    public String getOperatorType1() {
        return operatorType1;
    }

    public void setOperatorType1(String operatorType1) {
        this.operatorType1 = operatorType1;
    }

    public String getFirstnum() {
        return firstnum;
    }

    public void setFirstnum(String firstnum) {
        this.firstnum = firstnum;
    }

    public String getContractnum() {
        return contractnum;
    }

    public void setContractnum(String contractnum) {
        this.contractnum = contractnum;
    }

    public String getArchivesnum() {
        return archivesnum;
    }

    public void setArchivesnum(String archivesnum) {
        this.archivesnum = archivesnum;
    }

    public String getPositionnum() {
        return positionnum;
    }

    public void setPositionnum(String positionnum) {
        this.positionnum = positionnum;
    }

    public String getSalarynum() {
        return salarynum;
    }

    public void setSalarynum(String salarynum) {
        this.salarynum = salarynum;
    }

    public String getDocumentFileid() {
        return documentFileid;
    }

    public void setDocumentFileid(String documentFileid) {
        this.documentFileid = documentFileid;
    }

    public String getDocumentFilename() {
        return documentFilename;
    }

    public void setDocumentFilename(String documentFilename) {
        this.documentFilename = documentFilename;
    }

    public String getWfremark() {
        return wfremark;
    }

    public void setWfremark(String wfremark) {
        this.wfremark = wfremark;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Date getJoinTelecomDate() {
        return joinTelecomDate;
    }

    public void setJoinTelecomDate(Date joinTelecomDate) {
        this.joinTelecomDate = joinTelecomDate;
    }

    public Date getPostSelectStartDate() {
        return postSelectStartDate;
    }

    public void setPostSelectStartDate(Date postSelectStartDate) {
        this.postSelectStartDate = postSelectStartDate;
    }

    public Date getPostSelectEndDate() {
        return postSelectEndDate;
    }

    public void setPostSelectEndDate(Date postSelectEndDate) {
        this.postSelectEndDate = postSelectEndDate;
    }

    public Date getPostWaitStartDate() {
        return postWaitStartDate;
    }

    public void setPostWaitStartDate(Date postWaitStartDate) {
        this.postWaitStartDate = postWaitStartDate;
    }

    public String getWaitPostReason() {
        return waitPostReason;
    }

    public void setWaitPostReason(String waitPostReason) {
        this.waitPostReason = waitPostReason;
    }

    public Date getPostWaitEndDate() {
        return postWaitEndDate;
    }

    public void setPostWaitEndDate(Date postWaitEndDate) {
        this.postWaitEndDate = postWaitEndDate;
    }

    @Override
    protected Serializable pkVal() {
        return this.tempId;
    }

    @Override
    public String toString() {
        return "EmpBasicTemp{" +
        ", tempId=" + tempId +
        ", instanceGuid=" + instanceGuid +
        ", personId=" + personId +
        ", orgId=" + orgId +
        ", personTypeId=" + personTypeId +
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
        ", operateType=" + operateType +
        ", operateOrder=" + operateOrder +
        ", jobId=" + jobId +
        ", gradeId=" + gradeId +
        ", operateState=" + operateState +
        ", isRealtime=" + isRealtime +
        ", effectiveUpdateStartDate=" + effectiveUpdateStartDate +
        ", assignmentId=" + assignmentId +
        ", employeeCategory=" + employeeCategory +
        ", assignmentType=" + assignmentType +
        ", businessType=" + businessType +
        ", noticeNameId=" + noticeNameId +
        ", phoneFlag=" + phoneFlag +
        ", emailFlag=" + emailFlag +
        ", batchNum=" + batchNum +
        ", isPass=" + isPass +
        ", documentName=" + documentName +
        ", documentFiles=" + documentFiles +
        ", lineNumber=" + lineNumber +
        ", goOrgId=" + goOrgId +
        ", respid=" + respid +
        ", versonNum=" + versonNum +
        ", wfState=" + wfState +
        ", specialMark=" + specialMark +
        ", joinCucChannelNew=" + joinCucChannelNew +
        ", joinCucOtherChannelNew=" + joinCucOtherChannelNew +
        ", joinCucChannelMarkNew=" + joinCucChannelMarkNew +
        ", joinCucDateNew=" + joinCucDateNew +
        ", jobName=" + jobName +
        ", postDate=" + postDate +
        ", assignmentCategory=" + assignmentCategory +
        ", phoneNumber=" + phoneNumber +
        ", levelType=" + levelType +
        ", jobFlag=" + jobFlag +
        ", gradeFlag=" + gradeFlag +
        ", payrollFlag=" + payrollFlag +
        ", noticeNameId2=" + noticeNameId2 +
        ", reportedtable=" + reportedtable +
        ", commitdatevalue=" + commitdatevalue +
        ", gridunit=" + gridunit +
        ", iscounty=" + iscounty +
        ", cucOrgMinCost=" + cucOrgMinCost +
        ", cucOrgMinPerType=" + cucOrgMinPerType +
        ", minUnit=" + minUnit +
        ", isExceptionalHired=" + isExceptionalHired +
        ", wfStatus1=" + wfStatus1 +
        ", operatorType1=" + operatorType1 +
        ", firstnum=" + firstnum +
        ", contractnum=" + contractnum +
        ", archivesnum=" + archivesnum +
        ", positionnum=" + positionnum +
        ", salarynum=" + salarynum +
        ", documentFileid=" + documentFileid +
        ", documentFilename=" + documentFilename +
        ", wfremark=" + wfremark +
        ", remark=" + remark +
        ", payRegulation=" + payRegulation +
        ", emailName=" + emailName +
        ", aliasName=" + aliasName +
        ", joinTelecomDate=" + joinTelecomDate +
        ", postSelectStartDate=" + postSelectStartDate +
        ", postSelectEndDate=" + postSelectEndDate +
        ", postWaitStartDate=" + postWaitStartDate +
        ", waitPostReason=" + waitPostReason +
        ", postWaitEndDate=" + postWaitEndDate +
        "}";
    }
}
