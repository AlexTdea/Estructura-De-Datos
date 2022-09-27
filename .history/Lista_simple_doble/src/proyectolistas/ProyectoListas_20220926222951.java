package proyectolistas;

import javax.swing.JOptionPane;

public class ProyectoListas {

    public static void main(String[] args) {
        int dato, opcion;
        ListaDoble ls = new ListaDoble();
        String Menu = "**Menu**" + "\n" +
                "1." + "Mostrar" + "\n" +
                "2." + "pregunta 1" + "\n" +
                "3." + "pregunta 2" + "\n" +
                "4." + "pregunta 3" + "\n" +
                "5." + "pregunta 4" + "\n" +
                "6." + "pregunta 5" + "\n" +
                "0." + "salir" + "\n" +
                "Digite la opción a elegir ";

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
