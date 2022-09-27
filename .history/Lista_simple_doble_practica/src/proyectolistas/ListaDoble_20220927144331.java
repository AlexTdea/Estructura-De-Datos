
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

        int [] elm = {,2,3,4,5,6,7,8,9,10};
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
        while (aux != null) {
            list = list + "[" + aux.getDato() + "] <=>";
            aux = aux.getSiguiente();
        }

        return list;
    }

    public void pregunta2(int dato) {
        if (isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
            return;
        }
        Nodo actual1 = head.getSiguiente();
        int menor1 = head.getDato();
        while (actual1 != null) {
            if (actual1.getDato() < menor1) {

            }

        }
    }

}
