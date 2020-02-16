package edu.elsmancs.cotxox;

import java.util.ArrayList;

public class Conductor {

	private final String nombre;
    private String matricula;
    private String modelo;
    private double valoracionMedia;
    private ArrayList<Byte> valoraciones = new ArrayList<>();
    private boolean ocupado = false;

    Conductor(String nombre) {
        this.nombre = nombre;
    }

	void setMatricula(String matricula) {
        this.matricula = matricula;
	}

	void setModelo(String modelo) {
        this.modelo = modelo;
	}

	void setValoracion(byte valoracion) {
        valoraciones.add(valoracion);
        double total = 0;
        for(byte valor : valoraciones){
            total += valor;
        }
        double media = total/valoraciones.size();
        this.valoracionMedia = media;
    }
    
    void setOcupado(boolean ocupacion){
        this.ocupado = ocupacion;
    }
    
    public boolean isOcupado(){
        return this.ocupado;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @return the valoracionMedia
     */
    public double getValoracion() {
        return valoracionMedia;
    }

}
