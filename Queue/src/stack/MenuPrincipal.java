package stack;

import javax.swing.JOptionPane;

public class MenuPrincipal {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Stack pilaNueva = new Stack(
                Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de la pila")));
        Cola nuevaCola = new Cola(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de la cola")));

        int option = 0;
        do {
            option = Integer.parseInt(
                    JOptionPane.showInputDialog(null,
                            "1. Apilar" + "\n" +
                                    "2. Desapilar" + "\n" +
                                    "3. Mostrar datos de la pila" + "\n" +
                                    "4. Encolar" + "\n" +
                                    "5. Desencolar" + "\n" +
                                    "6. Pasar un dato de la pila a la cola" + "\n" +
                                    "7. Pasar un dato de la cola a la pila" + "\n" +
                                    "8. Mostrar datos de la cola" + "\n" +
                                    "9. Comparar la pila y la cola para ver si son iguales" + "\n" +
                                    "10. Salir" + "\n"));

            switch (option) {
                case 1:
                    pilaNueva.apilar(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dato a apilar")));
                    break;
                case 2:
                    int dato = pilaNueva.desapilar();

                    if (dato != -1) {
                        JOptionPane.showMessageDialog(null, "El dato desapilado es: " + dato);
                    }
                    break;
                case 3:
                    pilaNueva.mostrar();
                    // mostrar datos de la pila
                    break;
                case 4:
                    nuevaCola.encolar(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el dato a encolar:")));
                    // encolar
                    break;
                case 5:
                    int datoDesencolado = nuevaCola.desencolar();
                    if (datoDesencolado > -1) {
                        JOptionPane.showMessageDialog(null, "El dato desencolado es: " + datoDesencolado);
                    }
                    // desencolar
                    break;
                case 6:
                    int pos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la posicion del dato a pasar"));
                    passDataFromStackToQueue(pilaNueva, nuevaCola);
                    // pasar un dato de la pila a la cola
                    break;
                case 7:
                    int seachPos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la posicion del dato a pasar"));
                    passDataFromQueueToStack(nuevaCola, pilaNueva);
                    // pasar un dato de la cola a la pila
                    break;
                case 8:
                    nuevaCola.mostrarCola();
                    // mostrar datos de la cola
                    break;
                case 9:
                    compare(nuevaCola, pilaNueva);
                    // comparar la pila y la cola para ver si son iguales
                    break;
                case 10:
                    // salir
                    option = 0;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }
        } while (option != 0);
    }

    public static void compare(Cola queue, Stack stack) {
        if (queue.getSize() != stack.getTam()) {
            JOptionPane.showMessageDialog(null, "Las pilas y las colas no son iguales");
            return;
        }

        for (int i = 0; i < queue.getSize(); i++) {
            if (queue.getvCola()[i] != stack.getVecStack()[i]) {
                JOptionPane.showMessageDialog(null, "Las pilas y las colas no son iguales");
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Las pilas y las colas son iguales");
    }

    // pass data from queue to stack
    public static void passDataFromQueueToStack(Cola queue, Stack stack) {
        if (queue.getSize() == 0) {
            JOptionPane.showMessageDialog(null, "La cola esta vacia");
            return;
        }

        if (stack.getTam() == stack.getTope()) {
            JOptionPane.showMessageDialog(null, "La pila esta llena");
            return;
        }

        stack.apilar(queue.desencolar());
        
    }

    // pass data from stack to queue
    public static void passDataFromStackToQueue(Stack stack, Cola queue) {
        if (stack.getTam() == 0) {
            JOptionPane.showMessageDialog(null, "La pila esta vacia");
            return;
        }

        if (queue.getSize() == queue.getvCola().length) {
            JOptionPane.showMessageDialog(null, "La cola esta llena");
            return;
        }

        queue.encolar(stack.desapilar());
        
    }

}