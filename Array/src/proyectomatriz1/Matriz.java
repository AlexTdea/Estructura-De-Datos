
package proyectomatriz1;

public class Matriz {
    private int tamfila;
    private int tamcolumna;
    private int mat[][];

    // metodo constructor
    public Matriz(int tamfila, int tamcolumna) {
        this.tamfila = tamfila;
        this.tamcolumna = tamcolumna;
        mat = new int[this.tamfila][this.tamcolumna];
    }

    public void llenar(int limite) {
        for (int i = 0; i < tamfila; i++) {
            for (int j = 0; j < tamcolumna; j++) {
                mat[i][j] = (int) (Math.random() * limite) + 1;
            }
        }
    }

    public int getTamFila() {
        return tamfila;
    }

    public int getTamColumna() {
        return tamcolumna;
    }

    public int getDato(int pos1, int pos2) {
        return (mat[pos1][pos2]);
    }

    public void setDato(int pos1, int pos2, int dat) {
        mat[pos1][pos2] = dat;
    }

    public Matriz suma(Matriz B) throws Exception {
        Matriz C = new Matriz(tamfila, tamcolumna);

        if (this.isSameSize(this, B)) {
            for (int i = 0; i < tamfila; i++) {
                for (int j = 0; j < tamcolumna; j++) {
                    C.setDato(i, j, mat[i][j] + B.getDato(i, j));
                }
            }
            return C;
        } else {
            throw new Exception("Las matrices no se pueden sumar porque cuentan con diferentes tamaños");
        }
    }

    public Matriz multiplicar(Matriz B) throws Exception {
        try {
            Matriz D = this.multiplicar(this, B);
    
            return D;
        } catch (Exception e) {
            throw e;
        }
    }

    public Matriz multiplicar(Matriz A, Matriz B) throws Exception {
        Matriz respuesta = new Matriz(A.tamfila, B.getTamColumna());
        
        if (A.getTamColumna() == B.getTamFila()) {
            for (int i = 0; i < tamfila; i++) {
                for (int j = 0; j < B.getTamColumna(); j++) {
                    int contador = 0;
                    for (int k = 0; k < tamcolumna; k++) {
                        contador += mat[i][k] * B.mat[k][j];

                        if (k == (tamcolumna - 1)) {
                            respuesta.setDato(i, j, contador);
                            contador = 0;
                        }
                    }
                }
            }
            
            return respuesta;
        } else {
            throw new Exception("El tamaño de las Columnas de la matriz A no corresponde con el Tamaño de columnas de la matriz B");
        }
    }

    public Matriz traspuesta() {
        Matriz E = new Matriz(this.tamcolumna, this.tamfila);

        for (int i = 0; i < tamfila; i++) {
            for (int j = 0; j < tamcolumna; j++) {
                E.mat[j][i] = this.mat[i][j];
            }
        }
        return E;
    }

    public boolean comparar(Matriz B) {
        boolean isEqual = false;

        if (B.getTamFila() == this.getTamFila() && B.getTamColumna() == this.getTamColumna()) {
            for (int i = 0; i < this.getTamFila(); i++) {
                for (int j = 0; j < this.getTamColumna(); j++) {
                    if (this.mat[i][j] == B.mat[i][j]) {
                        isEqual = true;
                    } else {
                        isEqual = false;
                    }
                }
            }
        }

        return isEqual;
    }

    private boolean isSameSize(Matriz A, Matriz B) {
        if (B.getTamFila() == this.getTamFila() && B.getTamColumna() == this.getTamColumna()) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        String salida = "";

        for (int i = 0; i < tamfila; i++) {
            if (i != 0) {
                salida = salida + "\n";
            }

            for (int j = 0; j < tamcolumna; j++) {
                salida = salida + mat[i][j] + " ";
            }
        }

        return salida;
    }
}
