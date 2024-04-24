package org.nnttdata;

public class Empleado extends Persona {
    private int sueldoBase;
    private int pagoHoraExtra;
    private int estadoCivil;
    private int numHijos;
    private int horaExtra;
    int valor;

    public Empleado(String nombre, String apellido, String dni, int edad,
                    String sexo, int sueldoBase, int pagoHoraExtra, int estadoCivil,
                    int numHijos, int horaExtra) {
        super(nombre, apellido, dni, edad, sexo);
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
        this.estadoCivil = estadoCivil;
        this.numHijos = numHijos;
        this.horaExtra = horaExtra;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    // pagoHoraExtra
    public int getPagoHoraExtra() {
        return pagoHoraExtra;
    }

    public void setPagoHoraExtra(int pagoHoraExtra) {
        this.pagoHoraExtra = pagoHoraExtra;
    }

    // estadoCivil
    public String getEstadoCivil(int a) {
        if(a==1){
            return "Casado";
        }else{
            return "Soltero";
        }
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    // numHijos
    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    // horaExtra
    public int getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(int horaExtra) {
        this.horaExtra = horaExtra;
    }

    public int sueldoBruto(){
        return sueldoBase + pagoHoraExtra*horaExtra;
    }

    @Override
    public String toString() {
        return  super.toString() +
                " \nsueldoBase: " + getSueldoBase() +
                " \nIngreso total: " + sueldoBruto() +
                " \nEstado civil: " + getEstadoCivil(valor) +
                " \nnumHijos: " + getNumHijos()
                ;
    }
}
