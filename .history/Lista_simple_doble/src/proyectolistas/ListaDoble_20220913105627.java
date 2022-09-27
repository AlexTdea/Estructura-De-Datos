
package proyectolistas;

import javax.swing.JOptionPane;

public class ListaSimpleCircular {
    // define variables
    private Nodo head;
    private Nodo tail;
    private int size;

    
    // constructor with no params
    public ListaSimpleCircular() {
        this.head = null;
        this.tail = null;

        int [] datos = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < datos.length; i++) {
            this.add(datos[i]);
        }
    }

    // getters 
    public Nodo getHead() {
        return head;
    }

    public Nodo getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    // setters

    public void setHead(Nodo head) {
        this.head = head;
    }

    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // methods
    public void add(int data) {
        Nodo newNode = new Nodo(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.setLiga(head);
        } else {
            tail.setLiga(newNode);
            tail = newNode;
            tail.setLiga(head);
        }
        size++;
    }
    
    public void addAt(int data, int index) {
        if (index == 0) {
            addAtStart(data);
        } else if (index == size) {
            add(data);
        } else if (index > size) {
            JOptionPane.showMessageDialog(null, "Index out of bounds");
        } else {
            Nodo newNode = new Nodo(data);
            Nodo temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getLiga();
            }
            newNode.setLiga(temp.getLiga());
            temp.setLiga(newNode);
            size++;
        }
    }

    public void addAtStart(int data) {
        Nodo newNode = new Nodo(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.setLiga(head);
        } else {
            newNode.setLiga(head);
            head = newNode;
            tail.setLiga(head);
        }
        size++;
    }

    public void deleteStart() {
        if (head == null) {
            JOptionPane.showMessageDialog(null, "List is empty");
        } else {
            head = head.getLiga();
            tail.setLiga(head);
            size--;
        }
    }

    // override toString method
    @Override
    public String toString() {
        String result = "";
        Nodo temp = head;
        if (head == null) {
            result = "List is empty";
        } else {
            do {
                result += temp.getDato() + " ";
                temp = temp.getLiga();
            } while (temp != head);
        }
        return result;
    }

}
