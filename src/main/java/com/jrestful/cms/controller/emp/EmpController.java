package com.jrestful.cms.controller.emp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jrestful.cms.common.BaseResultProcess;
import com.jrestful.cms.service.emp.EmpServcie;
import com.jrestful.cms.vo.base.BaseResult;
import com.jrestful.cms.vo.emp.Emp;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

@RestController
@Api(value = "Emp API", description = "Emp api")
@RequestMapping("/rest/emp")
@ResponseBody
public class EmpController {

	@Autowired
	private EmpServcie empServcie;

	private static Logger logger = Logger.getLogger(EmpController.class);

	@RequestMapping(value = "/emps", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	@ApiOperation(value = "get emps use page helper", httpMethod = "GET", notes = "get emps use page helpe", response = BaseResult.class)
	public BaseResult getEmpUsePage(HttpServletRequest request,
			@ApiParam(required = false, defaultValue = "1") @RequestParam(required = false) Integer pageNum,
			@ApiParam(required = false, defaultValue = "10") @RequestParam(required = false) Integer pageSize) {
		BaseResult baseResult = new BaseResult();
		BaseResultProcess.processNormal(baseResult, request);
		try {
			baseResult = empServcie.getEmpUsePage(baseResult, pageNum, pageSize);
			return baseResult;
		} catch (Exception e) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("code", "GET_EMP_IN_PAGE_ERROR");
			map.put("message", e.getMessage());
			logger.error(e.getMessage(), e);
			baseResult.setResult(map);
			return baseResult;
		}
	}

	@RequestMapping(value = "/empsNoPage", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	@ApiOperation(value = "get emps no page", httpMethod = "GET", notes = "get emps no page", response = BaseResult.class)
	public BaseResult getEmpsNoPage(HttpServletRequest request) {
		BaseResult baseResult = new BaseResult();
		BaseResultProcess.processNormal(baseResult, request);
		try {
			List<Emp> emps = empServcie.getEmpsNoPage();
			baseResult.setData(emps);
			return baseResult;
		} catch (Exception e) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("code", "GET_EMP_NO_PAGE_ERROR");
			map.put("message", e.getMessage());
			logger.error(e.getMessage(), e);
			baseResult.setResult(map);
			return baseResult;
		}
	}
}
