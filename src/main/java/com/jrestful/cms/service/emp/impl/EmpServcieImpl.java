package com.jrestful.cms.service.emp.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jrestful.cms.mapper.emp.EmpMapper;
import com.jrestful.cms.service.emp.EmpServcie;
import com.jrestful.cms.vo.base.BaseResult;
import com.jrestful.cms.vo.emp.Emp;

@Service
public class EmpServcieImpl implements EmpServcie {

	@Autowired
	private EmpMapper empMapper;
	
	public BaseResult getEmpUsePage(BaseResult result,Integer pageNum, Integer pageSize) throws Exception {
		Page<?> page = PageHelper.startPage(pageNum, pageSize);
		List<Emp> pageList = empMapper.getEmpUsePage();
		result.setData(pageList);
		result.setTotalCount(page.getTotal());
		return result;
	}

	@Override
	public List<Emp> getEmpsNoPage() {
		return empMapper.getEmpsNoPage();
	}

}
