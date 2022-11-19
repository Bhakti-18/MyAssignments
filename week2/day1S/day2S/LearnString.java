package week2.day2S;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = "Testleaf";   // string literals
			
			String s1 = new String("Testleaf");  //String object
			
			//compare two string
			boolean isequal = s.equals(s1);
			System.out.println(isequal);
			
			//to get number of char in string
			int noofchar = s.length();
			System.out.println(noofchar);
			
			//to convert string to char array
			char[] charArray = s.toCharArray();
			System.out.println(charArray);
			
			//to get particular char
			char[] charArray1 = s.toCharArray();
			System.out.println(charArray1[7]);
			
			//to get particular char
			char charAt = s.charAt(7);
			System.out.println(charAt);
			
			
			
			
	}

}
