package com.jrestful.cms.common;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.jrestful.cms.vo.base.BaseResult;

@ControllerAdvice
public class HTTPErrorHandler {
	
	@ExceptionHandler(NoHandlerFoundException.class)
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	@ResponseBody
	public BaseResult requestHandlingNoHandlerFound(HttpServletRequest req, NoHandlerFoundException ex) {
		BaseResult result = new BaseResult();
		BaseResultProcess.processHttpError(result, req);
	    return result;
	} 
	
}
