package org.system;

public class Desktop extends Computer {

	public void DesktopSize() {
		 System.out.println("This is Desktop size method in desktop class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Desktop D = new Desktop();
			D.ComputerModel();
			D.DesktopSize();
	}

}
