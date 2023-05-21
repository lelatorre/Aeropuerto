
package aeropuerto;

/**
 *
 * @author osfel
 */
public class NodoLlegada {
    NodoLlegada ant;
    NodoLlegada sig;
    AvionLlegada avionLlegada;
    public NodoLlegada(AvionLlegada avionLlegada) {
        this.ant = null;
        this.sig = null;
        this.avionLlegada = avionLlegada;
    }
    
}
