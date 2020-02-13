package edu.elsmancs.cotxox;

public class Tarifa{

    private final double costeMilla = 1.35;
    private final double costeMinuto = 0.35;
    private final double costeMinimo = 5.00;
    private double porcentajeComision = 0.2;

    /**
     * @return the costeMilla
     */
    public double getCosteMilla() {
        return costeMilla;
    }

    /**
     * @return the costeMinuto
     */
    public double getCosteMinuto() {
        return costeMinuto;
    }

    /**
     * @return the costeMinimo
     */
    public double getCosteMinimo() {
        return costeMinimo;
    }

    public double getCosteDistancia(double distancia) {
        double costeDistancia = getCosteMilla() * distancia;
        return costeDistancia;
    }

    public double getCosteTiempo(double minutos) {
        double costeTiempo = getCosteMinuto() * minutos;
        return costeTiempo;
    }

    /**
     * @return the porcentajeComision
     */
    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public double getCosteTotalEsperado(Carrera carrera){
        double tiempoEsperadoDouble = getCosteTiempo(carrera.getTiempoEsperado());
        double costeTotal = getCosteDistancia(carrera.getDistancia()) + tiempoEsperadoDouble;
        if (costeTotal <= getCosteMinimo()) costeTotal = getCosteMinimo();
        return costeTotal;
    }
}