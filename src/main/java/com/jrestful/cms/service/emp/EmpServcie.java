package com.jrestful.cms.service.emp;

import java.util.List;

import com.jrestful.cms.vo.base.BaseResult;
import com.jrestful.cms.vo.emp.Emp;

public interface EmpServcie {

	BaseResult getEmpUsePage(BaseResult baseResult, Integer pageNum, Integer pageSize)throws Exception;

	List<Emp> getEmpsNoPage();

}
