import java.util.Scanner;

public class IfElseIfStatement{
   public static void main(String[] args){

	   //Scanner object has been created
	   Scanner input = new Scanner(System.in);
	   
	   //variable declaration
	   int mark;
	   String fullname;
	   
	   //promt user for input
	   System.out.print("Enter your name: ");
	   fullname = input.nextLine();
	   
	   System.out.print("Enter your mark: ");
	   mark = input.nextInt();
	   
	   if(mark >= 80){
		   System.out.printf("FullName: %s, Mark: %d your grade is A",fullname,mark);
	   }
	   else if(mark >= 75){
		   System.out.printf("FullName: %s, Mark: %d your grade is B",fullname,mark);
	   }
	   else if(mark >= 65){
		   System.out.printf("FullName: %s, Mark: %d your grade is C",fullname,mark);
	   }
	   else if(mark >= 55){
		   System.out.printf("FullName: %s, Mark: %d your grade is D",fullname,mark);
	   }
	   else if(mark >= 45){
		   System.out.printf("FullName: %s, Mark: %d your grade is E",fullname,mark);
	   } 
		else{
		   System.out.printf("FullName: %s, Mark: %d your grade is F",fullname,mark);
	   }
   }
}