package com.pom.dashboard.service;

import java.util.List;

import com.pmo.dashboard.entity.EmployeeSkill;

public interface EmployeeSkillService {
	boolean delete(String id); // deleteByPrimaryKey

//    int insert(EmployeeSkill record);

	boolean insert(EmployeeSkill record);  // insertSelective

    EmployeeSkill select(String id); //selectByPrimaryKey

    boolean update(EmployeeSkill record);  // updateByPrimaryKeySelective

//    int updateByPrimaryKey(EmployeeSkill record);
    
    List<EmployeeSkill> query(EmployeeSkill condition);
    
    List<String> skills();
    
}
