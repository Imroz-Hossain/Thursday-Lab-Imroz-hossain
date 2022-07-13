package BasicProgram;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number,count=0,sum=0,rem,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to check amstrong or not");
		number=sc.nextInt();
		
		temp=number;
		while(number>0)
		{
			count++;
			number=number/10;
		}
		number=temp;
		while(number>0)
		{
		rem=number%10;
		sum+=Math.pow(rem, count);
		number=number/10;
		
		if(sum==temp)
			System.out.println(temp+ "is an Armstrong number");
		else
			System.out.println(temp+ "is not an Armstrong number");
		
			
		
		}

	}

}
