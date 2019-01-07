package cn.chinaunicom.platform.service.impl;

import cn.chinaunicom.platform.entity.BilltempletB;
import cn.chinaunicom.defdoc.entity.HadesLookups;
import cn.chinaunicom.platform.dao.BilltempletBMapper;
import cn.chinaunicom.platform.service.IBilltempletBService;
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
public class BilltempletBServiceImpl extends HrServiceImpl<BilltempletBMapper, BilltempletB> implements IBilltempletBService {

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
			
			//将itemKey 转换为驼峰命名
			List<BilltempletB> list =  this.mapper.queryBillTemplateBListByParentId(params);
			if(list!=null) {
				for(int i = 0 ; i < list.size(); i++ ) {
					BilltempletB b = list.get(i);
					String[] itemKeyAry  = b.getItemkey().split("_");
					StringBuffer humpStrBuf = new StringBuffer();
					for(int j = 0 ; j < itemKeyAry.length; j++ ) {
						if(j == 0 ) {
							humpStrBuf.append(itemKeyAry[j]);
						}else {
							humpStrBuf.append(itemKeyAry[j].substring(0,1).toUpperCase()+itemKeyAry[j].substring(1,itemKeyAry[j].length()));
						}
					}
					b.setItemkey(humpStrBuf.toString());
				}
			}
			return list ;
			
		}
		else {
			return new ArrayList<BilltempletB>();
		}
	}

	@Override
	public Map<String, List<Map<String, String>>> queryRefSelectDataByBillTypeCode(String billTypeCode) {
		
		List<HadesLookups> list = null ;
		if(StringUtils.isNotEmpty(billTypeCode)) {
			
			Map<String,Object> params = new HashMap<String,Object>();
			params.put("billTypeCode", billTypeCode);
			
			list =  this.mapper.queryRefSelectDataByBillTypeCode(params);
		}
		else {
			list =  new ArrayList<HadesLookups>();
		}
		Map<String,List<Map<String,String>>> retMap = new HashMap<String,List<Map<String,String>>>();
		if(list.size()>0) {
			//按lookup_type分组
			for(HadesLookups hd:list) {
				String key = hd.getLookupType();
				Map<String,String> tempMap = new HashMap<String,String>();
				tempMap.put("value",hd.getLookupCode());
				tempMap.put("name",hd.getMeaning());
				
				if(retMap.containsKey(key)) {
					retMap.get(key).add(tempMap);
				}else {
					List<Map<String,String>> tempList = new ArrayList<Map<String,String>>();
					tempList.add(tempMap);
					retMap.put(key,tempList);
				}
			}
		}
		
		return retMap;
	}
}
