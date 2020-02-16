package edu.elsmancs.cotxox;

import java.util.ArrayList;

public class Conductor {

	private final String nombre;
    private String matricula;
    private String modelo;
    private int valoracionMedia;
    private ArrayList<Integer> valoraciones = new ArrayList<>();

    Conductor(String nombre) {
        this.nombre = nombre;
    }

	public void setMatricula(String matricula) {
        this.matricula = matricula;
	}

	public void setModelo(String modelo) {
        this.modelo = modelo;
	}

	public void setValoracion(byte valoracion) {
        int valoracionInt = valoracion;
        valoraciones.add(valoracionInt);
        int total = 0;
        for(Integer valor : valoraciones){
            total += valor;
        }
        int media = total/valoraciones.size();
        this.valoracionMedia = media;
	}
    


}
