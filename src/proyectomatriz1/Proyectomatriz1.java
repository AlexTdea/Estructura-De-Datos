
package proyectomatriz1;

import javax.swing.JOptionPane;

public class Proyectomatriz1 {
    public static void main(String[] args) {
        int tamfila;
        int tamcolumna;
        int limite = 0;
        Matriz A, B;

        while (limite == 0) {
            limite = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el limite, para los valores de la matriz"));
        }

        JOptionPane.showMessageDialog(null, "El limite a cambiado a de 1 a " + limite, "OJO",
                JOptionPane.WARNING_MESSAGE);

        tamfila = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño de la fila de la primera matriz"));
        tamcolumna = Integer
                .parseInt(JOptionPane.showInputDialog("ingrese el tamaño de la columna de la primera matriz"));

        A = new Matriz(tamfila, tamcolumna);
        A.llenar(limite);

        tamfila = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño de la fila de la segunda matriz"));
        tamcolumna = Integer
                .parseInt(JOptionPane.showInputDialog("ingrese el tamaño de la columna de la segunda matriz"));

        B = new Matriz(tamfila, tamcolumna);
        B.llenar(limite);

        int x = -1;
        int opcion;

        while (x != 0) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menú\n" +
                    "1.	Mostrar matrices \n" +
                    "2.	Sumar matrices\n" +
                    "3.	Multiplicar matrices\n" +
                    "4.	Mostrar traspuesta\n" +
                    "5.	Multiplicar traspuesta\n" +
                    "6.	Comparar\n" +
                    "7.	Dividir\n" +
                    "0.	Salir\n" +
                    "	Escoge una opción "));

            if (opcion == 0) {
                x = 0;
            }

            try {
                switch (opcion) {
                    case 1:
                        mostrarAmbas(A.toString(), B.toString());
                        break;
                    case 2:
                        Matriz resultado = A.suma(B);
                        mostrarResultado(A.toString(), B.toString(), resultado.toString(),
                                "El resultado de la suma es:");
                        break;
                    case 3:
                        Matriz res = A.multiplicar(B);
                        mostrarResultado(A.toString(), B.toString(), res.toString(),
                                "La multiplicacion de las matrices es:");
                        break;
                    case 4:
                        String respuesta = "A: \n" +
                                A.traspuesta().toString() + "\n" +
                                "B: \n" +
                                B.traspuesta().toString();

                        mostrarResultado(A.toString(), B.toString(), respuesta, "Matrices Traspuestas");
                        break;
                    case 5:
                        Matriz trasA = A.traspuesta();
                        Matriz trasB = B.traspuesta();
                        Matriz response = trasA.multiplicar(trasB);

                        mostrarAmbas(A.toString(), B.toString());
                        mostrarResultado(trasA.toString(), trasB.toString(), response.toString(),
                                "La multiplicacion de las traspuestas es");
                        break;
                    case 6:
                        Boolean isEquals = A.comparar(B);

                        if (isEquals) {
                            mostrarAmbas(A.toString(), B.toString(), "Matrices Iguales");
                        } else {
                            mostrarAmbas(A.toString(), B.toString(), "Matrices Diferentes");
                        }
                        break;
                    case 7: 
                        JOptionPane.showMessageDialog(null, "Opcion no soportada todavia");
                    default:
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    public static void mostrarAmbas(String A, String B) {
        JOptionPane.showMessageDialog(null,
                "A: \n" + A + "\n" +
                        "B: \n" + B);
    }

    public static void mostrarAmbas(String A, String B, String msg) {
        JOptionPane.showMessageDialog(null,
                msg + "\n" +
                        A + "\n" +
                        B);
    }

    public static void mostrarResultado(String A, String B, String resultado, String msg) {
        JOptionPane.showMessageDialog(
                null,
                "matriz A: \n" + A + "\n" +
                        "matriz B: \n" + B + "\n" +
                        msg + ": \n" + resultado);
    }
}
