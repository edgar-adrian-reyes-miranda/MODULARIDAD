package AUTOMOVIL;
import java.util.Scanner;

public class TRANSPOR {
    int llantas;
    int puertas, personas;
    public TRANSPOR(int llantas, int puertas, int personas){ //sobrecarga de constructor
        this.llantas= llantas;
        this.personas=personas;
        this.puertas=puertas;
    }
//nuestros getters y setters se ponen aqui
    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }
      
    
    //inicio de nuestro main 
    //nuestro main solo debe hacer una funcion de leer en este caso
    public static void main(String[] args) {
        
        TRANSPOR t[]= new TRANSPOR[1];
        for(int i=0; i<t.length;i++){
            //inicio de nuestro for
           var ingrese = new Scanner(System.in); ///ingresamos nuestros datos
         System.out.println("Ingrese un numero de ruedad que tiene su medio de transporte:");
        var llantas=ingrese.nextInt();
        System.out.println("Ingrese el numero de puertas del vehiculo: ");
        var puertas = ingrese.nextInt();
        System.out.println("Cuantos pasajeros cabe en su vehiculo:");
        var personas = ingrese.nextInt();
    // comparaciones de las llantas
    t[i]= new TRANSPOR(llantas, puertas, personas);
    if(t[i].getLlantas()==2 && (t[i].getPuertas()==0|| t[i].getPuertas()==4)&& t[i].getPersonas()<=2){
        System.out.println("El medio de transporte" +i+"es una bicicleta");}
    else if(t[i].getLlantas()==4 && t[i].getPuertas()==4 && t[i].getPersonas()<=5){
        System.out.println("El medio de transporte" +i+ "es un carro");
    } else if(t[i].getLlantas()==6 && t[i].getPuertas()==2 && t[i].getPersonas()>=5){
        System.out.println("El medio de transporte" +i+ "es un avion");
    }else{
        System.out.println("Puede que el dato que hallas ingresado no este en la lista");
    }
        }
    }
    }