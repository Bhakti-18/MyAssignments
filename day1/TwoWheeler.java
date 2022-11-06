package week1.day1;

public class TwoWheeler {
		int noOfWheels= 4 ;
		short noOfMirrors = 4;
		long chassisNumber = 456789876;
		boolean isPunctured = true;
		String bikeName = "activa";
		double runningKM = 2.10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           TwoWheeler TW1 = new TwoWheeler();
           System.out.println(TW1.noOfWheels); 
           System.out.println(TW1.noOfMirrors);
           System.out.println(TW1.chassisNumber);
           System.out.println(TW1.isPunctured);
           System.out.println(TW1.bikeName);
           System.out.println(TW1.runningKM);
	}

}
