        package BasicProgram;
         import java.util.*;
		public class StrongNumber {

			public static void main(String[] args) {
				int num,i,fact,lastdigit;    //declaring variable
				
				Scanner sc =new Scanner(System.in);
				System.out.println("enter the number: ");
				num=sc.nextInt();    //taking value from user
				int sum=0,temp=num;  
				
				//
				while (num!=0) 
				{
					i=1;
					fact=1;
					lastdigit= num%10; 
					
				while (i<= lastdigit)
				{
					fact=fact*i;
					i++;
				}
				sum=sum+fact;
				num=num/10;
				}
				if(sum==temp)
					System.out.println(temp+" is a strong number.");
				else
					System.out.println(temp+" is not a strong number.");
					
			}


	}


