package week3Day1;

public class Students {
			public void getStudInfo(int Id) {
				 System.out.println("Id : 1001");
			}
			public void getStudInfo(int ID,String Name) {
				System.out.println("Id:1002,Name:Bhakti");
			}
			public void getStudInfo(String Email,int Ph) {
				System.out.println("Email:Bhakti@gmail.com,ph: 9890551066");
			}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Students s1= new Students();
			s1.getStudInfo(1004);
			s1.getStudInfo(1001, "Aadesh");
			s1.getStudInfo("abc@gmail.com", 98909897);
			
	}

}
