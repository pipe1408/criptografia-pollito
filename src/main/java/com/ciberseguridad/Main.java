package com.ciberseguridad;

import javax.swing.event.InternalFrameAdapter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    static char[] alf = {'a','b','c','d','e','f','g','h','i','j','k','l'
            ,'m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al programa de cifrado");
        System.out.println("Menu Elija que opcion desea" +
                "1. Cifrado Cesar" +
                "2. Descifrado Cesar" +
                "3. Cifrado Vigenere" +
                "4. Descrifrado Vigenere");

        int menu = sc.nextInt();
        switch (menu){
            case 1:

                System.out.println("Ingrese la palabra: ");
                String palabra = sc.nextLine();

                System.out.println("Ingrese la clave: ");
                int clave= sc.nextInt();

                CifradoCesar(palabra,clave);

                String resultado = CifradoCesar(palabra, clave);
                System.out.println("Palabra cifrada: " + resultado);

                break;
            case 2:

                break;
        }




    }


    public static String CifradoCesar(String palabra, int clave) {
        palabra = palabra.toLowerCase();
        char[] arrPalabra = palabra.toCharArray();
        ArrayList<Character> cifrada = new ArrayList<>();

        for (char letra : arrPalabra) {

            if (letra >= 'a' && letra <= 'z') {
                int posicionActual = letra - 'a';
                int nuevaPosicion = (posicionActual + clave) % 26;
                if (nuevaPosicion < 0) {
                    nuevaPosicion += 26;
                }
                cifrada.add(alf[nuevaPosicion]);
            } else {
                cifrada.add(letra);
            }
        }


        StringBuilder resultado = new StringBuilder(cifrada.size());
        for (Character ch : cifrada) {
            resultado.append(ch);
        }

        return resultado.toString();
    }

    public static void DescifradoCesar(String palabra, String clave){



    }

    public static void CifradoVigenere(String palabra, String clave ){
        palabra = palabra.toLowerCase();

    }

}