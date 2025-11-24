// Exercise620_TurtleGraphics.java


import java.util.Arrays;

public class TurtleGraphics {
    // commands: 1=pen up,2=pen down,3=turn right,4=turn left,5=move n,6=display,9=end
    public static void main(String[] args) {
        int[][] floor = new int[20][20];
        int r = 0, c = 0; // start top-left (0,0)
        boolean penDown = false;
        int dir = 0;
        int[] program = {2,5,12,3,5,12,3,5,12,3,5,12,1,6,9};
        int pc = 0;
		
        while (pc < program.length) {
            int cmd = program[pc++];
            switch (cmd) {
				
                case 1: penDown = false; 
				break;
				
                case 2: penDown = true; 
				break;
				
                case 3: dir = (dir + 1) % 4; 
				break;
				
                case 4: dir = (dir + 3) % 4; break;
                case 5:
                    if (pc >= program.length) 
						break;
					
                    int steps = program[pc++];
                    for (int s = 0; s < steps; s++) {
                        if (penDown) floor[r][c] = 1;
                        switch (dir) {
                            case 0: c = Math.min(19, c + 1);
							break;
							
                            case 1: r = Math.min(19, r + 1); 
							break;
							
                            case 2: c = Math.max(0, c - 1); 
							break;
							
                            case 3: r = Math.max(0, r - 1); 
							break;
							
                        }
                        if (penDown) floor[r][c] = 1;
                    }
                    break;
                case 6: displayFloor(floor);
				break;
				
                case 9: pc = program.length; 
				break;
				
                default: break;
            }
        }
    }

    static void displayFloor(int[][] floor) {
        for (int i = 0; i < floor.length; i++) {
            for (int j = 0; j < floor[i].length; j++) {
                System.out.print(floor[i][j] == 1 ? "*" : " ");
            }
            System.out.println();
        }
    }
}
