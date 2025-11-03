public class ChoosingRepetitionTypes{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// Sum first 100 integers
int sum = 0;
for (int i = 1; i <= 100; i++)
    sum += i;

// Sum arbitrary integers
Scanner input = new Scanner(System.in);
int number = 0;
sum = 0;
System.out.print("Enter a number: ");
number = input.nextInt();
while (number != -1) {
    sum += number;
    System.out.print("Enter next number: ");
    number = input.nextInt();
	
          }
	}
}