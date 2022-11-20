/**
* Node uses the Linked list to call and look at what nodes there are present
* using generics.
* @author James Frayser
* Node.java
* @version 9/22/2002
*/
class Node<T> {
       /**
       * methods
       */
       T data;
       Node<T> nextNode;
       
       /**
       * empty argument constructor
       */
       public Node()
       {
              nextNode=null;
              data=null;
       }
       
       /**
       * getter and setter
       * @param data
       */
       public void setData(T data) {
              this.data=data;
       }
       
       public Node<T> getNode() {
              return this;
       }
       
       /**
       * setNextNode calls to set the new node
       * @param nextNode
       */

       public void setNextNode(Node<T> nextNode)
       {
              this.nextNode=nextNode;
       }
       
       
       
}//end class

