package cn.chinaunicom.defdoc.entity;

import java.io.Serializable;

public class HadesLookups implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * 值集信息Id
	 */
	private Long lookupId;

	/*
	 * 值集类型
	 */
	private String lookupType;
	
	/*
	 * 值集代码
	 */
	private String lookupCode;
	
	/*
	 * 值集含义
	 */
	private String meaning;
	
	
	/*
	 * 默认构造方法
	 */
	public HadesLookups(){}

	

	/*
	 * get.set方法
	 */
	public Long getLookupId() {
		return lookupId;
	}

	public void setLookupId(Long lookupId) {
		this.lookupId = lookupId;
	}

	public String getLookupType() {
		return lookupType;
	}

	public void setLookupType(String lookupType) {
		this.lookupType = lookupType;
	}

	public String getLookupCode() {
		return lookupCode;
	}

	public void setLookupCode(String lookupCode) {
		this.lookupCode = lookupCode;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

}
