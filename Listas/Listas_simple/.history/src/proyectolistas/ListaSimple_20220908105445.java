
package proyectolistas;

import javax.swing.JOptionPane;

public class ListaSimple {
    private Nodo Cab;

    public ListaSimple() {
        Cab = null;

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        this.insertar(numbers);
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
        if (Cab == null) {
            JOptionPane.showConfirmDialog(null, "Lista Vacia");
        } else {
            Nodo aux = Cab;
            Nodo aux2 = null;
            boolean flag = false;

            while (aux != null && flag == false) {
                if (aux.getDato() == dato) {
                    flag = true;
                } else {
                    aux2 = aux;
                    aux = aux.getLiga();
                }
            }

            if (flag == false) {
                JOptionPane.showInputDialog(null, "No se encontró el dato");
            } else {
                if (aux.getDato() == this.Cab.getDato()) {
                    this.Cab = this.Cab.getLiga();
                } else {
                    aux2.setLiga(aux.getLiga());
                }
            }
        }
    }

    // delete all nodes from a linked list
    public void deleteList() {
        Cab = null;
    }

    // delete penultimate node
    public void deletePenultimate() {
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


    // insert simple linked list by array
    public void insertar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            insertarFinal(array[i]);
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
