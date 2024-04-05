package Actividad_5_04;

import java.time.LocalDate;

/*
Persona: Metodo que permita conocer la cantidad de años, meses y dia de vida.
Cuadrado: Metodos que permitan conocer el Area y el Perimetro.
Circulo: Metodos que permitan conocer el Area y el Perimetro.
Triangulo: Metodos que permitan conocer el Area, el Perimetro e hipotenusa.
*/

public class Main {

    public static void main(String[] args) {
        
        System.out.println("--- Persona ---");
        
        LocalDate bornDate = LocalDate.of(2005, 10, 02);
        
        Persona pBonita = new Persona(bornDate);
        
        System.out.println(pBonita.toString());
        
        System.out.println("\n--- Cuadrado ---");
        
        Cuadrado cBonito = new Cuadrado(4);
        
        System.out.println(cBonito.toString());
        
        System.out.println("\n--- Circulo ---");
        
        Circulo cirBonito = new Circulo(1);
        
        System.out.println(cirBonito.toString());
        
        System.out.println("\n--- Triangulo ---");
        
        Triangulo tBonito = new Triangulo(5, 7);
        
        System.out.println(tBonito.toString());
        
    }
    
}
