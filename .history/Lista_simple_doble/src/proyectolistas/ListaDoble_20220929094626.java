
package proyectolistas;

import javax.swing.JOptionPane;

import javafx.scene.Node;

public class ListaDoble {
    // define variables
    private Nodo head;
    private Nodo tail;
    private int size;

    public ListaDoble() {
        this.head = this.tail = null;

        int[] elm = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        this.llenarLista(elm);
    }

    @Override
    public String toString() {
        if (isEmpty() == true) {
            return "Lista vacia";
        }

        String list = "";
        Nodo aux = head;
        while (aux != null) {
            list = list + "[" + aux.getDato() + "] <=>";
            aux = aux.getSiguiente();
        }

        return list;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void show() {
        JOptionPane.showMessageDialog(null, this.toString());
    }

    // Methods
    public void pregunta1(int dato) {
        if (isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
            return;
        }

        Nodo actual = head.getSiguiente(); // NULL
        int menor = head.getDato(); // 1
        while (actual != null) {
            if (actual.getDato() < menor) {
                menor = actual.getDato();
            }
            actual = actual.getSiguiente();
        }

        if (menor % 2 != 0) {
            this.eliminarPenultimo();
        } else {
            int nuevoDato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dato"));
            this.insertarBeforeSecond(nuevoDato);
        }
    }

    public void pregunta2(int dato) {
        if (isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
            return;
        }
        Nodo actual = head.getSiguiente();
        int menor = head.getDato();
        while (actual != null) {
            if (actual.getDato() < menor) {
                menor = actual.getDato();
            }
            actual = actual.getSiguiente();
        }

        if (menor % 2 == 0) {
            insertarBeforeSecond(dato);
        }else {
            deleteSecondLast();
        }
    }

    public void pregunta3(int dato) {
        if (isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
            return;
        }
        Nodo actual = head.getSiguiente();
        int menor = head.getDato();
        while (actual != null) {
            if (actual.getDato() < menor) {
                menor = actual.getDato();
            }
            actual = actual.getSiguiente();
        }

        if (menor % 2 != 0) {
            deleteSecondLast();
        }else {
            insertAfterSecond(dato);
        }
    }

    public void insertarBeforeSecond(int dato) {
        if (isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
            return;

        }

        Nodo segundo = head.getSiguiente();
        Nodo nuevo = new Nodo(dato);

        if (segundo == null) {
            head.setSiguiente(nuevo);
            JOptionPane.showMessageDialog(null, "No existe segundo");
            return;
        }

        nuevo.setSiguiente(segundo);
        nuevo.setAnterior(head);
        head.setSiguiente(nuevo);
        segundo.setAnterior(nuevo);
        size++;
    }

    public void eliminarPenultimo() {
        if (isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
            return;
        }

        Nodo ultimo = head;
        Nodo penultimo = null;
        while (ultimo.getSiguiente() != null) {
            penultimo = ultimo;
            ultimo = ultimo.getSiguiente();
        }

        if (penultimo != null) {
            Nodo aux = penultimo.getAnterior();
            aux.setSiguiente(ultimo);
        }
    }

    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (isEmpty() == true) {
            head = tail = nuevo;
        } else {
            tail.setSiguiente(nuevo);
            nuevo.setAnterior(tail);
            tail = nuevo;
        }
        size++;
    }

    public void llenarLista(int[] data) {
        for (int i = 0; i < data.length; i++) {
            insertar(data[i]);
        }
    }

    public void insertAfterSecondLast(int data) {
        if (isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "List empty");
        }

        Nodo aux = head;
        Nodo secondLast = null;
        Nodo nuevo = new Nodo(data);

        while (aux.getSiguiente() != null) {
            secondLast = aux.getAnterior();
            aux = aux.getSiguiente();
        }

        if (secondLast == null) {
            JOptionPane.showMessageDialog(null, "No existe penultimo");
            aux.setSiguiente(nuevo);
            return;
        }

        nuevo.setAnterior(secondLast);
        nuevo.setSiguiente(aux);
        aux.setAnterior(nuevo);
        secondLast.setSiguiente(nuevo);
        size++;
    }

    public void deleteAfterSecond() {
        if (isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Empty List");
            return;
        }

        Nodo second = head.getSiguiente();

        if (second == null) {
            JOptionPane.showMessageDialog(null, "there is no second node");
            return;
        } else {
            Nodo aux = second.getSiguiente().getSiguiente();
            second.setSiguiente(aux);

            if (aux != null) {
                aux.setAnterior(second);
            }
        }
    }

    public void deleteSecondLast() {
        if (isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Empty List");
            return;
        }

        Nodo aux = head;
        Nodo secondLast = null;

        while (aux.getSiguiente() != null) {
            secondLast = aux;
            aux = aux.getSiguiente();
        }

        if (secondLast == null) {
            JOptionPane.showMessageDialog(null, "No existe penultimo");
            return;
        } else {
            Nodo aux2 = secondLast.getAnterior();
            aux2.setSiguiente(aux);
            aux.setAnterior(aux2);
            size--;
        }
    }

    public void insertAfterSecond(int dato) {
        if (isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Empty List");
            return;
        }

        Nodo segundo = head.getSiguiente();
        Nodo nuevo = new Nodo(dato);

        if (segundo == null) {
            JOptionPane.showMessageDialog(null, "No existe segundo");
            return;
        }

        Nodo aux = segundo.getSiguiente();
        nuevo.setSiguiente(aux);
        nuevo.setAnterior(segundo);
        segundo.setSiguiente(nuevo);
        size++;
    }
}
