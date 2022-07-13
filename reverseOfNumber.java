  package BasicProgram;
  import java.util.Scanner;
    public class reverseOfNumber {

	public static void main(String[] args)
		
		 {
			int num,rem,rev=0,temp;
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter no: ");
				num = sc.nextInt();
				temp = num;
				while(num!=0) {
					rem = num%10;
					rev=rev*10+ rem;
					num/=10;	
				}
				System.out.println("Reverse of "+temp+" is: "+ rev);
			}
		}
		