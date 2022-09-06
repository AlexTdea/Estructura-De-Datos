
package proyectolistas;

import javax.swing.JOptionPane;


public class ListaSimple {
    private Nodo Cab;
    //metodo constructor
    public ListaSimple(){
        Cab=null;
        
        
    }
    //Metodo para mostrar
    public void mostrar(){
        Nodo P=Cab;
        String Salida=" ";
        if(Cab==null){
           JOptionPane.showMessageDialog(null,"Lista vacia");
             
        }else {
            while (P!=null){
               Salida=Salida+P.getDato()+"  ";
                P=P.getLiga();
            }
        JOptionPane.showMessageDialog(null,"Los datos de la lista son\n"+Salida);
    }
}
    //Metodo para insertar al inicio
    public void insertarInicio(int dato){
        Nodo x= new Nodo(dato);
        dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato"));
     x.setLiga(Cab);
        Cab=x;
    }

   public void insertarFinal(int dato){
        Nodo P=Cab,x= new Nodo(dato);
        if(Cab==null){
            Cab=x;
        }else {
            while(P.getLiga()!=null){
                P=P.getLiga();
                
            }
            P.setLiga(x);
        }
    }
   //Metodo para eliminar el primer dato
   public void EliminarPrimerDato(){
       Nodo P=Cab;
       if(Cab==null){
            JOptionPane.showMessageDialog(null,"Lista vacia" );
             
        }else {
          Cab=Cab.getLiga();
          //delete(p); Aqui se libera el nodo 
          
          
       }
   }
   public void EliminarUltimo(){
       Nodo P=Cab,ant=null;
       if(Cab==null){
            JOptionPane.showMessageDialog(null,"Lista vacia" );
             
        }else {
           while(P.getLiga()!=null) {
               ant=P;
               P=P.getLiga();
               
           }
           if (P==Cab){
               Cab=null;
           }else {
               ant.setLiga(null);
           }
           //delete(P) qui se libera el Nodo
       }
   } 
   
   //
    }
