
package proyectolistas;

import javax.swing.JOptionPane;

public class ListaDoble {
    // define variables
    private Nodo head;
    private Nodo tail;
    private int size;

    
    // constructor with no params
    public ListaDoble() {
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

}
