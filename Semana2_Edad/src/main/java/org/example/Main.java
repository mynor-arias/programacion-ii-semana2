package org.example;

import java.util.Scanner; //Exportamos la libreria para solicitar datos al usuario
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: "); // Pedimos el nombre al usuario y lo guardamos en la variable nombre
        String nombre = scanner.nextLine();


        System.out.println("Ingrese su año de nacimiento: "); // Pedimos al usuario escribir su fecha de nacimiento
        int nacimiento = scanner.nextInt();                   // Guardamos el dato en la varible nacimiento

        int edad = 2025 - nacimiento; // restamos 2025 al año de nacimiento para calcular la edad

        System.out.println("Hola " + nombre + ", tu edad aproximida es: " + edad + " años.");
    }
}