import java.io.*;

public class BullyAlgo {
    int cood, ch, crash;
    int prc[];

    // Method to simulate the election process
    public void election(int n) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nThe Coordinator Has Crashed!");
        int flag = 1;
        while (flag == 1) {
            crash = 0;
            // Count the number of crashed processes
            for (int i1 = 0; i1 < n; i1++) {
                if (prc[i1] == 0) {
                    crash++;
                }
            }
            // If all processes are crashed, print a message and exit
            if (crash == n) {
                System.out.println("\n*** All processes Are Crashed ***!");
                break;
            } else {
                // Prompt the user to enter the initiator process
                System.out.println("\nEnter the Initiator");
                int init = Integer.parseInt(br.readLine());
                // Validate the initiator process
                if ((init < 1) || (init > n) || (prc[init - 1] == 0)) {
                    System.out.println("\nInvalid Initiator");
                    continue;
                }
                // Simulate election by printing messages for each process
                for (int i1 = init - 1; i1 < n; i1++) {
                    System.out.println("Process " + (i1 + 1) + " called for Election");
                }
                System.out.println("");
                // Print the status of each process
                for (int i1 = init - 1; i1 < n; i1++) {
                    if (prc[i1] == 0) {
                        System.out.println("Process " + (i1 + 1) + " Is Dead");
                    } else {
                        System.out.println("Process " + (i1 + 1) + " Is In");
                    }
                }
                // Elect a new coordinator (the process with the highest ID)
                for (int i1 = n - 1; i1 >= 0; i1--) {
                    if (prc[i1] == 1) {
                        cood = (i1 + 1);
                        System.out.println("\n*** New Coordinator Is " + (cood) + " ***");
                        flag = 0;
                        break;
                    }
                }
            }
        }
    }

    // Method to handle user interactions and simulate process crashes and recoveries
    public void Bully() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The number of processes: ");
        int n = Integer.parseInt(br.readLine());
        prc = new int[n];
        crash = 0;
        // Initialize all processes as active
        for (int i = 0; i < n; i++) {
            prc[i] = 1;
        }
        cood = n;
        do {
            // Display menu options
            System.out.println("\n\t1. Crash A Process");
            System.out.println("\t2. Recover A Process");
            System.out.println("\t3. Display New Coordinator");
            System.out.println("\t4. Exit");
            // Read user's choice
            ch = Integer.parseInt(br.readLine());
            switch (ch) {
                case 1:
                    // Simulate process crash
                    System.out.println("\nEnter A Process To Crash");
                    int cp = Integer.parseInt(br.readLine());
                    if ((cp > n) || (cp < 1)) {
                        System.out.println("Invalid Process! Enter A Valid Process");
                    } else if ((prc[cp - 1] == 1) && (cood != cp)) {
                        prc[cp - 1] = 0;
                        System.out.println("\nProcess " + cp + " Has Been Crashed");
                    } else if ((prc[cp - 1] == 1) && (cood == cp)) {
                        prc[cp - 1] = 0;
                        election(n); // Trigger election if coordinator is crashed
                    } else {
                        System.out.println("\nProcess " + cp + " Is Already Crashed");
                    }
                    break;
                case 2:
                    // Simulate process recovery
                    System.out.println("\nEnter A Process To Recover");
                    int rp = Integer.parseInt(br.readLine());
                    if ((rp < 1) || (rp > n)) {
                        System.out.println("Invalid Process! Enter A Valid Process");
                    } else if (prc[rp - 1] == 1) {
                        System.out.println("Process " + rp + " Is Not Crashed");
                    } else {
                        prc[rp - 1] = 1;
                        System.out.println("Process " + rp + " Has Been Recovered");
                    }
                    break;
                case 3:
                    // Display the current coordinator
                    System.out.println("\nCurrent Coordinator Is " + cood);
                    break;
                case 4:
                    // Exit the program
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid Entry!");
                    break;
            }
        } while (ch != 4);
    }

    // Main method to start the program
    public static void main(String args[]) throws IOException {
        BullyAlgo ob = new BullyAlgo();
        ob.Bully();
    }
}
