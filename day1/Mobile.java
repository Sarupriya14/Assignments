package week1.day1;

public class Mobile {
	public void sendsms()
	{
		System.out.println("from oppo");
	}
	public void makecall() {
		System.out.println("calling my friend");
	}
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.sendsms();
		obj.makecall();
	}

}
