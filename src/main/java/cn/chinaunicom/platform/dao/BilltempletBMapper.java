package cn.chinaunicom.platform.dao;

import cn.chinaunicom.platform.entity.BilltempletB;

import java.util.List;
import java.util.Map;

import cn.chinaunicom.platform.dao.HrBaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhanggang
 * @since 2018-12-10
 */
public interface BilltempletBMapper extends HrBaseMapper<BilltempletB> {
	
	
	List<BilltempletB> queryBillTemplateBListByParentId(Map<String,Object> params) ;

}
