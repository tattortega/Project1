package com.sofka.project;

import java.util.Scanner;

/**
 * Clase principal para capturar datos
 *
 * @version 1.0.0 2022-05-21
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @since 1.0.0
 */
public class Project1 {
    public static void main(String[] args) {
        Scanner capture = new Scanner(System.in);
        System.out.println("Digite su nombre de usuario: ");
        String username = capture.nextLine();
        System.out.println("Digite su número de celular: ");
        String phone = capture.nextLine();
        System.out.println("Digite su edad: ");
        int age = capture.nextInt();
        System.out.println("Bienvenido señor " + username + ", es un placer para nosotros contar con una persona de "
                + age + " años.\n" +
                "Próximamente nos comunicaremos con usted al numero " + phone + ".\n" +
                "Feliz día.");
    }
}
