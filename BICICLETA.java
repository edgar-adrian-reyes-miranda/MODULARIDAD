package AUTOMOVIL;


public class BICICLETA extends TRANSPOR {
    //sobre cargar
    public BICICLETA(int llantas, int puertas, int personas) {
        super(llantas, puertas, personas);
    }
    int masa;
    int moverse;
    int cambiardevelocidad;
//getters y setters
    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public int getMoverse() {
        return moverse;
    }

    public void setMoverse(int moverse) {
        this.moverse = moverse;
    }

    public int getCambiardevelocidad() {
        return cambiardevelocidad;
    }

    public void setCambiardevelocidad(int cambiardevelocidad) {
        this.cambiardevelocidad = cambiardevelocidad;
    }
}
