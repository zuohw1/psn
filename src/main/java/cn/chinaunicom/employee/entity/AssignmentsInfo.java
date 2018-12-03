package cn.chinaunicom.employee.entity;

import java.util.Date;

public class AssignmentsInfo{

	private Long finalId;
	
	// 分配信息id
	private Long assignmentId; // 数据库对应字段ASSIGNMENT_ID

	// 人员信息id
	private Long personId; // 数据库对应字段PERSON_ID

	//
	private Long organizationId; // 数据库对应字段ORGANIZATION_ID

	// 职位id
	private Long positionId; // 数据库对应字段POSITION_ID

	// 职务id
	private Long jobId; // 数据库对应字段JOB_ID

	// 来源组织id
	private Long sourceOrganizationId; // 数据库对应字段SOURCE_ORGANIZATION_ID

	// 分配起始日期
	private Date effectiveStartDate; // 数据库对应字段EFFECTIVE_START_DATE

	// 变动日期 即 分配结束日期
	private Date effectiveEndDate; // 数据库对应字段EFFECTIVE_END_DATE

	// 职级(级别)
	private Long gradeId; // 数据库对应字段GRADE_ID

	// 主要分配
	private String primaryFlag; // 数据库对应字段PRIMARY_FLAG

	// 分配序号
	private Long assignmentSequence; // 数据库对应字段ASSIGNMENT_SEQUENCE

	// 分配编码
	private String assignmentNumber; // 数据库对应字段ASSIGNMENT_NUMBER

	// 员工工作岗位的信息（集团统一）
	private String staffPostName; // 数据库对应字段STAFF_POST_NAME

	// 工资单
	private String payroll; // 数据库对应字段PAYROLL

	// 分配状态
	private String assignmentType; // 数据库对应字段ASSIGNMENT_TYPE

	// 分配类别
	private String assignmentCategory; // 数据库对应字段ASSIGNMENT_CATEGORY

	// 员工类别
	private String staffCategory; // 数据库对应字段STAFF_CATEGORY

	// 直线经理id
	private Long leaderId; // 数据库对应字段LEADER_ID

	// 直线经理编号
	private String leaderNum; // 数据库对应字段LEADER_NUM

	// 雇主
	private String employerName; // 数据库对应字段EMPLOYER_NAME

	// 纳税地区
	private String taxPlace; // 数据库对应字段TAX_PLACE

	// 社保摊缴地
	private String payOfSocialSecurityPlace; // 数据库对应字段PAY_OF_SOCIAL_SECURITY_PLACE
	
	private Long createBy; // CREATE_BY NUMBER Y

	private Date createDate; // CREATE_DATE DATE Y

	private Long updateBy; // UPDATE_BY NUMBER Y

	private Date updateDate; // UPDATE_DATE DATE Y

	private String operateType; // OPERATE_TYPE VARCHAR2(30) Y 操作类型

	private String operateOrder; // OPERATE_ORDER VARCHAR2(30) Y 操作顺序

	private String synchronizationState; // SYNCHRONIZATION_STATE VARCHAR2(30) Y 同步状态

	private Date synchronizationEndDate; // SYNCHRONIZATION_END_DATE DATE Y 同步完成时间
	
	private String peopleGroupId;
	private String companyName;
	private String peopleGroup;
	private String assignmentStatusTypeId;
	private String cucOrgMinCost;
	private String cucOrgMinPerType;
	private String attribute10;
	private String attribute9;
	
	
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
	public String getCucOrgMinCost() {
		return cucOrgMinCost;
	}
	public void setCucOrgMinCost(String cucOrgMinCost) {
		this.cucOrgMinCost = cucOrgMinCost;
	}
	public Long getFinalId() {
		return finalId;
	}
	public void setFinalId(Long finalId) {
		this.finalId = finalId;
	}
	public Long getAssignmentId() {
		return assignmentId;
	}
	public void setAssignmentId(Long assignmentId) {
		this.assignmentId = assignmentId;
	}
	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	public Long getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
	}
	public Long getPositionId() {
		return positionId;
	}
	public void setPositionId(Long positionId) {
		this.positionId = positionId;
	}
	public Long getJobId() {
		return jobId;
	}
	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}
	public Long getSourceOrganizationId() {
		return sourceOrganizationId;
	}
	public void setSourceOrganizationId(Long sourceOrganizationId) {
		this.sourceOrganizationId = sourceOrganizationId;
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
	public Long getGradeId() {
		return gradeId;
	}
	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}
	public String getPrimaryFlag() {
		return primaryFlag;
	}
	public void setPrimaryFlag(String primaryFlag) {
		this.primaryFlag = primaryFlag;
	}
	public Long getAssignmentSequence() {
		return assignmentSequence;
	}
	public void setAssignmentSequence(Long assignmentSequence) {
		this.assignmentSequence = assignmentSequence;
	}
	public String getAssignmentNumber() {
		return assignmentNumber;
	}
	public void setAssignmentNumber(String assignmentNumber) {
		this.assignmentNumber = assignmentNumber;
	}
	public String getStaffPostName() {
		return staffPostName;
	}
	public void setStaffPostName(String staffPostName) {
		this.staffPostName = staffPostName;
	}
	public String getPayroll() {
		return payroll;
	}
	public void setPayroll(String payroll) {
		this.payroll = payroll;
	}
	public String getAssignmentType() {
		return assignmentType;
	}
	public void setAssignmentType(String assignmentType) {
		this.assignmentType = assignmentType;
	}
	public String getAssignmentCategory() {
		return assignmentCategory;
	}
	public void setAssignmentCategory(String assignmentCategory) {
		this.assignmentCategory = assignmentCategory;
	}
	public String getStaffCategory() {
		return staffCategory;
	}
	public void setStaffCategory(String staffCategory) {
		this.staffCategory = staffCategory;
	}
	public Long getLeaderId() {
		return leaderId;
	}
	public void setLeaderId(Long leaderId) {
		this.leaderId = leaderId;
	}
	public String getLeaderNum() {
		return leaderNum;
	}
	public void setLeaderNum(String leaderNum) {
		this.leaderNum = leaderNum;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public String getTaxPlace() {
		return taxPlace;
	}
	public void setTaxPlace(String taxPlace) {
		this.taxPlace = taxPlace;
	}
	public String getPayOfSocialSecurityPlace() {
		return payOfSocialSecurityPlace;
	}
	public void setPayOfSocialSecurityPlace(String payOfSocialSecurityPlace) {
		this.payOfSocialSecurityPlace = payOfSocialSecurityPlace;
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
	public String getSynchronizationState() {
		return synchronizationState;
	}
	public void setSynchronizationState(String synchronizationState) {
		this.synchronizationState = synchronizationState;
	}
	public Date getSynchronizationEndDate() {
		return synchronizationEndDate;
	}
	public void setSynchronizationEndDate(Date synchronizationEndDate) {
		this.synchronizationEndDate = synchronizationEndDate;
	}
	public String getPeopleGroupId() {
		return peopleGroupId;
	}
	public void setPeopleGroupId(String peopleGroupId) {
		this.peopleGroupId = peopleGroupId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPeopleGroup() {
		return peopleGroup;
	}
	public void setPeopleGroup(String peopleGroup) {
		this.peopleGroup = peopleGroup;
	}
	public String getAssignmentStatusTypeId() {
		return assignmentStatusTypeId;
	}
	public void setAssignmentStatusTypeId(String assignmentStatusTypeId) {
		this.assignmentStatusTypeId = assignmentStatusTypeId;
	}
	public String getCucOrgMinPerType() {
		return cucOrgMinPerType;
	}
	public void setCucOrgMinPerType(String cucOrgMinPerType) {
		this.cucOrgMinPerType = cucOrgMinPerType;
	}
	
	
}
