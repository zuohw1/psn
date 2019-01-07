package cn.chinaunicom.platform.service;

import cn.chinaunicom.platform.entity.BilltempletB;
import cn.chinaunicom.platform.service.IHrService;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhanggang
 * @since 2018-12-10
 */
public interface IBilltempletBService extends IHrService<BilltempletB> {

	public List<BilltempletB> getBilltempletBList();
	
	public Integer saveBilltempletB(BilltempletB entity);
	
	public Integer updateBilltempletB(BilltempletB entity);
	
	public Integer deleteBilltempletB(Long id);
	
	public List<BilltempletB> queryBillTemplateBListByParentId(String billTypeCode);
	
	public Map<String,List<Map<String,String>>> queryRefSelectDataByBillTypeCode(String billTypeCode);
	
}
