package Week1.Day1;

public class Mobile {

	String mobileBrandName = "Samsung";
	char mobileLogo = 'S';
	short noOfMobilePiece = 1;
	int modelNumber = 20;
	long mobileImeNumber = 9597908016000L;
	float mobilePrice = 39.999f;
	boolean isDamaged = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile mobile1 = new Mobile();
		System.out.println("MobileBrandName =" + mobile1.mobileBrandName);
		System.out.println("MobileLogo ="+ mobile1.mobileLogo);
		System.out.println("noOfMobilePiece ="+mobile1.noOfMobilePiece);
		System.out.println("ModelNumber ="+mobile1.modelNumber);
		System.out.println("IME ="+mobile1.mobileImeNumber);
		System.out.println("MobilePrice =" + mobile1.mobilePrice);
		System.out.println("Damaged ="+mobile1.isDamaged);
	}

}
