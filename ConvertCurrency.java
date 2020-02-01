public class ConvertCurrency{
	public static void main(String[] args){

        double cad = 50;
	    double cadToUsd = cad * 0.76;    // 0.76 is the ratio from CAD to USD
		double cadToEur = cad * 0.68;    // 0.68 is the ratio from CAD to EUR
		

		System.out.println(cad + "CAD is " + cadToUsd + "USD.");
		System.out.println(cad + "CAD is " + cadToEur + "EUR.");
	}
}