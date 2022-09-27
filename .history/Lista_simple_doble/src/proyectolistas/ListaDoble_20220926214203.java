
package proyectolistas;

import javax.swing.JOptionPane;

import javafx.scene.Node;

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
    public void pregunta1(int dato) {
        if (isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
            return;
        }

        Nodo aux = head;
        int menor = aux.getDato();
        while(aux != null) {
            if (aux.getDato() < menor) {
                menor = aux.getDato();
            }
            aux = aux.getSiguiente();
        }

        if (menor % 2 != 0) {
            // elimina el penultimo de la lista
        } else {
            // insertar un dato antes del segundo nodo

        }
    }


    // insertar un datos antes del segundo nodo
    public void insertarBeforeSecond(int dato) {
        int index = 0;

        if (isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
            return;
        }

        Nodo aux = head;
        Nodo segundo = null;
        while(aux.getSiguiente() != null && index < 2) {
            segundo = aux;
            aux = aux.getSiguiente();
            index = index + 1;
        }

        if (segundo != null) {
            Nodo aux2 = segundo.getAnterior();
            Nodo nuevo = new Nodo(dato);

            aux2.setSiguiente(nuevo);
            nuevo.setAnterior(aux2);
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
