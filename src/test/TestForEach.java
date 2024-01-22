package test;
//basicamete el tema de ForEach es un for mejorado, por lo tanto foreach nos va a simplificar la forma
//en que recorremos los arreglos o colecciones.

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5 , 6 , 8, 9};
        for(int edad: edades){
            System.out.println("edad = " + edad);
        }
        
        Persona personas[] = {new Persona("Juan"), new Persona("Karla"), new Persona("Agustin")};
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
}
