
package proyectolistas;

public class Nodo {
    private int dato;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
    // metodo para obtener un dato
    public int getDato() {
        return dato;
    }

    // metodo para asignar un dato
    public void setDato(int dato) {
        this.dato = dato;
    }

    // getters and setters
    

}
