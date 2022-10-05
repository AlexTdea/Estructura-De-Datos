package proyectolistas;

import javax.swing.JOptionPane;

public class ProyectoListas {

    public static void main(String[] args) {
        int opcion;
       
        DoblementeLigada ls = new DoblementeLigada();
        String Menu = "**Menu**" + "\n" +
                "1." + "Mostrar" + "\n" +
                "2." + "pregunta 1" + "\n" +
                "3." + "pregunta 2" + "\n" +
                "4." + "pregunta 3" + "\n" +
                "5." + "pregunta 4" + "\n" +
                "6." + "Ingresar un dato al final" + "\n" +
                "7." + "Ingresar un dato al principio" + "\n" +
                "0." + "salir" + "\n" +
                
                "Digite la opción a elegir ";

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(Menu));
            switch (opcion) {
                case 1:
                    ls.show();
                    break;
                case 2:
                    ls.pregunta1();
                    break;
                case 3:
                    ls.pregunta2();
                    break;
                case 4:
                    ls.pregunta3();
                    break;
                case 5:
                    ls.pregunta4();
                    break;
                case 6:  
                    int dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dato"));                   
                    ls.insertar(dato);
                    
                    break;
                case 7:
                    int Ndato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dato"));  
                    ls.InsertarPrincipio(Ndato);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (opcion != 0);
    }
}
//METODO PARA ELIMINAR EL ULTIMO NODO DE LA LISTA SOLO SI ESTE ES PAR CASO CONTRARIO INSERTAR UN DATO ANTES DEL ULTIMO NODO 
