package week1.day2.assignments;

public class TwoWheelers {
	int noOfWheels=2;
	short noOfMirrors=1;
	long chassisNumber=7860l;
	boolean isPunctured=false;
	String bikeName= "Activa";
	double runningKM=109090.00;
	
	public static void main(String[] args) {
		TwoWheelers t = new TwoWheelers();
		System.out.println("No of wheels:" + t.noOfWheels);
		System.out.println("No of mirrors:" + t.noOfMirrors);
		System.out.println("Chass is number:" + t.chassisNumber);
		System.out.println("Bike is punctures:" + t.isPunctured);
		System.out.println("Bike name is :" + t.bikeName);
		System.out.println("Bike runing kilo meter:" + t.runningKM);
	}
}
