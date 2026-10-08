package org.example;

import java.util.Observable;
import java.util.Observer;

public class Secretario implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Secretario(String nome){
        this.nome = nome;
    }
    public void observarLeito(Leito leito) {
        leito.addObserver(this);
    }
    @Override
    public void update(Observable leito, Object arg) {
        this.ultimaNotificacao = this.nome + ", o leito " + leito.toString();
    }

    public String getUltimaNotificacao(){
        return this.ultimaNotificacao;
    }
}
