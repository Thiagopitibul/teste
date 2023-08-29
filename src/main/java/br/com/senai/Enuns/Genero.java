package br.com.senai.Enuns;

public enum Genero {

    M("Masculino"), F("Feminino"), O("Outros");

    private String tipo;

    Genero(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}