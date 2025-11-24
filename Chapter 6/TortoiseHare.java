// Exercise628_TortoiseHare.java


import java.util.Random;

public class TortoiseHare {
    public static void main(String[] args) throws InterruptedException {
        Random rnd = new Random();
        int tort = 1, hare = 1;
        System.out.println("BANG !!!!!\nAND THEY'RE OFF !!!!!");
        while (true) {
            // tortoise move
            int i = rnd.nextInt(10) + 1;
            if (i <= 5) tort += 3; // fast plod
            else if (i <= 7) tort -= 6; // slip
            else tort += 1; // slow plod
            if (tort < 1) tort = 1;

            // hare move
            i = rnd.nextInt(10) + 1;
            if (i <= 2) { /* sleeps */ }
            else if (i <= 3) hare += 9;
            else if (i <= 4) hare -= 12;
            else if (i <= 8) hare += 1;
            else hare -= 2;
            if (hare < 1) hare = 1;

            // display line
            StringBuilder line = new StringBuilder(" ".repeat(70));
            if (tort == hare) {
                int pos = Math.min(70, Math.max(1, tort));
                int idx = pos - 1;
                line.replace(idx, Math.min(idx + 4, line.length()), "OUCH");
            } else {
                if (tort <= 70) line.setCharAt(Math.min(69, tort-1), 'T');
                if (hare <= 70) line.setCharAt(Math.min(69, hare-1), 'H');
            }
            System.out.println(line.toString());
            if (tort >= 70 && hare >= 70) { System.out.println("It's a tie!");
			break; }
			
            else if (tort >= 70) { System.out.println("TORTOISE WINS!!! YAY!!!"); 
			break; }
			
            else if (hare >= 70) { System.out.println("Hare wins. Yuck.");
			break; }
			
            Thread.sleep(100); 
        }
    }
}
