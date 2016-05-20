package com.jrestful.cms.common;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.jrestful.cms.config.ApiConfig;
import com.jrestful.cms.vo.base.BaseResult;
public class BaseResultProcess {

	public static BaseResult processNormal(BaseResult baseResult, HttpServletRequest request) {
		baseResult.setApi(request.getRequestURI());
		baseResult.setMethod(request.getMethod());
		baseResult.setVersion(ApiConfig.API_VERSION.getValue());
		Map<String, String> resultMap = new HashMap<>();
		resultMap.put("code", ApiConfig.SUCCESS_CODE.getValue());
		baseResult.setResult(resultMap);
		return baseResult;
	}
	
	public static BaseResult processHttpError(BaseResult baseResult, HttpServletRequest request) {
		baseResult.setApi(request.getRequestURI());
		baseResult.setMethod(request.getMethod());
		baseResult.setVersion(ApiConfig.API_VERSION.getValue());
		Map<String, String> resultMap = new HashMap<>();
		resultMap.put("code", ApiConfig.HTTP_404_CODE.getValue());
		resultMap.put("code", ApiConfig.HTTP_404_MESSAGE.getValue());
		baseResult.setResult(resultMap);
		return baseResult;
	}
}
