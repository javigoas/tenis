package com.tenis.pojos;

public class Partido {
    private Jugador local;
    private Jugador visitante;
    private Resultado resultado;

    public Jugador getLocal() {
        return local;
    }

    public void setLocal(Jugador local) {
        this.local = local;
    }

    public Jugador getVisitante() {
        return visitante;
    }

    public void setVisitante(Jugador visitante) {
        this.visitante = visitante;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }




}
