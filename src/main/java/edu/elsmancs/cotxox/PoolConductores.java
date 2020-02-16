package edu.elsmancs.cotxox;

import java.util.ArrayList;

public class PoolConductores {

    private ArrayList<Conductor> poolConductores;

	public PoolConductores(ArrayList<Conductor> poolConductores) {
        this.poolConductores = poolConductores;
	}

    public Conductor asignarConductor(){
        Conductor conductorLibre = null;
        for (Conductor conductor: poolConductores){
            boolean ocupacion = conductor.isOcupado();
            if (ocupacion == false){
                conductor.setOcupado(true);
                conductorLibre = conductor;
                break;
            }
        }
        return conductorLibre;
        /*hay alguna manera de devolver dos tipos de datos? Para devolver un mensaje cuando no hay conductores libres*/
    }
}
