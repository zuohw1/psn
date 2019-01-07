package cn.chinaunicom.defdoc.service;

import java.util.List;

import cn.chinaunicom.defdoc.entity.HadesLookups;
import cn.chinaunicom.platform.service.IHrService;

public interface IDefdocService extends IHrService<HadesLookups> {
	
	
	public List<HadesLookups> getMenuitemRegList();

}
