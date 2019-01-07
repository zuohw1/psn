package cn.chinaunicom.employee.entity;

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
 * @since 2019-01-03
 */
@TableName("ehrbase_emp_educations")
@ApiModel("")
public class EmpEducations extends Model<EmpEducations> {

    private static final long serialVersionUID = 1L;

    @TableId("emp_education_id")
    private Long empEducationId;
    @TableField("person_id")
    private Long personId;
    @TableField("educated_start_date")
    private Date educatedStartDate;
    @TableField("educated_end_date")
    private Date educatedEndDate;
    @TableField("college_id")
    private Long collegeId;
    @TableField("college_name")
    private String collegeName;
    @TableField("full_time_flag")
    private String fullTimeFlag;
    private String profession;
    @TableField("education_experience")
    private String educationExperience;
    private String degree;
    @TableField("educated_info")
    private String educatedInfo;
    @TableField("learning_forms")
    private String learningForms;
    @TableField("degree_date")
    private Date degreeDate;
    @TableField("degree_type")
    private String degreeType;
    @TableField("second_degree_type")
    private String secondDegreeType;
    @TableField("work_education_flag")
    private String workEducationFlag;
    @TableField("education_high_flag")
    private String educationHighFlag;
    @TableField("degree_high_flag")
    private String degreeHighFlag;
    @TableField("education_certificate_num")
    private String educationCertificateNum;
    @TableField("college_of_degree")
    private String collegeOfDegree;
    @TableField("degree_certificate_num")
    private String degreeCertificateNum;
    @TableField("same_education_experience")
    private String sameEducationExperience;
    @TableField("equal_graduated")
    private String equalGraduated;
    @TableField("profession_type")
    private String professionType;
    @TableField("profession_second_type")
    private String professionSecondType;
    @TableField("profession_second")
    private String professionSecond;
    @TableField("period_of_schooling")
    private String periodOfSchooling;
    private String description;
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
    @TableField("synchronization_state")
    private String synchronizationState;


    public Long getEmpEducationId() {
        return empEducationId;
    }

    public void setEmpEducationId(Long empEducationId) {
        this.empEducationId = empEducationId;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Date getEducatedStartDate() {
        return educatedStartDate;
    }

    public void setEducatedStartDate(Date educatedStartDate) {
        this.educatedStartDate = educatedStartDate;
    }

    public Date getEducatedEndDate() {
        return educatedEndDate;
    }

    public void setEducatedEndDate(Date educatedEndDate) {
        this.educatedEndDate = educatedEndDate;
    }

    public Long getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Long collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getFullTimeFlag() {
        return fullTimeFlag;
    }

    public void setFullTimeFlag(String fullTimeFlag) {
        this.fullTimeFlag = fullTimeFlag;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
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

    public String getEducatedInfo() {
        return educatedInfo;
    }

    public void setEducatedInfo(String educatedInfo) {
        this.educatedInfo = educatedInfo;
    }

    public String getLearningForms() {
        return learningForms;
    }

    public void setLearningForms(String learningForms) {
        this.learningForms = learningForms;
    }

    public Date getDegreeDate() {
        return degreeDate;
    }

    public void setDegreeDate(Date degreeDate) {
        this.degreeDate = degreeDate;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getSecondDegreeType() {
        return secondDegreeType;
    }

    public void setSecondDegreeType(String secondDegreeType) {
        this.secondDegreeType = secondDegreeType;
    }

    public String getWorkEducationFlag() {
        return workEducationFlag;
    }

    public void setWorkEducationFlag(String workEducationFlag) {
        this.workEducationFlag = workEducationFlag;
    }

    public String getEducationHighFlag() {
        return educationHighFlag;
    }

    public void setEducationHighFlag(String educationHighFlag) {
        this.educationHighFlag = educationHighFlag;
    }

    public String getDegreeHighFlag() {
        return degreeHighFlag;
    }

    public void setDegreeHighFlag(String degreeHighFlag) {
        this.degreeHighFlag = degreeHighFlag;
    }

    public String getEducationCertificateNum() {
        return educationCertificateNum;
    }

    public void setEducationCertificateNum(String educationCertificateNum) {
        this.educationCertificateNum = educationCertificateNum;
    }

    public String getCollegeOfDegree() {
        return collegeOfDegree;
    }

    public void setCollegeOfDegree(String collegeOfDegree) {
        this.collegeOfDegree = collegeOfDegree;
    }

    public String getDegreeCertificateNum() {
        return degreeCertificateNum;
    }

    public void setDegreeCertificateNum(String degreeCertificateNum) {
        this.degreeCertificateNum = degreeCertificateNum;
    }

    public String getSameEducationExperience() {
        return sameEducationExperience;
    }

    public void setSameEducationExperience(String sameEducationExperience) {
        this.sameEducationExperience = sameEducationExperience;
    }

    public String getEqualGraduated() {
        return equalGraduated;
    }

    public void setEqualGraduated(String equalGraduated) {
        this.equalGraduated = equalGraduated;
    }

    public String getProfessionType() {
        return professionType;
    }

    public void setProfessionType(String professionType) {
        this.professionType = professionType;
    }

    public String getProfessionSecondType() {
        return professionSecondType;
    }

    public void setProfessionSecondType(String professionSecondType) {
        this.professionSecondType = professionSecondType;
    }

    public String getProfessionSecond() {
        return professionSecond;
    }

    public void setProfessionSecond(String professionSecond) {
        this.professionSecond = professionSecond;
    }

    public String getPeriodOfSchooling() {
        return periodOfSchooling;
    }

    public void setPeriodOfSchooling(String periodOfSchooling) {
        this.periodOfSchooling = periodOfSchooling;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getSynchronizationState() {
        return synchronizationState;
    }

    public void setSynchronizationState(String synchronizationState) {
        this.synchronizationState = synchronizationState;
    }

    @Override
    protected Serializable pkVal() {
        return this.empEducationId;
    }

    @Override
    public String toString() {
        return "EmpEducations{" +
        ", empEducationId=" + empEducationId +
        ", personId=" + personId +
        ", educatedStartDate=" + educatedStartDate +
        ", educatedEndDate=" + educatedEndDate +
        ", collegeId=" + collegeId +
        ", collegeName=" + collegeName +
        ", fullTimeFlag=" + fullTimeFlag +
        ", profession=" + profession +
        ", educationExperience=" + educationExperience +
        ", degree=" + degree +
        ", educatedInfo=" + educatedInfo +
        ", learningForms=" + learningForms +
        ", degreeDate=" + degreeDate +
        ", degreeType=" + degreeType +
        ", secondDegreeType=" + secondDegreeType +
        ", workEducationFlag=" + workEducationFlag +
        ", educationHighFlag=" + educationHighFlag +
        ", degreeHighFlag=" + degreeHighFlag +
        ", educationCertificateNum=" + educationCertificateNum +
        ", collegeOfDegree=" + collegeOfDegree +
        ", degreeCertificateNum=" + degreeCertificateNum +
        ", sameEducationExperience=" + sameEducationExperience +
        ", equalGraduated=" + equalGraduated +
        ", professionType=" + professionType +
        ", professionSecondType=" + professionSecondType +
        ", professionSecond=" + professionSecond +
        ", periodOfSchooling=" + periodOfSchooling +
        ", description=" + description +
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
        "}";
    }
}
