
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
    
    //getters
    public Nodo getSiguiente() {
        return siguiente;
    }
    
    public Nodo getAnterior() {
        return anterior;
    }
    
    public int getDato() {
        return dato;
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
