
package proyectolistas;

import javax.swing.JOptionPane;

public class ListaDoble {
    // define variables
    private Nodo head;
    private Nodo tail;
    private int size;

    public ListaDoble(){
        this.head=this.tail = null;
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

    }

    public void insertarSiguiente() {

    }
}
