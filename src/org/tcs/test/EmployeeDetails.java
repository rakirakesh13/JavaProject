package org.tcs.test;

import org.wipro.test.ManagerDetails;

// SAME PACKAGE DIFFERENT CLASS
public class EmployeeDetails {
		private void userName() {
			System.out.println("user name is rakesh");

		}
		
		private void passWord() {
			System.out.println("user password is raki123");

		}
		public static void main(String[] args) {
			EmployeeDetails a = new EmployeeDetails();
			a.userName();
			a.passWord();
			
			ClientDetails b = new ClientDetails();
			b.clientName();
			
			ManagerDetails c = new ManagerDetails();
			c.managerId();
			c.mangerPhoneNumber();
			c.managerName();
		}
}
