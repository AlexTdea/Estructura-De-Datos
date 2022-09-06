
package proyectolistas;


public class Nodo {
 private int dato;
 private Nodo liga;

    public Nodo(int dato) {
        this.dato = dato;
        liga=null;
    }
 //metodo para obtener un dato

    public int getDato() {
        return dato;
    }
//metodo para asignar un dato
    public void setDato(int dato) {
        this.dato = dato;
    }
//metodo para obenter la liga
    public Nodo getLiga() {
        return liga;
    }
//metodo para asignar la liga
    public void setLiga(Nodo liga) {
        this.liga = liga;
    }
    
    
    
 } 
 


