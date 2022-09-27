package proyectolistas;

import javax.swing.JOptionPane;

public class ProyectoListas {

    public static void main(String[] args) {
        int dato, opcion;
        ListaSimpleCircular ls = new ListaSimpleCircular();
        String Menu = "**Menu**\n" +
                "1.	Mostrar \n" +
                "2.	Insertar al inicio \n" +
                "3.	Insertar al final\n" +
                "4.	Eliminar primer\n" +
                "5.	Tamaño\n" +
                "6.	head & tail\n" +
                "0.	salir\n" +
                "\n" +
                "Digite la opción a elegir ";

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(Menu));
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                default:
                    System.exit(0);
                    break;

            }
        } while (opcion != 0);
    }



}
// METODO PARA ELIMINAR EL ULTIMO NODO DE LA LISTA SOLO SI ESTE ES PAR CASO
// CONTRARIO INSERTAR UN DATO ANTES DEL ULTIMO NODO
