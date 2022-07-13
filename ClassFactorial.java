package BasicProgram;
import java.util.Scanner;
public class ClassFactorial {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int num,i,fact=1;//initialize sum as 0
				Scanner sc=new Scanner(System.in); //createing object of scanner class
				System.out.println("enter the range: ");
				num=sc.nextInt();//
				for(i=1;i<=num;i++)
				{
					fact*=i;
				}
				System.out.println("Factorial of "+num+" is "+fact);


			}



	}


