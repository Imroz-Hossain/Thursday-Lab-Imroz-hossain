package BasicProgram;
import java.util.*;
public class SumOfNaturalNo {

	public static void Main(String[] args) {
				int range,i,sum=0;//initialize sum as 0
				Scanner sc=new Scanner(System.in); //createing object of scanner class
				System.out.println("enter the range: ");
				range=sc.nextInt();//take input from user
				//for loop
				for(i=1;i<=range;i++)//i is counter variable
				{
					sum+=i;
				}
				System.out.println("Sum of "+range+" natural number: "+sum);




	}

}
