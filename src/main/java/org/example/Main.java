package org.example;
import org.entity.Persona;
import org.entity.Serie;
import org.entity.Videojuego;


public class Main {
    public static void main(String[] args) {

//            Persona persona = new Persona("Anderson","Miguel", "74756987", 24, 'H',60,1.74);
//            System.out.println(persona);
//            System.out.println(persona.getSexo());

        Serie serie = new Serie("Dark",4,"Drama","Pool Phoenix");
        System.out.println(serie);

        Videojuego videojuego = new Videojuego("God Of War",80,"Ficcion", "Sony");
        System.out.println(videojuego);
        }
    }
