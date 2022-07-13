   package BasicProgram;
   import java.util.Scanner;
   public class PerfectNumber{ 
      public static void main(String[] args) { 
				int num,i,sum=0;
				Scanner sc=new Scanner (System.in);
						System.out.println("enter number to check perfect or not?");
				num=sc.nextInt();  //6
				
				for(i=1;i<num;i++)  //i=2<6t
				{
					if(num%i==0)  //6%1=0==0t
					{
						sum=sum+i;  //sum=
					}
				}
			if(num==sum)
				System.out.println(num+" is a Perfect Number.");
			else
				System.out.println(num+ " is not a Perfect number.");
			

      }
      
   }




	


