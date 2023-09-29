import java.util.Scanner;



public class Pro3{
public static void main(String args[]){
         int i;			
         do{ int choice,a;
             double m,n,res=0;
            System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.division");
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter operation to be performed:\n");
            choice= scan.nextInt();
            
             
            switch(choice){
             case 1 :
             	     System.out.println("Enter 2 numbers:\n");
            m=scan.nextDouble();
            n=scan.nextDouble();
            		
                    res= m+n;
                    System.out.println("The sum is:\n"+res);
                    break;
             case 2 :
             		System.out.println("Enter 2 numbers:\n");
            m=scan.nextDouble();
            n=scan.nextDouble();
           		
                     res=m-n;
                     System.out.println("The difference is:\n"+res);
                     break;
             case 3:
             		System.out.println("Enter 2 numbers:\n");
            m=scan.nextDouble();
            n=scan.nextDouble();
            		
                    res=m*n;
                    System.out.println("The product is:\n"+res);
                    break;
             case 4:
             	System.out.println("Enter 2 numbers:\n");
            m=scan.nextDouble();
            n=scan.nextDouble();
            	if(n==0){
            	 System.out.println("division not possible");
            	  break; 
            	  }
            	  else{
                    res= m/n;
                    System.out.println("The quotient is:\n"+res);}
                    break;
             default :
                     System.out.println("Invalid entry\n");
                     break;
                     }
               System.out.println("Do you want to continue the program? if yes enter 0,o.w enter any number\n");
               a= scan.nextInt();
               if(a==0){
                  i=0;
               
               }
                else{
                System.out.println("Exitted the program\n");
                break;
                
                
                }

             
            
            
            
            
            
            
            
            
            
            }while(i==0);
	}
            
}     
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
      





