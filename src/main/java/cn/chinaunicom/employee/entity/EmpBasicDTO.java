package cn.chinaunicom.employee.entity;

public class EmpBasicDTO {
	
	private String itemKey ;
	private String dispName;
	private Object value;
	
	public EmpBasicDTO(String itemKey, String dispName, Object value) {
		super();
		this.itemKey = itemKey;
		this.dispName = dispName;
		this.value = value;
	}
	public String getItemKey() {
		return itemKey;
	}
	public void setItemKey(String itemKey) {
		this.itemKey = itemKey;
	}
	public String getDispName() {
		return dispName;
	}
	public void setDispName(String dispName) {
		this.dispName = dispName;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	

}
