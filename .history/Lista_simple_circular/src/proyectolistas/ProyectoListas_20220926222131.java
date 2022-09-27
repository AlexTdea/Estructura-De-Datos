package proyectolistas;

import javax.swing.JOptionPane;

public class ProyectoListas {

    public static void main(String[] args) {
        int dato, opcion;
        ListaSimpleCircular ls = new ListaSimpleCircular();
        String Menu = """
            ************************





            
                1. Mostrar lista
                2. pregunta 1
                3. pregunta 2
                4. pregunta 3
                5. pregunta 4







            ************************    
                """;;
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
