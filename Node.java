package ListasLigadasAdn;

public class Node {
    private Character data;
    public Node prev;
    public Node next;

    public Node (Character data){
        this.data=data;
        prev=null;
        next=null;
    }

    public Node (Character data, Node prev, Node next){
        this.data=data;
        this.prev=prev;
        this.next=next;
    }

    public Character getData() {
        return data;
    }

    public void setData(Character valor) {
        data = valor;
    }
    public Node getPrev(){
        return prev;
    }

    public Node getNext(){
        return next;
    }

    public void setPrev(Node node){
        prev=node;
    }

    public void setNext(Node node){
        next=node;
    }
    
}
