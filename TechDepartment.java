package com.b6group.assignment;

public class TechDepartment extends SuperDepartment {
	private String deptName;
	private String todayWork;
	private String workDeadline;
	private String stackInfo;

	
    public String departmentName() {
		this.deptName = "Tech Department";
		return deptName;
	}
	public String getTodaysWork() {
		this.todayWork = "Complete coding of module 1";
		return todayWork;
	}
	public String getWorkDeadline() {
		this.workDeadline = "Complete by EOD";
		return workDeadline;
	}
	
	public String getTechStackInformation() {
		this.stackInfo = "Core Java";
		return stackInfo;
	}
   

}
