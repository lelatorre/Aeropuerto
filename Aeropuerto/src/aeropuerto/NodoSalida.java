
package aeropuerto;


public class NodoSalida {
    NodoSalida ant;
    NodoSalida sig;
    AvionSalida avionSalida;
    public NodoSalida(AvionSalida avionSalida) {
        this.ant = null;
        this.sig = null;
        this.avionSalida = avionSalida;
    }
}
