import java.util.Scanner;

public class Vat {

	public static void main(String[] args) {

		Scanner s =new Scanner (System.in);
		
		System.out.print (" Take an amount : ");
		
		double Salary = s.nextDouble();
		
		double Vat= Salary * 0.15;
		
		System.out.println(" VAT  : " +Vat + " Taka ");
		

	}

}
