package org.student;

import org.department.Department;

public class Student extends Department{
		public void StudName() {
			System.out.println("Stud Name is : Bhakti Paturkar");
		}
		public void StudDept() {
			System.out.println("Student Dept is : Computer Eng");
		}
		public void StudID() {
			System.out.println("Stud ID is : 10001");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Student S = new Student();
				S.CollegeName();
				S.CollegeCode();
				S.CollegeRank();
				S.deptName();
				S.StudName();
				S.StudID();
				S.StudDept();
	}

}
