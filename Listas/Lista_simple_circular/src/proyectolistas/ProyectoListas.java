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
                    show(ls);
                    break;
                case 2:
                    dato = Integer.parseInt(JOptionPane.showInputDialog("Inserte un dato"));
                    ls.addAt(dato, 0);
                    break;
                case 3:
                    dato = Integer.parseInt(JOptionPane.showInputDialog("Inserte un dato"));
                    ls.addAt(dato, ls.getSize());
                    break;
                case 4:
                    ls.deleteStart();
                    break;
                case 5:
                    break;
                case 6:
                    String head = String.valueOf(ls.getHead().getDato());
                    String tail = String.valueOf(ls.getTail().getDato());

                    JOptionPane.showMessageDialog(null, "head: " + head + " tail: " + tail);
                    break;    
                case 0:
                    System.exit(0);
                    break;

            }
        } while (opcion != 0);
    }

    public static void show(ListaSimpleCircular ls) {
        JOptionPane.showMessageDialog(null, ls.toString());
    }


}
// METODO PARA ELIMINAR EL ULTIMO NODO DE LA LISTA SOLO SI ESTE ES PAR CASO
// CONTRARIO INSERTAR UN DATO ANTES DEL ULTIMO NODO
