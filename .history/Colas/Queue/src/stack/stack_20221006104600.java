package stack;

import javax.swing.JOptionPane;



public class stack {
    int tam, tope;

    public stack(int tam) {
        this.tam = tam;
        this.tope = -1;
    }

    public void unStack(char[] pila, char dato) {
        if (tope < tam - 1) {
            tope++;
            pila[tope] = dato;
        } else {
            JOptionPane.showMessageDialog(null, "La pila esta llena");
        }
    }

    public int getTam() {
        return tam;
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

    public char[] getStack(char[] pila) {
        if (!pilaVacia()) {
            return pila;
        } else {
            JOptionPane.showMessageDialog(null, "La pila esta vacia");
            return null;
        }
    }
}
