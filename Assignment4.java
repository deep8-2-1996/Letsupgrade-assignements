package LetsUpgradeAssignments;
import java.util.Scanner;
public class Assignment4 {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int[] numbers=new int[5];
		System.out.println("Enter 5 numbers you want to add");
	    for(int i=0;i<5;i++) {
	    	numbers[i]=sc.nextInt();   	
	    	sum=sum+numbers[i];
	    }
	    	{
	    System.out.println("Total Sum="+sum);
	    }
	    sc.close();
	}
}


