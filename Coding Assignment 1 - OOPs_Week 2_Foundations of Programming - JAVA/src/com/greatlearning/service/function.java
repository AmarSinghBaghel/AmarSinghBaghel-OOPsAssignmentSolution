package com.greatlearning.service;
import com.greatlearning.model.*;

public class function {
	
	private static AdminDepartment admin = new AdminDepartment();
	private static TechDepartment tech = new TechDepartment();
	private static HrDepartment hr = new HrDepartment();
		
	public static void  AdminFunction() {
		
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println("----------------------------");
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		
	}
	
	public static void  Hrfunction() {
		
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println("----------------------------");
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
	}
	
	public static void  Techfunction() {
		System.out.println("Welcome to " + tech.departmentName());
		System.out.println("----------------------------");
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
	}
}
