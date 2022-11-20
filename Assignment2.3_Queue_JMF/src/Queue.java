/**
* This class is meant to make a queue for a line at a fast food place. This class can place people in line and remove them when they are served.
* @author James Frayser
* Queue.java
* @version 9/29/2022
*/
public class Queue<T> extends Node<T> implements QueueInterface<T> {

       private Node<T> front;
       Node<T> rear;
       private int queueSize;
       
       /**
       * Empty argument constructor
       */
       public Queue()
             {
              front = null;
              rear = null;
              queueSize = 0;
             }//end Queue
       
       /**
       * checks to see if the Queue is empty
       * @return: a boolean, true if empty, false if not
       */
              public boolean isEmpty()
              {
                     return (queueSize == 0);
              }//end isEmpty
       
         
              /**
              * Adds a customer to the line by placing them in the rear, and moving them up when a new one is added
              * @param data: the item being added to the queue
              */
              public void enqueue(T data)
              {
                     Node<T> oldRear = rear;
                     rear = new Node<T>();
                     rear.data = data;
                     rear.nextNode = null;
                     if (isEmpty()) 
                     {
                           front = rear;
                     }
                     else  {
                           oldRear.nextNode = rear;
                     }
                     queueSize++;
                     System.out.println(data+ " has been added to the queue");
              }//end enqueue
              
              /**
              * Removes the head from the queue, replacing it with the second in line, becoming the head
              */
              public T dequeue()
              {
                     T data = front.data;
                     front = front.nextNode;
                     if (isEmpty()) 
                     {
                           rear = null;
                     }
                     queueSize--;
                     System.out.println("Element " + data+ " removed from the queue");
                     return data;
              }//end dequeue

              /**
              * here because the class needs them, but they aren't used
              */
              public T getFront() {
                     return data;
              }

              public void clear() {
                     
              }
              
              /**
               * prints out the head and the tail of the queue in the main
               */
               public void positions() {
                      System.out.println("Front of the queue: " + front.data + ", Rear of the queue: " + rear.data);
               }//end positions
              
}//end class

