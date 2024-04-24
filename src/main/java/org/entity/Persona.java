package org.entity;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private char sexo;
    private static final char SEXO_DEFAULT = 'H'; //SEXO_DEFAULT
    private double peso;
    private double altura;

    public Persona (){
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this. sexo = SEXO_DEFAULT;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, char sexo, int edad) {
        this();
        this.nombre = nombre;
        if (sexo == 'M' ){
            this.sexo = sexo;
        }else{
            this.sexo = 'H';
        }
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, String dni, int edad, char sexo, double peso, double altura) {
        this(nombre,sexo,edad);
        this.apellido = apellido;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
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

    public char getSexo(){
        return sexo;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public char comprobarSexo(char sexo){
        if( sexo == 'M'){
            return 'M';
        }else{
            return 'H';
        }
    }

    public boolean esMayorEdad (int edad){
        if (getEdad() >= 18) {
            return true;
        }else{
            return false;
        }
    }

    public int calcularIMC(double altura,double peso){
        double resultado = (peso)/(Math.pow(altura,2));
        System.out.println("El resultado IMC es: " + resultado);
        if (resultado < 20 ) {
            return -1;
        }else if (resultado >=20 && resultado <= 25){
            return 0;
        } else{
            return 1;
        }
    }

    public String verificarEdad(int edad){
        if(esMayorEdad(edad)){
            return "Es mayor de edad";
        }else{
            return "Es menor de edad";
        }
    }

    public String mostrarIMC(){
        if(calcularIMC(altura,peso)==-1){
            return "La persona está en su peso ideal";
        }else if(calcularIMC(altura,peso)==0){
            return "La persona está por debajo de su peso ideal";
        }else{
            return "La persona tiene sobrepeso";
        }
    }

    public String mostrarSexo() {
        if (comprobarSexo(sexo) == 'M') {
            return "Mujer";
        } else {
            return "Hombre";
        }
    }

    @Override
    public String toString(){
        return  "Nombres: " + getNombre() + " " + getApellido() +
                " \nDNI: " + getDni() +
                " \nEdad: " + getEdad() +
                " \nSexo: " + mostrarSexo() +
                " \n" + mostrarIMC();
    }
}
