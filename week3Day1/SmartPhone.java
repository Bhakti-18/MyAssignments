package week3Day1;

public class SmartPhone extends AndroidPhone{
	
	public void takeVideo() {
		System.out.println("take video method in smartphone class");
	}

	public void ConnectWhatsapp() {
		System.out.println("Please connect whatsapp");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SmartPhone SP = new SmartPhone();
	        SP.MakeCall();
	        SP.ConnectWhatsapp();
	        SP.SaveContact();
	        SP.takeVideo();
	        SP.SendMsg();
	        SP.takeVideo();
	}

}
