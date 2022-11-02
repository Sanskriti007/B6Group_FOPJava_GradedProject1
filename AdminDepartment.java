package com.b6group.assignment;

public class AdminDepartment extends SuperDepartment {
	private String deptName;
	private String todayWork;
	private String workDeadline;
	public String departmentName() {
		this.deptName = "Admin Department";
		return deptName;
	}
	public String getTodaysWork() {
		this.todayWork = "Complete your documents Submission";
		return todayWork;
	}
	public String getWorkDeadline() {
		this.workDeadline = "Complete by EOD";
		return workDeadline;
	}

}
