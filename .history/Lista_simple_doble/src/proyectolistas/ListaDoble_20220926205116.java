
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
        JOptionPane.showMessageDialog(null, this.toString(), "Lista Doble");
    }

    @Override
    public String toString() {
        if (isEmpty() == true) {
            return "Lista vacia";
        }

        return "";
    }
}
