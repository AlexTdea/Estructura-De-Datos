
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

    //getters
    public Nodo getSiguiente() {
        return siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }
    
    //setters
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    public void setDato(int dato) {
        this.dato = dato;
    }

}
