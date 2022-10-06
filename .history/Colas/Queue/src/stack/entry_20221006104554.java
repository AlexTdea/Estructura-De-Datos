package stack;

import javax.swing.JOptionPane;

public class entry {
    public static void main(String[] args) {
        


        menu();
    }

    public static void menu() {
        
        // apilar
        // desapilar
        // mostrar datos de la pila
        // encolar
        // desencolar
        // pasar un dato de la pila a la cola
        // pasar un dato de la cola a la pila
        // mostrar datos de la cola
        // comparar la pila uy la cola para ver si son iguales
        // salir

        int option = 0;
        do {
            // using triple """ print the menu
            option = Integer.parseInt(JOptionPane.showInputDialog("""
                    1. Apilar
                    2. Desapilar
                    3. Mostrar datos de la pila
                    4. Encolar
                    5. Desencolar
                    6. Pasar un dato de la pila a la cola
                    7. Pasar un dato de la cola a la pila
                    8. Mostrar datos de la cola
                    9. Comparar la pila y la cola para ver si son iguales
                    10. Salir"""));


                    option = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero para la opcion deseada:"));
            switch (option) {
                case 1:
                    // apilar
                    break;
                case 2:
                    // desapilar
                    break;
                case 3:
                    // mostrar datos de la pila
                    break;
                case 4:
                    // encolar
                    break;
                case 5:
                    // desencolar
                    break;
                case 6:
                    // pasar un dato de la pila a la cola
                    break;
                case 7:
                    // pasar un dato de la cola a la pila
                    break;
                case 8:
                    // mostrar datos de la cola
                    break;
                case 9:
                    // comparar la pila uy la cola para ver si son iguales
                    break;
                case 10:
                    // salir
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }

        } while (option != 0);
    }
}
