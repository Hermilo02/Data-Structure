package ListasLigadasAdn;

public class Lista {
    public Node head;
    public Node tail;
    public int length;

    public Lista(){
        head = new Node('\0', null, null);  
        tail = new Node('\0', null, null);
        head.setNext(tail);
        length=0;
    }

    public void insertAtBegining(Character newData){
        Node newNodo = new Node(newData, null, head.next);
        newNodo.getNext().setPrev(newNodo); 
        head=newNodo;
        length++;
    }

    public void insertAtTail(Character data){
        Node newNodo = new Node(data, tail.getPrev(), tail);
        newNodo.getPrev().setNext(newNodo);
        tail.setPrev(newNodo);
        length++;
    }

    // Return a string representation of this collection, in the form: ["str1","str2",...].
   public String toString() {
    String result = "[]";
    if (length == 0)
      return result;
    result = "[" + head.getData();
    Node temp = head.getNext();
    while (temp != tail) {
      result += "," + temp.getData();
      temp =  temp.getNext();
    }
    return result + "]";
  }	
  
  // Remove everything from the DLL.
  public void clearList(){
    head = null;
    tail = null;
    length = 0;
  }

    public int getSizeL(){
        return length;
       }

}
