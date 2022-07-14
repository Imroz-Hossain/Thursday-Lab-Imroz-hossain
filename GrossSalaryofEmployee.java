package BasicProgram;
import java.util.Scanner;
public class GrossSalaryofEmployee {

	public static void main(String[] args){
		System.out.print("Enter Basic Salary: ");
		Scanner sc=new Scanner(System.in);
		double basic=sc.nextDouble();
		
		if(basic>1500) {
		double hra =(basic*0.2);
		double da =(basic*0.9);
		double gross = basic+hra+da;
		System.out.println("Your gross Salary is = "+gross);
		}
		else {
			double hra=500;
			double da=(basic*0.7);
			double gross=basic+hra+da;
			System.out.println("your Gross Salary is= "+gross);
		}
		
				
	

	}

}
