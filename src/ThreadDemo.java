package threading;
class Printer extends Thread{
    String message;
    public void setMessage(String message)
    {
        this.message = message;
    }
    @Override
    public void run()
    {
        for(char ch:message.toCharArray())
        {
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.getStackTrace();
            }
            System.out.print(ch);

        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        // Creating instance of Printer class.--------------------------------->
        Printer printer = new Printer();
        printer.setName("Thread1"); 
        printer.setMessage("Hello, how are you ?"); // Calling the setMessage function of the Printer class.
        System.out.println(printer.getName());
        printer.start(); // Thread will start


        // Creating another instance of the Printer class.---------------------------->
        Printer anotherPrinter = new Printer();
        anotherPrinter.setName("Thread2");
        anotherPrinter.setMessage("I am fine");
        anotherPrinter.start();
        System.out.println("End of Main"); // This is printed first because after this main method dies and non demon thread continuous to work even after the main method dies.

    }
}
