import java.util.Scanner;

public class Pro2{
	public static void main(String args[]){
	 int number,i,digit,revnum=0;
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter any number:\n");
	 number=scan.nextInt();
	 for(i=number;i>0;i=i/10){
	    digit=i%10;
	    revnum=revnum*10+digit;
	    
	    
	    
	 
	 }
	 System.out.println("the reversed number is:\n"+revnum);
	  
	 
	 
	 }

}
