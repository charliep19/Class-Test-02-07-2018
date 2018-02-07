import java.util.Scanner;
public class PhoneTest {

	public PhoneTest(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner=new Scanner(System.in);
	String Brand;
	int Years;
	int Prices;
	PhoneTest phone1= new PhoneTest("Cricket, ZTE,2006,175");
	 String phone1_PhoneBrand = ("Cricket, ZTE,2006,175");
	System.out.println(phone1_PhoneBrand);
	
	PhoneTest  phone2= new PhoneTest("Boost Mobile, Galaxy7, 2017,399");
	String  phone2_PhoneBrand = ("Boost Mobile, Galaxy7, 2017,399");
	System.out.println(phone2_PhoneBrand);
	
	PhoneTest phone3= new PhoneTest ("Apple, IphoneX,2017, 1100");
	String phone3_PhoneBrand =  ("Apple, IphoneX,2017, 1100");
	System.out.println(phone3_PhoneBrand);
	
	
	
	

}
}
