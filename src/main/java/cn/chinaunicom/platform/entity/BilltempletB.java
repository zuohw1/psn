package cn.chinaunicom.platform.entity;

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
 * @since 2018-12-10
 */
@TableName("pub_billtemplet_b")
@ApiModel("")
public class BilltempletB extends Model<BilltempletB> {

    private static final long serialVersionUID = 1L;

    @TableField("pk_billtemplet")
    private Long pkBilltemplet;
    @TableId("pk_billtemplet_b")
    private Long pkBilltempletB;
    @TableField("item_type")
    private String itemType;
    /**
     * 字符串(Input)，字符串(Input#MobilePhone),字符串(Input#Email),字符串(Input#Phone),日期(DatePicker#Date)，数值(Input#Number)，下拉(Select)，复选框(CheckBox),参照(Input#Search),日期时间(DatePicker#DateTime)，
     */
     @ApiModelProperty(value="字符串(Input)，字符串(Input#MobilePhone),字符串(Input#Email),字符串(Input#Phone),日期(DatePicker#Date)，数值(Input#Number)，下拉(Select)，复选框(CheckBox),参照(Input#Search),日期时间(DatePicker#DateTime)，")
    @TableField("item_type_desc")
    private String itemTypeDesc;
    private Integer accuracy;
    private Integer max;
    private Integer min;
    @TableField("show_name")
    private String showName;
    private String defaultvalue;
    private Integer dr;
    private String editflag;
    private Integer inputlength;
    private String itemkey;
    @TableField("show_flag")
    private String showFlag;
    @TableField("null_flag")
    private String nullFlag;
    @TableField("select_type")
    private String selectType;
    private Integer showorder;
    @TableField("create_time")
    private Date createTime;
    @TableField("update_time")
    private Date updateTime;
    private Long creator;
    private Long modifier;
    private String def1;
    private String def2;
    private String def3;
    private String def4;
    private String def5;
    private String def6;
    private String def7;
    private String def8;
    private String def9;
    private String def10;


    public Long getPkBilltemplet() {
        return pkBilltemplet;
    }

    public void setPkBilltemplet(Long pkBilltemplet) {
        this.pkBilltemplet = pkBilltemplet;
    }

    public Long getPkBilltempletB() {
        return pkBilltempletB;
    }

    public void setPkBilltempletB(Long pkBilltempletB) {
        this.pkBilltempletB = pkBilltempletB;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemTypeDesc() {
        return itemTypeDesc;
    }

    public void setItemTypeDesc(String itemTypeDesc) {
        this.itemTypeDesc = itemTypeDesc;
    }

    public Integer getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getDefaultvalue() {
        return defaultvalue;
    }

    public void setDefaultvalue(String defaultvalue) {
        this.defaultvalue = defaultvalue;
    }

    public Integer getDr() {
        return dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }

    public String getEditflag() {
        return editflag;
    }

    public void setEditflag(String editflag) {
        this.editflag = editflag;
    }

    public Integer getInputlength() {
        return inputlength;
    }

    public void setInputlength(Integer inputlength) {
        this.inputlength = inputlength;
    }

    public String getItemkey() {
        return itemkey;
    }

    public void setItemkey(String itemkey) {
        this.itemkey = itemkey;
    }

    public String getShowFlag() {
        return showFlag;
    }

    public void setShowFlag(String showFlag) {
        this.showFlag = showFlag;
    }

    public String getNullFlag() {
        return nullFlag;
    }

    public void setNullFlag(String nullFlag) {
        this.nullFlag = nullFlag;
    }

    public String getSelectType() {
        return selectType;
    }

    public void setSelectType(String selectType) {
        this.selectType = selectType;
    }

    public Integer getShoworder() {
        return showorder;
    }

    public void setShoworder(Integer showorder) {
        this.showorder = showorder;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Long getModifier() {
        return modifier;
    }

    public void setModifier(Long modifier) {
        this.modifier = modifier;
    }

    public String getDef1() {
        return def1;
    }

    public void setDef1(String def1) {
        this.def1 = def1;
    }

    public String getDef2() {
        return def2;
    }

    public void setDef2(String def2) {
        this.def2 = def2;
    }

    public String getDef3() {
        return def3;
    }

    public void setDef3(String def3) {
        this.def3 = def3;
    }

    public String getDef4() {
        return def4;
    }

    public void setDef4(String def4) {
        this.def4 = def4;
    }

    public String getDef5() {
        return def5;
    }

    public void setDef5(String def5) {
        this.def5 = def5;
    }

    public String getDef6() {
        return def6;
    }

    public void setDef6(String def6) {
        this.def6 = def6;
    }

    public String getDef7() {
        return def7;
    }

    public void setDef7(String def7) {
        this.def7 = def7;
    }

    public String getDef8() {
        return def8;
    }

    public void setDef8(String def8) {
        this.def8 = def8;
    }

    public String getDef9() {
        return def9;
    }

    public void setDef9(String def9) {
        this.def9 = def9;
    }

    public String getDef10() {
        return def10;
    }

    public void setDef10(String def10) {
        this.def10 = def10;
    }

    @Override
    protected Serializable pkVal() {
        return this.pkBilltempletB;
    }

    @Override
    public String toString() {
        return "BilltempletB{" +
        ", pkBilltemplet=" + pkBilltemplet +
        ", pkBilltempletB=" + pkBilltempletB +
        ", itemType=" + itemType +
        ", itemTypeDesc=" + itemTypeDesc +
        ", accuracy=" + accuracy +
        ", max=" + max +
        ", min=" + min +
        ", showName=" + showName +
        ", defaultvalue=" + defaultvalue +
        ", dr=" + dr +
        ", editflag=" + editflag +
        ", inputlength=" + inputlength +
        ", itemkey=" + itemkey +
        ", showFlag=" + showFlag +
        ", nullFlag=" + nullFlag +
        ", selectType=" + selectType +
        ", showorder=" + showorder +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", creator=" + creator +
        ", modifier=" + modifier +
        ", def1=" + def1 +
        ", def2=" + def2 +
        ", def3=" + def3 +
        ", def4=" + def4 +
        ", def5=" + def5 +
        ", def6=" + def6 +
        ", def7=" + def7 +
        ", def8=" + def8 +
        ", def9=" + def9 +
        ", def10=" + def10 +
        "}";
    }
}
