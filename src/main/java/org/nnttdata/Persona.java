package org.nnttdata;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private int edad = 1;
    private String sexo;

    public Persona(String nombre, String apellido, String dni, int edad, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        if (getEdad() >= 18) {
            System.out.println("Mayor de edad");
        }else{
            System.out.println("Menor de edad");
        }
        this.sexo = sexo;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getDni(){
        return dni;
    }
    public void setDni(String dni){
        this.dni = dni;
    }

    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public String verificarEdad(int edad){
        if (getEdad() >= 18) {
            return "Mayor de edad";
        }else{
            return "Menor de edad";
        }
    }

    @Override
    public String toString(){
        return  "Nombres: " + getNombre() + " " + getApellido() +
                " \nDNI: " + getDni() +
                " \nEdad: " + getEdad();
    }
}
