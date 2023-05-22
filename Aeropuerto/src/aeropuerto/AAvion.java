package aeropuerto;


public class AAvion {
    int id, numeroVuelo, numeroPuestos;
    String nomJefe, aerolinea, origen, destino, horaSalida, horaLlegada;
    
 public AAvion(int id, int numeroVuelo, String nomJefe, String aerolinea, String origen, String destino, String horaSalida, String horaLlegada) {
        this.id = id;
        this.numeroVuelo = numeroVuelo;
        this.nomJefe = nomJefe;
        this.aerolinea = aerolinea;
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
    }   
    

    public int getId() {
        return id;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public int getNumeroPuestos() {
        return numeroPuestos;
    }

    public String getNomJefe() {
        return nomJefe;
    }

    public String getAerolinea() {
        return aerolinea;
    }
    
      public String getOrigen() {
        return origen;
    }
    
    public String getDestino() {
        return destino;
    }
    
     public String getHoraSalida() {
        return horaSalida;
     }
    
    public String getHoraLlegada() {
        return horaLlegada;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public void setNumeroPuestos() {
        int numeroPuestos = (int)(Math.random()*3);
        switch(numeroPuestos){
            case 0:
                numeroPuestos = 100;
                break;
            case 1: 
                numeroPuestos = 150;
                break;
            case 2: 
                numeroPuestos = 200;
                break;
            case 3:
                numeroPuestos = 250;
                break;
        }
        this.numeroPuestos = numeroPuestos;
    }

    public void setNomJefe(String nomJefe) {
        this.nomJefe = nomJefe;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }
    
      public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
   
    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }
    
}
