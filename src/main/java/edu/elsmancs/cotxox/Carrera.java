package edu.elsmancs.cotxox;

public class Carrera {
    private int tiempoEsperado = 0;
    private double tiempoCarrera = 0;
    private double costeTotal = 0;
    private String conductor = null;
    private final String tarjetaCredito;
    private String destino = null;
    private String origen = null;
    private double distancia = 0;
    private int costeEsperado = 0;
    private Tarifa tarifa = new Tarifa();

    Carrera(String tarjetaCredito){
        this.tarjetaCredito = tarjetaCredito;
    }

    /**
     * @return the tarjetaCredito
     */
    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }
    
    /**
     * @return the distancia
     */
    public double getDistancia() {
        return distancia;
    }
    /**
     * @return the tiempoEsperado
     */
    public double getTiempoCarrera() {
        return tiempoCarrera;
    }

    /**
     * @return the costeEsperado
     */
    public double getCosteEsperado() {
        return tarifa.getCosteTotalEsperado(this);
    }

    /**
     * @return the tiempoEsperado
     */
    public int getTiempoEsperado() {
        return tiempoEsperado;
    }

    public void setOrigen(String origen){
        this.origen = origen;
    }
	public void setDestino(String destino){
        this.destino = destino;
    }
	public void setDistancia(double distancia){
        this.distancia = distancia;
    }
	public void setTiempoEsperado(int tiempoEsperadoMinutos){
        this.tiempoEsperado = tiempoEsperadoMinutos;
    }
}