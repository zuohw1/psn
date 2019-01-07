package cn.chinaunicom.empassignments.entity;

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
 * 
 * </p>
 *
 * @author zhanggang
 * @since 2019-01-04
 */
@TableName("ehrbase_assignments_all_f")
@ApiModel("")
public class AssignmentsAllF extends Model<AssignmentsAllF> {

    private static final long serialVersionUID = 1L;

    @TableId("final_id")
    private Long finalId;
    @TableField("assignment_id")
    private Long assignmentId;
    @TableField("person_id")
    private Long personId;
    @TableField("organization_id")
    private Long organizationId;
    @TableField("position_id")
    private Long positionId;
    @TableField("job_id")
    private Long jobId;
    @TableField("source_organization_id")
    private Long sourceOrganizationId;
    @TableField("effective_start_date")
    private Date effectiveStartDate;
    @TableField("effective_end_date")
    private Date effectiveEndDate;
    @TableField("grade_id")
    private Long gradeId;
    @TableField("primary_flag")
    private String primaryFlag;
    @TableField("assignment_sequence")
    private Long assignmentSequence;
    @TableField("assignment_bigint")
    private String assignmentBigint;
    @TableField("staff_post_name")
    private String staffPostName;
    private String payroll;
    @TableField("assignment_type")
    private String assignmentType;
    @TableField("assignment_category")
    private String assignmentCategory;
    @TableField("staff_category")
    private String staffCategory;
    @TableField("leader_id")
    private Long leaderId;
    @TableField("leader_num")
    private String leaderNum;
    @TableField("employer_name")
    private String employerName;
    @TableField("tax_place")
    private String taxPlace;
    @TableField("pay_of_social_security_place")
    private String payOfSocialSecurityPlace;
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
    private String attribute4;
    private String attribute5;
    private String attribute6;
    private String attribute7;
    private String attribute8;
    private String attribute9;
    private String attribute10;
    @TableField("operate_type")
    private String operateType;
    @TableField("operate_order")
    private String operateOrder;
    @TableField("synchronization_state")
    private String synchronizationState;
    @TableField("synchronization_end_date")
    private Date synchronizationEndDate;
    @TableField("line_bigint")
    private String lineBigint;
    @TableField("synchronization_log")
    private String synchronizationLog;
    @TableField("is_realtime")
    private String isRealtime;
    @TableField("operate_state")
    private String operateState;
    @TableField("effective_update_start_date")
    private Date effectiveUpdateStartDate;
    @TableField("people_group_id")
    private Long peopleGroupId;
    @TableField("company_name")
    private String companyName;
    @TableField("people_group")
    private String peopleGroup;
    @TableField("effective_date")
    private Date effectiveDate;
    @TableField("cuc_org_min_cost")
    private String cucOrgMinCost;
    @TableField("cuc_org_min_per_type")
    private String cucOrgMinPerType;
    @TableField("ass_attribute23")
    private String assAttribute23;
    @TableField("ass_attribute24")
    private String assAttribute24;


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

    public String getAssignmentBigint() {
        return assignmentBigint;
    }

    public void setAssignmentBigint(String assignmentBigint) {
        this.assignmentBigint = assignmentBigint;
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

    public String getLineBigint() {
        return lineBigint;
    }

    public void setLineBigint(String lineBigint) {
        this.lineBigint = lineBigint;
    }

    public String getSynchronizationLog() {
        return synchronizationLog;
    }

    public void setSynchronizationLog(String synchronizationLog) {
        this.synchronizationLog = synchronizationLog;
    }

    public String getIsRealtime() {
        return isRealtime;
    }

    public void setIsRealtime(String isRealtime) {
        this.isRealtime = isRealtime;
    }

    public String getOperateState() {
        return operateState;
    }

    public void setOperateState(String operateState) {
        this.operateState = operateState;
    }

    public Date getEffectiveUpdateStartDate() {
        return effectiveUpdateStartDate;
    }

    public void setEffectiveUpdateStartDate(Date effectiveUpdateStartDate) {
        this.effectiveUpdateStartDate = effectiveUpdateStartDate;
    }

    public Long getPeopleGroupId() {
        return peopleGroupId;
    }

    public void setPeopleGroupId(Long peopleGroupId) {
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

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
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

    public String getAssAttribute23() {
        return assAttribute23;
    }

    public void setAssAttribute23(String assAttribute23) {
        this.assAttribute23 = assAttribute23;
    }

    public String getAssAttribute24() {
        return assAttribute24;
    }

    public void setAssAttribute24(String assAttribute24) {
        this.assAttribute24 = assAttribute24;
    }

    @Override
    protected Serializable pkVal() {
        return this.finalId;
    }

    @Override
    public String toString() {
        return "AssignmentsAllF{" +
        ", finalId=" + finalId +
        ", assignmentId=" + assignmentId +
        ", personId=" + personId +
        ", organizationId=" + organizationId +
        ", positionId=" + positionId +
        ", jobId=" + jobId +
        ", sourceOrganizationId=" + sourceOrganizationId +
        ", effectiveStartDate=" + effectiveStartDate +
        ", effectiveEndDate=" + effectiveEndDate +
        ", gradeId=" + gradeId +
        ", primaryFlag=" + primaryFlag +
        ", assignmentSequence=" + assignmentSequence +
        ", assignmentBigint=" + assignmentBigint +
        ", staffPostName=" + staffPostName +
        ", payroll=" + payroll +
        ", assignmentType=" + assignmentType +
        ", assignmentCategory=" + assignmentCategory +
        ", staffCategory=" + staffCategory +
        ", leaderId=" + leaderId +
        ", leaderNum=" + leaderNum +
        ", employerName=" + employerName +
        ", taxPlace=" + taxPlace +
        ", payOfSocialSecurityPlace=" + payOfSocialSecurityPlace +
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
        ", synchronizationState=" + synchronizationState +
        ", synchronizationEndDate=" + synchronizationEndDate +
        ", lineBigint=" + lineBigint +
        ", synchronizationLog=" + synchronizationLog +
        ", isRealtime=" + isRealtime +
        ", operateState=" + operateState +
        ", effectiveUpdateStartDate=" + effectiveUpdateStartDate +
        ", peopleGroupId=" + peopleGroupId +
        ", companyName=" + companyName +
        ", peopleGroup=" + peopleGroup +
        ", effectiveDate=" + effectiveDate +
        ", cucOrgMinCost=" + cucOrgMinCost +
        ", cucOrgMinPerType=" + cucOrgMinPerType +
        ", assAttribute23=" + assAttribute23 +
        ", assAttribute24=" + assAttribute24 +
        "}";
    }
}
