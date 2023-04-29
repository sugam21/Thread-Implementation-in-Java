# Thread-Implementation-in-Java
This work has one file <B>ThreadDemo.java</B><br>
Class <B>Printer</B> extends the class Thread and overrides the run() method. run() method takes in the message and inplements try, catch method which makes the thread
run after every 500ms, after that prints every character.<br>
Class <B>ThreadDemo</B> creates a Main method which initialise the 1st thread name printer and second thread name anotherPrinter. The name of both the threads is then set.
The message for both the threads is passed. Finally the thread is then started.
