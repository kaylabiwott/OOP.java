public class introduction {// This program displays a greeting message

    public class Greeter {
    
        // This method prints a greeting message
        void greet() {
            System.out.println("Hello! Welcome to Java programming.");
        }
    
        // The main method is the starting point of any Java program
        public static void main(String[] args) {
            // Create a new Greeter object and call the greet method
            Greeter myGreeter = new Greeter();
            myGreeter.greet();
        }
    }
    
}
