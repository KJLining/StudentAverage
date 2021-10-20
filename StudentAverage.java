
package studentaverage;
import java.util.Scanner;
public class StudentAverage {
    public static void main(String[] args) {
         Scanner studentInfo= new Scanner(System.in);
     System.out.println("Student Name: ");
     String studentName= studentInfo.nextLine();
     System.out.println("Student Section: ");
     String studentSection=studentInfo.nextLine();
     
     //int
     System.out.println("MATH:");
     int mth=studentInfo.nextInt();
     System.out.println("SCIENCE:");
     int sci=studentInfo.nextInt();
     System.out.println("FILIPINO:");
     int fil=studentInfo.nextInt();
     System.out.println("ENGLISH:");
     int eng=studentInfo.nextInt();
     
     int a= mth+sci+fil+eng;
     int b= a/4;
     
     
    
     System.out.println("   ");
     System.out.println("AVERAGE: "+b);
     System.out.println("   ");
     
     //if else statement
     int c, d;
     c= 74;
     d= 75;
     
    if(b <=74){
    System.out.println(studentName+" "+"is a student from"+" "+studentSection+" "+"with an average of"+" "+b+" "+"he/she"+" "+"is FAILED"+".");
    }
    else if(b >= d){
    System.out.println(studentName+" "+"is a student from"+" "+studentSection+" "+"with an average of"+" "+b+" "+"he/she"+" "+"is PASSED"+".");
    }
    }
    
}
