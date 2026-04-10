package control;

import model.Contact;
import model.Node;

public class CircularLinkedList {
    private Node tail;
    private int size;

    public CircularLinkedList(){
        this.tail = null;
        this.size = 0;
    }

    //Insertar al final de la lista
    public void add(Contact contact){
        Node newNode = new Node(contact);

        if (tail == null) {
            //Lista vacia
            tail = newNode;
            tail.setNext(tail);
        }else{
            //Lista con mas de 1 elemento
            newNode.setNext(tail.getNext());
            tail.setNext(newNode);
            tail = newNode;
        }
        size ++;
    }

    //Buscar por nombre
    public Contact findByName(String Name){
        if(tail == null) return null;

        Node current = tail.getNext();//primer nodo

        do {
            if (current.getValue().getFullName()
                    .equalsIgnoreCase(name)){
                return current.getValue();
            }
            current = current.getNext();
        }while (current != tail.getNext());
        return null;
    }
}
