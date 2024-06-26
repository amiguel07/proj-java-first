package org.entity;

public class Serie {
    private String titulo;
    private int numTemporadas;
    boolean entregado;
    private String genero;
    private String creador;

    public Serie() {
        this.titulo = "";
        this.numTemporadas = 3;
        this.entregado = false;
        this.genero = "";
        this.creador = "";
    }

    public Serie(String titulo,String creador) {
        this();
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numTemporadas, String genero, String creador) {
        this(titulo,creador);
        this.numTemporadas = numTemporadas;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numTemporadas=" + numTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }
}
