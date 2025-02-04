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

                Scanner scr = new Scanner(System.in);
                System.out.println("Ingrese la palabra: ");
                String palabra = scr.nextLine();

                System.out.println("Ingrese la clave: ");
                int clave= scr.nextInt();

                CifradoCesar(palabra,clave);

                String resultado = CifradoCesar(palabra, clave);
                System.out.println("Palabra cifrada: " + resultado);

                break;
            case 2:

                Scanner scra = new Scanner(System.in);
                System.out.println("Ingrese la palabra: ");
                String palabras = scra.nextLine();

                System.out.println("Ingrese la clave: ");
                int claves= scra.nextInt();

                String result = DescifrarCesar(palabras,claves);
                System.out.println("palabra decifrada: " + result);
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

    public static String DescifrarCesar(String palabra, int clave) {
        palabra = palabra.toLowerCase();
        char[] arrPalabra = palabra.toCharArray();
        ArrayList<Character> descifrada = new ArrayList<>();
        for (char letra : arrPalabra) {

            if (letra >= 'a' && letra <= 'z') {
                int posicionActual = letra - 'a';
                int nuevaPosicion = (posicionActual - clave) % 26;
                if (nuevaPosicion < 0) {
                    nuevaPosicion += 26;
                }
                descifrada.add(alf[nuevaPosicion]);
            } else {
                descifrada.add(letra);
            }
        }


        StringBuilder resultado = new StringBuilder(descifrada.size());
        for (Character ch : descifrada) {
            resultado.append(ch);
        }

        return resultado.toString();
    }

    public static void CifradoVigenere(String palabra, String clave ){
        palabra = palabra.toLowerCase();

    }

}