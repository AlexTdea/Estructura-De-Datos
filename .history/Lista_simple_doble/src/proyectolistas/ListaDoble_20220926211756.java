
package proyectolistas;

import javax.swing.JOptionPane;

public class ListaDoble {
    // define variables
    private Nodo head;
    private Nodo tail;
    private int size;

    public ListaDoble(){
        this.head=this.tail = null;

        int [] elm = {1,2,3,4,5,6,7,8,9,10};
        this.llenarLista(elm);
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void show() {
        JOptionPane.showMessageDialog(null, this.toString());
    }


    // methods
    @Override
    public String toString() {
        if (isEmpty() == true) {
            return "Lista vacia";
        }

        String list = "";
        Nodo aux = head;
        while(aux != null) {
            list = list + "[" + aux.getDato() + "] <=>";
            aux = aux.getSiguiente();
        }

        return list;
    }

    // Recorre hasta llegar al ultimo Nodo
    // se obtiene el penultimo
    // preguntar si el penultimo es impar
    // si el penultimo es impar lo elimina de la lista
    // sino es obtiene el primer nodo y se inserta un dato en el siguiente
    // Termina
    public void pregunta1() {
        if (isEmpty() == true) {
            return;
        }

        Nodo aux = head;
        Nodo penultimo = null;
        while(aux.getSiguiente() != null) {
            penultimo = aux;
            aux = aux.getSiguiente();
        }

        if (penultimo.getDato() % 2 != 0) {
            penultimo.setSiguiente(null);
            tail = penultimo;
        } else {
            Nodo nuevo = new Nodo(0);
            nuevo.setSiguiente(head.getSiguiente());
            head.setSiguiente(nuevo);
        }
    }

    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (isEmpty() == true) {
            head = tail = nuevo;
        } else {
            tail.setSiguiente(nuevo);
            nuevo.setAnterior(tail);
            tail = nuevo;
        }
        size++;
    }

    public void llenarLista(int[] data) {
        for (int i = 0; i < data.length; i++) {
            insertar(data[i]);
        }
    }
}
