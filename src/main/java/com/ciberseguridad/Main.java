package com.ciberseguridad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static char[] alf = {'a','b','c','d','e','f','g','h','i','j','k','l'
            ,'m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String menuText = """
                Bienvenido al programa de criptografía Pollitoconpapas
                
                ======================
                    Menú Principal
                ======================
                1. Cifrado Cesar
                2. Descifrado Cesar
                3. Cifrado Vigenere
                4. Descifrado Vigenere
                
                0. Salir
                
                Escoja una opción:
                """;

        int opc = -1;
        while (opc != 0) {
            System.out.println(menuText);
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese la palabra: ");
                    String palabra = sc.nextLine();

                    System.out.println("Ingrese la clave: ");
                    int clave= sc.nextInt();
                    sc.nextLine();

                    cifradoCesar(palabra,clave);

                    String resultado = cifradoCesar(palabra, clave);
                    System.out.println("Palabra cifrada: " + resultado);

                    break;
                case 2:
                    System.out.println("Ingrese la palabra: ");
                    String palabras = sc.nextLine();

                    System.out.println("Ingrese la clave: ");
                    int claves= sc.nextInt();
                    sc.nextLine();

                    String result = descifradoCesar(palabras,claves);
                    System.out.println("palabra decifrada: " + result);
                    break;
                case 3:
                    cifradoVigenere();
                    break;
                case 4:
                    descifradoVigenere();
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private static String cifradoCesar(String palabra, int clave) {
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

    public static String descifradoCesar(String palabra, int clave) {
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

    private static void cifradoVigenere() {
        char[] alfabeto = DatosPollito.ALFABETO;
        System.out.println("Ingrese el mensaje que desea cifrar:");
        char[] mensaje = sc.nextLine().toUpperCase().toCharArray();
        System.out.println("Ingrese la clave para cifrar: ");
        char[] claveTexto = sc.nextLine().toUpperCase().toCharArray();

        int[] claveArray = new int[claveTexto.length];
        for (int i = 0; i < claveTexto.length; i++) {
            for (int j = 0; j < alfabeto.length; j++) {
                if (claveTexto[i] == alfabeto[j]) {
                    claveArray[i] = j;
                }
            }
        }
        System.out.println(Arrays.toString(claveArray));
    }

    private static void descifradoVigenere () {
    }
}