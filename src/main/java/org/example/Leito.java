package org.example;

import java.util.Observable;

public class Leito extends Observable {

    private String identificador;
    private boolean emUso;
    private String ocupado;

    public Leito(String identificador, boolean emUso){
        this.identificador = identificador;
        this.emUso = emUso;

    }

    public String getIdentificador(){
        return this.identificador;
    }

    public void ocupar(){
        this.emUso = true;
        setChanged();
        notifyObservers();
    }

    public void desocupar(){
        this.emUso = false;
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString(){

        if (emUso) ocupado = "ocupado";
        else ocupado = "desocupado";

        return this.identificador + " agora esta " + ocupado;
    }

}
