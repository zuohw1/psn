package cn.chinaunicom.employee.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.plugins.Page;

import cn.chinaunicom.employee.entity.EmpBasic;
import cn.chinaunicom.employee.entity.EmpBasicDTO;
import cn.chinaunicom.employee.entity.EmpBasicDetail;
import cn.chinaunicom.employee.service.EmpMgrService;
import cn.chinaunicom.platform.entity.BilltempletB;
import cn.chinaunicom.platform.service.IBilltempletBService;
import cn.chinaunicom.platform.utils.MessageResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * **************************************
 * 描述: 员工信息维护
 * @ClassName: cn.chinaunicom.employee.controller.EmpMgrController
 * @author zhanggang 
 * @since 2018-11-27
 * @version V1.0
 * **************************************
 */
@Api(value = "员工信息维护", tags = "员工信息维护")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/empMgr")
public class EmpMgrController {

	@Autowired
	EmpMgrService service;
	
	@Autowired
	IBilltempletBService billtempletBService ;
	
	
	@ApiOperation(value = "花名册列表", notes = "花名册列表", response = EmpBasic.class, httpMethod = "GET")
    @ApiImplicitParams({
           /* @ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4"),*/
            @ApiImplicitParam(name = "X-Business-Group-Id", value = "业务组ID", required = true, dataType = "String", paramType = "header", defaultValue = "101"),
            @ApiImplicitParam(name = "employeeNumber", value = "员工编号", required = false, dataType = "String"),
            @ApiImplicitParam(name = "fullName", value = "姓名", required = false, dataType = "String"),
            @ApiImplicitParam(name = "org_id", value = "组织id", required = false, dataType = "String"),
            @ApiImplicitParam(name = "userPersonType", value = "用工类型", required = false, dataType = "String"),
            @ApiImplicitParam(name = "pageNumber", value = "当前页数", required = true, dataType = "Int"),
            @ApiImplicitParam(name = "pageSize", value = "页面条数", required = true, dataType = "Int", defaultValue = "10"),
    })
    @ApiResponses({
            @ApiResponse(
                    code = 200,
                    message = "获取人员数据成功",
                    response = Page.class
            ),
            @ApiResponse(
                    code = 404,
                    message = "未查询到人员数据"
            )
    })
    @GetMapping("/list")
    public ResponseEntity<Object> getEmpBasicList(
    		@RequestParam("pageNumber") Integer pageNumber,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
            @RequestParam(value = "employeeNumber", required = false) String employeeNumber, 
            @RequestParam(value = "fullName", required = false) String fullName,
            @RequestParam(value = "org_id", required = false) String org_id,
            @RequestParam(value = "userPersonType", required = false) String userPersonType
          )
	{
		Page<EmpBasic> personList = service.getEmpBasicList(pageNumber,pageSize,fullName,employeeNumber,org_id,userPersonType);
		
	
        if(personList!=null ) {
        	return new ResponseEntity<>(personList, HttpStatus.OK);
        }else {
        	MessageResponse dto = new MessageResponse();
        	String msg = "未查询到人员数据";
            dto.setMsg(msg);
            return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
        }
      
      
    }
	
	@ApiOperation(value = "花名册查询", notes = "花名册查询", response = EmpBasic.class, httpMethod = "GET")
    @ApiImplicitParams({
           /* @ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4"),*/
            @ApiImplicitParam(name = "X-Business-Group-Id", value = "业务组ID", required = true, dataType = "String", paramType = "header", defaultValue = "101"),
            @ApiImplicitParam(name = "employeeNumber", value = "员工编号", required = false, dataType = "String"),
            @ApiImplicitParam(name = "fullName", value = "姓名", required = false, dataType = "String"),
            @ApiImplicitParam(name = "org_id", value = "组织id", required = false, dataType = "String"),
            @ApiImplicitParam(name = "userPersonType", value = "用工类型", required = false, dataType = "String"),
            @ApiImplicitParam(name = "pageNumber", value = "当前页数", required = true, dataType = "Int"),
            @ApiImplicitParam(name = "pageSize", value = "页面条数", required = true, dataType = "Int", defaultValue = "10"),
    })
    @ApiResponses({
            @ApiResponse(
                    code = 200,
                    message = "获取人员数据成功",
                    response = Page.class
            ),
            @ApiResponse(
                    code = 404,
                    message = "未查询到人员数据"
            )
    })
    @GetMapping("/queryPsnRoster")
    public ResponseEntity<Object> queryPsnRoster(
    		@RequestParam("pageNumber") Integer pageNumber,
            @RequestParam(value = "pageSize", defaultValue = "100") Integer pageSize,
            @RequestParam(value = "employeeNumber", required = false) String employeeNumber, 
            @RequestParam(value = "fullName", required = false) String fullName,
            @RequestParam(value = "org_id", required = false) String org_id,
            @RequestParam(value = "userPersonType", required = false) String userPersonType
          )
	{
		Page<Map<String,Object>> personList = service.queryPsnRoster(pageNumber,pageSize,fullName,employeeNumber,org_id,userPersonType);
		
	
        if(personList!=null ) {
        	return new ResponseEntity<>(personList, HttpStatus.OK);
        }else {
        	MessageResponse dto = new MessageResponse();
        	String msg = "未查询到人员数据";
            dto.setMsg(msg);
            return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
        }
      
      
    }
	
	@ApiOperation(value = "根据人员Id获取基本信息", notes = "根据人员Id获取基本信息", response = List.class, httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "personId", value = "员工Id", required = true, dataType = "Long"),
    })
    @ApiResponses({
            @ApiResponse(
                    code = 200,
                    message = "获取人员数据成功",
                    response = Page.class
            ),
            @ApiResponse(
                    code = 404,
                    message = "未查询到人员数据"
            )
    })
	@GetMapping("/queryPsnBasicInfoById")
    public ResponseEntity<Object> queryPsnBasicInfoById(
            @RequestParam(value = "personId", required = true) Long personId)
	{
		List<EmpBasicDTO> personList = service.queryPsnBasicInfoById(personId);
		
	
        if(personList!=null ) {
        	return new ResponseEntity<>(personList, HttpStatus.OK);
        }else {
        	MessageResponse dto = new MessageResponse();
        	String msg = "未查询到人员数据";
            dto.setMsg(msg);
            return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
        }
      
      
    }
	
	
	@ApiOperation(value = "根据人员Id获取修改前信息", notes = "根据人员Id获取修改前信息", response = List.class, httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "personId", value = "员工Id", required = true, dataType = "Long"),
    })
    @ApiResponses({
            @ApiResponse(
                    code = 200,
                    message = "获取人员数据成功",
                    response = Page.class
            ),
            @ApiResponse(
                    code = 404,
                    message = "未查询到人员数据"
            )
    })
	@GetMapping("/queryPsnBasicDetailById")
    public ResponseEntity<Object> queryPsnBasicDetailById(
            @RequestParam(value = "personId", required = true) Long personId)
	{
		EmpBasicDetail empBasicDetail = service.queryPsnBasicDetailById(personId);
		
	
        if(empBasicDetail!=null ) {
        	return new ResponseEntity<>(empBasicDetail, HttpStatus.OK);
        }else {
        	MessageResponse dto = new MessageResponse();
        	String msg = "未查询到人员数据";
            dto.setMsg(msg);
            return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
        }
      
      
    }
	
	
	@ApiOperation(value = "根据组织名称获取组织列表", notes = "根据组织名称获取组织列表", response = List.class, httpMethod = "GET")
    @ApiImplicitParams({
    		@ApiImplicitParam(name = "pageNumber", value = "页码", required = true, dataType = "Integer"),
    		@ApiImplicitParam(name = "pageSize", value = "每页数量", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "name", value = "组织名称", required = true, dataType = "String"),
    })
    @ApiResponses({
            @ApiResponse(
                    code = 200,
                    message = "获取组织数据成功",
                    response = Page.class
            ),
            @ApiResponse(
                    code = 404,
                    message = "未查询到组织数据"
            )
    })
	@GetMapping("/queryOrgListByName")
    public ResponseEntity<Object> queryOrgListByName(@RequestParam("pageNumber") Integer pageNumber,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
            @RequestParam(value = "name", defaultValue = "@@") String orgName)
	{
		Page<Map<String,Object>> orgList = service.queryOrgListByName(pageNumber, pageSize, orgName);
	
        if(orgList!=null ) {
        	return new ResponseEntity<>(orgList, HttpStatus.OK);
        }else {
        	MessageResponse dto = new MessageResponse();
        	String msg = "未查询到人员数据";
            dto.setMsg(msg);
            return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
        }
      
      
    }
	
	@ApiOperation(value = "根据人员Id获取子集信息", notes = "根据人员Id获取子集信息", response = List.class, httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "personId", value = "员工Id", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "infoSetType", value = "子集类型", required = true, dataType = "String"),
    })
    @ApiResponses({
            @ApiResponse(
                    code = 200,
                    message = "获取子集数据成功",
                    response = Page.class
            ),
            @ApiResponse(
                    code = 404,
                    message = "未查询到人员子集数据"
            )
    })
	@GetMapping("/queryPsnSubSetInfoById")
    public ResponseEntity<Object> queryPsnSubSetInfoById(
            @RequestParam(value = "personId", required = true) Long personId,
            @RequestParam(value = "infoSetType", required = true) String infoSetType)
	{
		List<Map<String,Object>> infoSetList = null ;
		
		if(infoSetType.equals("EMP_EDUCATIONS")) {
			infoSetList = service.queryPsnEducationsByPersonId(personId) ;
		}else if (infoSetType.equals("EMP_PREVIOUS_JOBS" )) {
			infoSetList = service.queryPsnPreviousJobsByPersonId(personId);
		}else if(infoSetType.equals("EMP_QUALIFICATIONS") ) {
			infoSetList = service.queryPsnQualificationsByPersonId(personId);
		}else if(infoSetType.equals("EMP_TECH_QUALIFICATION") ) {
			infoSetList = service.queryPsnTechQualificationsByPersonId(personId);
		}else if(infoSetType.equals("EMP_REWARD") ) {
			infoSetList = service.queryPsnRewardByPersonId(personId);
		}else if(infoSetType.equals("EMP_PUNISHMENT") ) {
			infoSetList = service.queryPsnPunishmentByPersonId(personId);
		}else if(infoSetType.equals("POLITICS_LANDSCAPE") ) {
			infoSetList = service.queryPsnPoliticsLandscapeByPersonId(personId);
		}else if(infoSetType.equals("EMP_QUALIFICATIONS_APP") ) {
			infoSetList = service.queryPsnQualificationsAppByPersonId(personId);
		}else if(infoSetType.equals("EMP_TECH_APPOINT") ) {
			infoSetList = service.queryPsnTechAppointByPersonId(personId);
		}else if(infoSetType.equals("EMP_RESUME") ) { //员工简历
			//infoSetList = service.queryPsnPreviousJobsByPersonId(personId);
		}
		
        if(infoSetList!=null ) {
        	return new ResponseEntity<>(infoSetList, HttpStatus.OK);
        }else {
        	MessageResponse dto = new MessageResponse();
        	String msg = "未查询到人员数据";
            dto.setMsg(msg);
            return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
        }
      
      
    }
	
	
	@ApiOperation(value = "根据模板编码获取模板数据", notes = "根据模板编码获取模板数据", response = List.class, httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "billTypeCode", value = "模板编码", required = true, dataType = "String"),
    })
    @ApiResponses({
            @ApiResponse(
                    code = 200,
                    message = "获取模板数据成功",
                    response = Page.class
            ),
            @ApiResponse(
                    code = 404,
                    message = "未查询到单据模板数据"
            )
    })
	@GetMapping("/queryBilltempletDataByCode")
    public ResponseEntity<Object> queryBilltempletDataByCode(
            @RequestParam(value = "billTypeCode", required = true) String billTypeCode)
	{
		List<BilltempletB> billDatas = billtempletBService.queryBillTemplateBListByParentId(billTypeCode) ;
		
        if(billDatas!=null ) {
        	return new ResponseEntity<>(billDatas, HttpStatus.OK);
        }else {
        	MessageResponse dto = new MessageResponse();
        	String msg = "未查询到模板数据";
            dto.setMsg(msg);
            return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
        }
      
      
    }
	
	@ApiOperation(value = "根据模板编码获取档案数据", notes = "根据模板编码获取档案数据", response = List.class, httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "billTypeCode", value = "模板编码", required = true, dataType = "String"),
    })
    @ApiResponses({
            @ApiResponse(
                    code = 200,
                    message = "获取档案数据成功",
                    response = Page.class
            ),
            @ApiResponse(
                    code = 404,
                    message = "未查询到档案数据"
            )
    })
	@GetMapping("/queryRefSelectDataByBillType")
    public ResponseEntity<Object> queryRefSelectDataByBillType(
            @RequestParam(value = "billTypeCode", required = true) String billTypeCode)
	{
		//EmpBasicDetail empBasicDetail = service.queryPsnBasicDetailById(personId);
		
		Map<String, List<Map<String, String>>> refSelectData= billtempletBService.queryRefSelectDataByBillTypeCode(billTypeCode);
        if(refSelectData!=null ) {
        	return new ResponseEntity<>(refSelectData, HttpStatus.OK);
        }else {
        	MessageResponse dto = new MessageResponse();
        	String msg = "未查询到档案数据";
            dto.setMsg(msg);
            return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
        }
      
      
    }
	
	@ApiOperation(value = "保存", notes = "保存", response = MessageResponse.class, httpMethod = "POST")
	@ApiImplicitParams({
    @ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
	})
	@ApiResponses({
	         @ApiResponse(
	                 code = 200,
	                 message = "添加成功"
	         )
	})
	@PostMapping("/save")
	public ResponseEntity<Object> saveEmpBasic(@RequestBody EmpBasic entity){
		MessageResponse vo = new MessageResponse();
        Integer i = service.saveEmpBasic(entity);
        if(i>0) {
        	vo.setMsg("添加成功");
        }else {
        	vo.setMsg("添加失败");
        }
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
    
    @ApiOperation(value = "更新", notes = "更新", response = MessageResponse.class, httpMethod = "POST")
	@ApiImplicitParams({
    @ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
	})
	@ApiResponses({
	         @ApiResponse(
	                 code = 200,
	                 message = "添加成功"
	         )
	})
	@PostMapping("/update")
	public ResponseEntity<Object> updateEmpBasic(@RequestBody EmpBasicDetail entity){
		MessageResponse vo = new MessageResponse();
        Integer i = service.updateEmpBasic(entity);
        if(i>0) {
        	vo.setMsg("更新成功");
        }else {
        	vo.setMsg("更新失败");
        }
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
    
    @ApiOperation(value = "删除", notes = "删除", response = MessageResponse.class, httpMethod = "POST")
	@ApiImplicitParams({
    @ApiImplicitParam(name = "x-token-code", value = "用户登录令牌", paramType = "header", dataType = "String", required = true, defaultValue = "xjMjL0m2A6d1mOIsb9uFk+wuBIcKxrg4")
	})
	@ApiResponses({
	         @ApiResponse(
	                 code = 200,
	                 message = "删除成功"
	         )
	})
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deleteEmpBasic(@PathVariable("id") Long id){
		MessageResponse vo = new MessageResponse();
        Integer i = service.deleteEmpBasic(id);
        if(i>0) {
        	vo.setMsg("删除成功");
        }else {
        	vo.setMsg("删除失败");
        }
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }
}

