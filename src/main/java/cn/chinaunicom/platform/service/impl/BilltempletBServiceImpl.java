package cn.chinaunicom.platform.service.impl;

import cn.chinaunicom.platform.entity.BilltempletB;
import cn.chinaunicom.platform.dao.BilltempletBMapper;
import cn.chinaunicom.platform.service.BilltempletBService;
import cn.chinaunicom.platform.service.impl.HrServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.mapper.EntityWrapper;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhanggang
 * @since 2018-12-10
 */
@Service
public class BilltempletBServiceImpl extends HrServiceImpl<BilltempletBMapper, BilltempletB> implements BilltempletBService {

	@Autowired
	BilltempletBMapper mapper;
	
	@Override
	public List<BilltempletB> getBilltempletBList() {
		return mapper.selectList(new EntityWrapper<BilltempletB>().eq("1", "1"));
	}

	@Override
	public Integer saveBilltempletB(BilltempletB entity) {
		return mapper.insert(entity);
	}
	
	@Override
	public Integer updateBilltempletB(BilltempletB entity) {
		return mapper.updateById(entity);
	}
	
	@Override
	public Integer deleteBilltempletB(Long id) {
		return mapper.deleteById(id);
	}

	@Override
	public List<BilltempletB> queryBillTemplateBListByParentId(String billTypeCode) {
		
		if(StringUtils.isNotEmpty(billTypeCode)) {
			
			Map<String,Object> params = new HashMap<String,Object>();
			params.put("billTypeCode", billTypeCode);
			
			return this.mapper.queryBillTemplateBListByParentId(params);
		}
		else {
			return new ArrayList<BilltempletB>();
		}
	}
}
