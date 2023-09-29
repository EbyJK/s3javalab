import java.util.Scanner;

public class Pro1{
      public static void main(String args[]){
       double m;
       Scanner scan= new Scanner(System.in);
       System.out.println("Enter student mark(out of 100):\n");
       m=scan.nextDouble();
       if (m>100){
         System.out.println("invaild entry of marks\n");
       
            }
        else{
        if (m>=90){
          System.out.println("student grade is A+\n");}
          else if(m>=85){
          System.out.println("Student grade is A-\n");}
          else if(m>=75){
          System.out.println("Student grade is B");}
          else if(m>=65){
          System.out.println("Student grade is C");}
          else if(m>=55){
          System.out.println("Student grade is D");}
          else if (m>=45){
          System.out.println("Student grade is E");}
          else if(m>=35){
          System.out.println("Student grade is F");}
          else{
          System.out.println("Student has failed the test\n");}
       }
       
       
       
       }



}
