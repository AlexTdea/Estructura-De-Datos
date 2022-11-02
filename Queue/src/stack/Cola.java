
package stack;

import javax.swing.JOptionPane;

public class Cola {
    int size, primero, ultimo;
    int vCola[];

    // METODO CONSTRUCTOR
    public Cola(int size) {
        this.size = size;
        this.vCola = new int[size];
        this.primero = -1;
        this.ultimo = -1;
    }

    // constructor without size
    public Cola() {
        this.size = 10;
        this.vCola = new int[10];
        this.primero = -1;
        this.ultimo = -1;
    }

    // isEmpty
    public boolean isEmpty() {
        if (primero == -1) {
            return true;
        } else {
            return false;
        }
    }

    // get dato by position
    public int getDatoByPosition(int position) {
        if (position < 0 || position > size) {
            JOptionPane.showMessageDialog(null, "Posicion no valida");
            return -1;
        }

        int dato = vCola[position];

        if (dato == 0) {
            JOptionPane.showMessageDialog(null, "No hay datos en la posicion indicada");
            return -1;
        }

        return vCola[position];
    }

    // isFull
    public boolean isFull() {
        if (ultimo > size - 1) {
            return true;
        } else {
            return false;
        }
    }

    // equeue
    public void encolar(int dato) {
        if (dato == -1) {
            return;
        }

        if (isFull()) {
            JOptionPane.showMessageDialog(null, "Cola llena");
            return;
        }

        if (isEmpty()) {
            primero = 0;
            ultimo = 0;
        }

        vCola[ultimo] = dato;
        ultimo++;

        if (ultimo == 0) {
            primero = 0;
        }
    }

    // dequeue
    public int desencolar() {
        if (isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Cola vacia");
            return -1;
        }

        int dato = vCola[primero];

        if (primero >= ultimo) {
            primero = -1;
            ultimo = -1;
        } else {
            primero++;
        }

        if (dato == 0) {
            JOptionPane.showMessageDialog(null, "Cola vacia");
            return -1;
        }

        return dato;
    }

    // show the queue
    public void mostrarCola() {
        // check if empty
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cola vacia");
            return;
        }

        String cola = "";
        for (int i = 0; i < vCola.length; i++) {
            cola += vCola[i] + " ";
        }
        JOptionPane.showMessageDialog(null, cola);
    }

    // getters and setters
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrimero() {
        return primero;
    }

    public void setPrimero(int primero) {
        this.primero = primero;
    }

    public int getUltimo() {
        return ultimo;
    }

    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }

    public int[] getvCola() {
        return vCola;
    }

    public void setvCola(int[] vCola) {
        this.vCola = vCola;
    }
}
