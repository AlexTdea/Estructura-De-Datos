
package proyectolistas;

import javax.swing.JOptionPane;

public class ListaDoble {
    // define variables
    private Nodo head;
    private Nodo tail;
    private int size;

    public ListaDoble() {
        this.head = this.tail = null;

        int[] elm = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        this.llenarLista(elm);
    }

    // primer pregunta
    public void pregunta1() {
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
         //segunda pregunta 
    public void pregunta2() {
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
            int Nuevodato2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo dato"));
            insertarBeforeSecond(Nuevodato2);
        } else {
            deleteSecondLast();
        }
    }
        //tercer pregunta
    public void pregunta3() {
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
        } else {
            int Nuevodato3= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo dato"));
            insertAfterSecond(Nuevodato3);
        }
    }
        // cuarta pregunta
    public void pregunta4() {
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
            int Nuevodato4= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo dato"));

            insertAfterSecondLast(Nuevodato4);
        } else {
            deleteAfterSecond();
        }
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void show() {
        JOptionPane.showMessageDialog(null, this.toString());
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
    // getters
    public Nodo getHead() {
        return head;
    }

    public Nodo getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    // setters
    public void setHead(Nodo head) {
        this.head = head;
    }

    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // Private Methods
    private void insertarBeforeSecond(int dato) {
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

    private void eliminarPenultimo() {
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

    private void insertAfterSecondLast(int dato) {
        if (isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "List empty");
        }

        Nodo aux = head;
        Nodo secondLast = null;
        Nodo nuevo = new Nodo(dato);

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
      //eliminar despues del segundo (cuarto metodo)
    private void deleteAfterSecond() {
        if (isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
            return;
        }

        Nodo second = head.getSiguiente();

        if (second == null) {
            JOptionPane.showMessageDialog(null, "No hay segundo nodo");
            return;
        } else {
            Nodo aux = second.getSiguiente().getSiguiente();
            second.setSiguiente(aux);

            if (aux != null) {
                aux.setAnterior(second);
            }
        }
    }
  //eliminar segundo de la lista
    private void deleteSecondLast() {
        if (isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
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
     // insertar antes del segundo
    private void insertAfterSecond(int dato) {
        if (isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Lista vacia");
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
