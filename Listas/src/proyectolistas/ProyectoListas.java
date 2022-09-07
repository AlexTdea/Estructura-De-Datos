package proyectolistas;

import javax.swing.JOptionPane;

public class ProyectoListas {

    public static void main(String[] args) {
        int dato, opcion;
        ListaSimple ls = new ListaSimple();
        String Menu = "**Menu**\n" +
                "1.	Mostrar \n" +
                "2.	Insertar al inicio \n" +
                "3.	Insertar al final\n" +
                "4.	Eliminar primer\n" +
                "5.	Eliminar ultimo\n" +
                "6.	Eliminar un dato dado\n" +
                "0.	salir\n" +
                "\n" +
                "Digite la opción a elegir ";

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(Menu));
            switch (opcion) {
                case 1:
                    ls.mostrar();
                    break;
                case 2:
                    dato = Integer.parseInt(JOptionPane.showInputDialog("Inserte un dato"));
                    ls.insertarInicio(dato);
                    break;
                case 3:
                    dato = Integer.parseInt(JOptionPane.showInputDialog("Inserte un dato"));
                    ls.insertarFinal(dato);
                    break;
                case 4:
                    ls.EliminarPrimerDato();
                    break;
                case 5:
                    ls.EliminarUltimo();
                    break;
                case 6:
                    dato = Integer.parseInt(JOptionPane.showInputDialog("Inserte un dato"));
                    ls.EliminarDato(dato);
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
