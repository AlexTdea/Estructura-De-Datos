
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

    public void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (Cab == null) {
            Cab = nuevo;
        } else {
            Nodo aux = Cab;
            while (aux.getLiga() != null) {
                aux = aux.getLiga();
            }
            aux.setLiga(nuevo);
        }
    }

    public void mostrar() {
        Nodo aux = Cab;
        String cad = "";
        while (aux != null) {
            cad = cad + aux.getDato() + " ";
            aux = aux.getLiga();
        }
        JOptionPane.showMessageDialog(null, cad);
    }

    public void EliminarPrimerDato() {
        if (Cab != null) {
            Cab = Cab.getLiga();
        }
    }

    public void EliminarUltimo() {
        if (Cab != null) {
            Nodo aux = Cab;
            Nodo aux2 = Cab;
            while (aux.getLiga() != null) {
                aux2 = aux;
                aux = aux.getLiga();
            }
            aux2.setLiga(null);
        }
    }

    public void EliminarDato(int dato) {
        if (Cab != null) {
            Nodo aux = Cab;
            Nodo aux2 = Cab;
            while (aux.getDato() != dato) {
                aux2 = aux;
                aux = aux.getLiga();
            }
            aux2.setLiga(aux.getLiga());
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
