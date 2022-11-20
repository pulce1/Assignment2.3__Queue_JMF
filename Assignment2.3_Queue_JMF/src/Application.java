/**
* This class is meant to make a queue for a line at a fast food place. This class can place people in line and remove them when they are served.
* @author James Frayser
* Application.java
* @version 9/29/2022
*/
public class Application {

       @SuppressWarnings("unchecked")
       public static void main(String[] args) {
              @SuppressWarnings("rawtypes")
              Queue queue = new Queue();
              
              queue.enqueue("Bill");
              queue.enqueue("Alice");
              queue.enqueue("Bob");
              queue.positions();
              queue.dequeue();
              queue.enqueue("Jane");
              queue.enqueue("Hamad");
              queue.positions();
              queue.dequeue();
              queue.dequeue();
              queue.enqueue("Jim");
              queue.positions();
              queue.dequeue();
              queue.dequeue();
              queue.dequeue();
              System.out.println("Jim deserved his veggie burger, Jim gets to be happy");

       }//end main

}//end class

