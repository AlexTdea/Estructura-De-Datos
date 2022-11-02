package stack;

public class nodo {
    // atributos
    public char dato;
    public nodo siguiente;
    
    // constructor
    public nodo(char dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    // metodos
    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }
}
