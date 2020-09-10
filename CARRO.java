package AUTOMOVIL;

public class CARRO extends TRANSPOR {

    
    //damos commo atributos
    
    int velocidad;
int detenerse;
int grados;
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getDetenerse() {
        return detenerse;
    }

    public void setDetenerse(int detenerse) {
        this.detenerse = detenerse;
    }

       ///sobre carga del metodo
    public CARRO(int llantas, int puertas, int personas) {
        super(llantas, puertas, personas);
    }
   // nada que ingresar porque hereda los de TRANSPOR
}
