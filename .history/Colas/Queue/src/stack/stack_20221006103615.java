package stack;

import javax.swing.JOptionPane;

public class stack {
    int tam, tope;
    int vecPila[];

    public stack(int tam) {
        this.tam = tam;
        this.tope = -1;
        this.vecPila = new int[tam];
    }

    public boolean pilaLlena() {
        if (tope == tam - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pilaVacia() {
        if (tope == -1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String cadena = "Pila: ";
        for (int i = tope; i >= 0; i--) {
            cadena = cadena + vecPila[i] + " ";
        }
        return cadena;
    }

}
