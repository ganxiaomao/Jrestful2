package com.jrestful.cms.mapper.emp;

import java.util.List;

import com.jrestful.cms.vo.emp.Emp;

public interface EmpMapper {

	List<Emp> getEmpUsePage();

	List<Emp> getEmpsNoPage();

}
