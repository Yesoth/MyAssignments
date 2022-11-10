package Week1.Day1;

public class TwoWheeler {

	int noOfWheels = 12;
	short noOfMirrors = 4;
	long chassisNumber = 9597908016999L;
	boolean isPunctured = false;
	String bikeName = "Yamaha FZ";
	double runningKM = 230000.240;
	
	public static void main(String[] args) {

		TwoWheeler mybike = new TwoWheeler();
		System.out.println("noOfWheels =" +mybike.noOfWheels);
		System.out.println("noOfMirrors =" +mybike.noOfMirrors);
		System.out.println("chassisNumber ="+mybike.chassisNumber);
	    System.out.println("isPunctured ="+mybike.isPunctured);
	    System.out.println("bikeName ="+ mybike.bikeName);
	    System.out.println("runningKM ="+ mybike.runningKM);
	}

}
