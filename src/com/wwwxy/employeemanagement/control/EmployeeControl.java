package com.wwwxy.employeemanagement.control;

import java.util.List;

import com.wwwxy.employeemanagement.dao.EmployeeDao;
import com.wwwxy.employeemanagement.entity.EmployeeEntity;

public class EmployeeControl {
	EmployeeDao ed = new EmployeeDao();
	
	//查看员工信息
	public List<EmployeeEntity> getAllEmployee(){
		return ed.getAllEmployee();
	}
	//输入姓名查询员工信息即模糊查询
	public List<EmployeeEntity> getEmployeeByName(String EmpName){
		return ed.getEmployeeByName(EmpName);
	}
	//修改员工信息
	public boolean UpdateEmployee(EmployeeEntity ee){
		ed.UpdateEmployee(ee);
		boolean flag = true;
		return flag;
	}
	//根据工号查询员工
	public EmployeeEntity getEmployeeById(int EmpId){
		return ed.getEmployeeById(EmpId);
	}
	//增加员工
	public boolean AddEmployee(EmployeeEntity ee){
		ed.AddEmployee(ee);
		boolean flag=true;
		return flag;
	}
	//删除员工
	public boolean DeleteEmployee(int EmpId){
		ed.DeleteEmployee(EmpId);
		boolean flag = true;
		return flag;
		
	}
}
