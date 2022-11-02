package stack;

import javax.swing.JOptionPane;

public class Stack {
    int tam, tope;
    int vecStack[];

    // METODO CONSTRUCTOR
    public Stack(int tam) {
        this.tam = tam;
        this.tope = -1;
        this.vecStack = new int[tam];
    }

    // isEmpty
    public boolean isEmpty() {
        if (tope == -1) {
            return true;
        } else {
            return false;
        }
    }

    // isFull
    public boolean isFull() {
        if (tope >= tam - 1) {
            return true;
        } else {
            return false;
        }
    }

    // get tope
    public int getTope() {
        return tope;
    }

    //get size
    public int getSize() {
        return tam;
    }
    // apilar
    public void apilar(int dato) {
        if (isFull()) {
            JOptionPane.showMessageDialog(null, "La pila esta llena");
            return;
        }
        
        if (dato == -1) {
            return;
        }

        if (isFull()) {
            JOptionPane.showMessageDialog(null, "La pila esta llena");
            return;
        }
        tope++;
        vecStack[tope] = dato;
    }

    // desapilar
    public int desapilar() {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "La pila esta vacia");
            return -1;
        }
        int dato = vecStack[tope];
        tope--;
        return dato;
    }


    // mostrar
    public void mostrar() {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "La pila esta vacia");
            return;
        }

        String datos = "";
        for (int i = tope; i >= 0; i--) {
            datos += vecStack[i] + "; ";
        }
        JOptionPane.showMessageDialog(null, datos);
    }


    public int[] getVecStack() {
        return vecStack;
    }

    public void setVecStack(int[] vecStack) {
        this.vecStack = vecStack;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    // getDato by position
    public int getDato(int pos) {
        // check if pos is valid
        if (pos < 0 || pos > tam) {
            JOptionPane.showMessageDialog(null, "Posicion no valida");
            return -1;
        }

        int dato = vecStack[pos];
        if (dato == 0) {
            return -1;
        }

        return dato;
    }
}