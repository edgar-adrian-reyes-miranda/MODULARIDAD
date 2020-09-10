package AUTOMOVIL;

public class AVION  extends TRANSPOR{
    ///  nuestro contructor  y heredacion 
    public AVION(int llantas, int puertas, int personas) {
        super(llantas, puertas, personas);
    }
    int masa;

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public int getVelocidadmaxima() {
        return velocidadmaxima;
    }

    public void setVelocidadmaxima(int velocidadmaxima) {
        this.velocidadmaxima = velocidadmaxima;
    }
    int velocidadmaxima;
    
    
    
}
