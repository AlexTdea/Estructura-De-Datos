package proyectolistas;

import javax.swing.JOptionPane;

public class ProyectoListas {

    public static void main(String[] args) {
        int dato, opcion;
        ListaDoble ls = new ListaDoble();
        String Menu = """
            Menu
            1.
            2.
            3.
            4.
            5.
            6.
        """;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(Menu));
            switch (opcion) {
                case 1:
                    ls.show();
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
                    break;    
                case 0:
                    System.exit(0);
                    break;

            }
        } while (opcion != 0);
    }



}
// METODO PARA ELIMINAR EL ULTIMO NODO DE LA LISTA SOLO SI ESTE ES PAR CASO
// CONTRARIO INSERTAR UN DATO ANTES DEL ULTIMO NODO
