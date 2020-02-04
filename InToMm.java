/* Program to convert 
   inches to millimeters */

public class InToMm{
	public static void main(String [] args){

		int in1, in2, in3;
		in1 = 2;
		in2 = 5;
		in3 = 10;
		double ratioToMm = 25.4;

		System.out.println("2in is equal to " + in1*ratioToMm + "mm.");
		System.out.println("5in is equal to " + in2*ratioToMm + "mm.");
		System.out.println("10in is equal to " + in3*ratioToMm + "mm.");
		
	}
}

        /* In the KG conversion, there was huge decimals, but
           this one looks fine.... */