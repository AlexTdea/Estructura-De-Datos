package proyectolistas;

import javax.swing.JOptionPane;

public class ProyectoListas {

    public static void main(String[] args) {
        int dato, opcion;
        ListaDoble ls = new ListaDoble();
        String Menu = "**Menu**" + "\n" +
                "1." +	"Mostrar"   +   "\n" +
                "2." +	"pregunta " +   "\n" +
                "3." +	"pregunta " +   "\n" +
                "4." +	"pregunta " +   "\n" +
                "5." +	"pregunta " +   "\n" +
                "6." +	"pregunta " +   "\n" +
                "0.	salir"+ "\n" +
                "\n" +
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
// METODO PARA ELIMINAR EL ULTIMO NODO DE LA LISTA SOLO SI ESTE ES PAR CASO
// CONTRARIO INSERTAR UN DATO ANTES DEL ULTIMO NODO
