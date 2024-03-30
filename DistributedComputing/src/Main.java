public class Main {
    public static void main(String[] args) {
        // Create instances of your ClientOne and ClientTwo classes
        ClientOne clientOne = new ClientOne();
        ClientTwo clientTwo = new ClientTwo();

        // Create threads for each client
        Thread threadOne = new Thread(String.valueOf(clientOne));
        Thread threadTwo;
        threadTwo = new Thread(String.valueOf(clientTwo));

        // Start the threads
        threadOne.start();
        threadTwo.start();

        try {
            // Wait for both threads to finish
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // All processes have finished
        System.out.println("All processes have finished.");
    }
}
