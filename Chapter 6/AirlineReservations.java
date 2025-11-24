// Exercise618_AirlineReservations.java


import java.util.Scanner;

public class AirlineReservations {
    public static void main(String[] args) {
        boolean[] seats = new boolean[10]; 
        Scanner sc = new Scanner(System.in);
        int assigned = 0;
        while (assigned < 10) {
            System.out.println("Please type 1 for First Class or 2 for Economy (or 0 to quit):");
            int choice = sc.nextInt();
            if (choice == 0) break;
            boolean assignedSeat = false;
            if (choice == 1) {
                for (int i = 0; i < 5; i++) if (!seats[i]) { seats[i] = true; assigned++; 
				System.out.println("Boarding pass: Seat " + (i+1) + " First Class"); assignedSeat = true; break;}
                if (!assignedSeat) {
                    System.out.println("First class full. Accept seat in Economy? (y/n)");
                    if (sc.next().equalsIgnoreCase("y")) {
                        for (int i = 5; i < 10; i++) if (!seats[i]) { seats[i] = true; assigned++; 
						System.out.println("Boarding pass: Seat " + (i+1) + " Economy"); assignedSeat = true; break;}
                    } else System.out.println("Next flight leaves in 3 hours.");
                }
            } else if (choice == 2) {
                for (int i = 5; i < 10; i++) if (!seats[i]) { seats[i] = true; assigned++; 
				System.out.println("Boarding pass: Seat " + (i+1) + " Economy"); assignedSeat = true; break;}
                if (!assignedSeat) {
                    System.out.println("Economy full. Accept seat in First Class? (y/n)");
                    if (sc.next().equalsIgnoreCase("y")) {
                        for (int i = 0; i < 5; i++) if (!seats[i]) { seats[i] = true; assigned++; 
						System.out.println("Boarding pass: Seat " + (i+1) + " First Class"); assignedSeat = true; break;}
                    } else System.out.println("Next flight leaves in 3 hours.");
                }
            } else {
                System.out.println("Invalid choice.");
            }
        }
        if (assigned == 10)
			System.out.println("Plane is full.");
        sc.close();
    }
}
