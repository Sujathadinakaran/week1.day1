package week1.day1;

public class Mobile {

	public void makeCall() {
		System.out.println("Make the Call");	
	}

	public void sendMsg() {
		System.out.println("Send the Message");
	}
	public static void main(String[] args) {
		System.out.println("Execute the Method");
		
		Mobile myMobile = new Mobile();
		myMobile.makeCall();
		myMobile.sendMsg();
	}
}
