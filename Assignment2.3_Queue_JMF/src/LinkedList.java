/**
* This class provides a linkedlist to be used by Queue to act as a body for the queue
* @author James Frayser
* LinkedList.java
* @version 9/29/2022
*/
public class LinkedList<T> {
       
       /**
       * methods
       */
       Node<T> head;
       int length;
       Node<T> tail;
       
       /**
       * empty argument constructor
       */
       public LinkedList()
       {
              head=null;
              length=0;
              tail=head;
       }
       
       /**
       * isEmpty asks if the list is empty
       * @return
       */
       public boolean isEmpty()
       {
              if (head==null) { return true;}
              else return false;
       }
       /**
       * getter
       * @return
       */
       public Node<T> getList()
       {
              return head;
       }
       
       /**
       * adds a node to the list
       * @param aNode
       */

       public void addNode(Node<T> aNode)
       {
              if (isEmpty() ) {
                     head = aNode;
                     tail=head;
                     return;
              }
              tail.nextNode=aNode;
              tail=tail.nextNode;
              tail.nextNode=null;
              length++;
              
       }
}//end class

