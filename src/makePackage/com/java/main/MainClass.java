package makePackage.com.java.main;

import makePackage.com.java.employeeBank.EmployeeBank;

//
//import makePackage.com.java.dailyJournal.DailyJournal;
//import makePackage.com.java.employee.Employee;
//import makePackage.com.java.pay.Payment;
//import makePackage.com.java.pay.fullTime.FullTime;
//import makePackage.com.java.pay.partTime.PartTime;
//import makePackage.com.java.util.Util;
//import makePackage.com.java.welfare.Welfare;

public class MainClass {

	public static void main(String[] args) {

//		DailyJournal dailyJournal = new DailyJournal();
//		Employee employee = new Employee();
//		Payment payment = new Payment();
//		FullTime fullTime = new FullTime();
//		PartTime partTime = new PartTime();
//		Util util = new Util();
//		Welfare welfare = new Welfare();

		System.out.println();

		EmployeeBank parkBank = new EmployeeBank("ChanHoPark");
		parkBank.saveMoney(100);

		EmployeeBank leeBank = new EmployeeBank("SeungYeopLee");
		leeBank.saveMoney(300);

		leeBank.getBankInfo();

		parkBank.spendMoney(400);

		leeBank.getBankInfo();

		// Class의 속성과 메서드에 static 키워드를 사용하면, 어디서나 속성과 메서드를 공유할 수 있
	}

}
