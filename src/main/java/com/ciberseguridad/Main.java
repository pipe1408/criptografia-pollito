package com.ciberseguridad;

import java.util.ArrayList;
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

                    System.out.println("tiene la clave para descifrar");
                    System.out.println("1. Si");
                    System.out.println("2. No");

                    int option = sc.nextInt();
                    sc.nextLine();



                    if (option == 1){
                        System.out.println("Ingrese la palabra: ");
                        String palabras = sc.nextLine();

                        System.out.println("Ingrese la clave: ");
                        int claves= sc.nextInt();
                        sc.nextLine();

                        String result = descifradoCesar(palabras,claves);
                        System.out.println("palabra decifrada: " + result);
                        break;

                    } else {
                        System.out.println("Ingrese la palabra: ");
                        String palabras = sc.nextLine();

                        descifradoCesarSinClave(palabras);
                        break;

                    }


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

    public static void descifradoCesarSinClave(String palabra){
        palabra = palabra.toLowerCase();

        System.out.println("Probando todas las claves posibles para el descifrado:");

        for (int clave = 1; clave <= 26; clave++) {
            String resultado = descifradoCesar(palabra, clave);
            System.out.println("Clave " + clave + ": " + resultado);
        }
    }

    private static void cifradoVigenere() {
        char[] alfabeto = DatosPollito.ALFABETO;
        int alfabetoLength = alfabeto.length;

        System.out.println("Ingrese el mensaje que desea cifrar:");
        char[] mensaje = sc.nextLine().toUpperCase().toCharArray();
        System.out.println("Ingrese la clave para cifrar: ");
        char[] claveTexto = sc.nextLine().toUpperCase().toCharArray();

        int[] claveArray = new int[claveTexto.length];
        for (int i = 0; i < claveTexto.length; i++) {
            for (int j = 0; j < alfabetoLength; j++) {
                if (claveTexto[i] == alfabeto[j]) {
                    claveArray[i] = j;
                    break;
                }
            }
        }

        char[] mensajeCifrado = new char[mensaje.length];
        int posicionClave = 0;
        for (int i = 0; i < mensaje.length; i++) {
            char letra = mensaje[i];

            int posicionMensaje = -1;
            for (int j = 0; j < alfabetoLength; j++) {
                if (letra == alfabeto[j]) {
                    posicionMensaje = j;
                    break;
                }
            }

            if (posicionMensaje != -1) {
                int nuevaPosicion = (posicionMensaje + claveArray[posicionClave]) % alfabetoLength;
                mensajeCifrado[i] = alfabeto[nuevaPosicion];
                posicionClave = (posicionClave + 1) % claveArray.length;
            } else {
                mensajeCifrado[i] = letra;
            }
        }
        System.out.println("Mensaje cifrado: " + new String(mensajeCifrado));
    }


    private static void descifradoVigenere() {
        char[] alfabeto = DatosPollito.ALFABETO;

        System.out.println("Ingrese el mensaje cifrado:");
        char[] mensajeCifrado = sc.nextLine().toUpperCase().toCharArray();

        System.out.println("""
                
                ¿Tiene la clave para descifrar?
                1. Si
                2. No
                
                """);
        int opc = sc.nextInt();
        sc.nextLine();

        if (opc == 1) {
            System.out.println("Ingrese la clave:");
            char[] claveTexto = sc.nextLine().toUpperCase().toCharArray();
            descifrarConClave(mensajeCifrado, claveTexto, alfabeto);
        } else if (opc == 2) {
            System.out.println("Intentando descifrar con las primeras 100 claves de ROCKYOU_3000...");
            for (int i = 0; i < 100; i++) {
                char[] claveTexto = DatosPollito.ROCKYOU_3000[i].toUpperCase().toCharArray();
                System.out.println("\nIntentando clave: " + DatosPollito.ROCKYOU_3000[i]);
                descifrarConClave(mensajeCifrado, claveTexto, alfabeto);
            }
        } else {
            System.out.println("Opcion invalida");
        }
    }

    private static void descifrarConClave(char[] mensajeCifrado, char[] claveTexto, char[] alfabeto) {
        int alfabetoLength = alfabeto.length;
        int claveLength = claveTexto.length;

        int[] claveArray = new int[claveLength];
        for (int i = 0; i < claveLength; i++) {
            for (int j = 0; j < alfabetoLength; j++) {
                if (claveTexto[i] == alfabeto[j]) {
                    claveArray[i] = j;
                    break;
                }
            }
        }

        char[] mensajeDescifrado = new char[mensajeCifrado.length];
        int posicionClave = 0;

        for (int i = 0; i < mensajeCifrado.length; i++) {
            char letra = mensajeCifrado[i];

            int posicionMensaje = -1;
            for (int j = 0; j < alfabetoLength; j++) {
                if (letra == alfabeto[j]) {
                    posicionMensaje = j;
                    break;
                }
            }

            if (posicionMensaje != -1) {
                int nuevaPosicion = (posicionMensaje - claveArray[posicionClave] + alfabetoLength) % alfabetoLength;
                mensajeDescifrado[i] = alfabeto[nuevaPosicion];
                posicionClave = (posicionClave + 1) % claveArray.length;
            } else {
                mensajeDescifrado[i] = letra;
            }
        }

        System.out.println("Resultado: " + new String(mensajeDescifrado));
    }
}