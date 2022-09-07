
package proyectolistas;

import javax.swing.JOptionPane;

public class ListaSimple {
    private Nodo Cab;

    public ListaSimple() {
        Cab = null;
    }

    public void insertarInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (Cab == null) {
            Cab = nuevo;
        } else {
            nuevo.setLiga(Cab);
            Cab = nuevo;
        }
    }

    // getters Cab
    public Nodo getCab() {
        return Cab;
    }

    // setters Cab
    public void setCab(Nodo Cab) {
        this.Cab = Cab;
    }



}
