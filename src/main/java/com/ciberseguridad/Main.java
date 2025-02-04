package com.ciberseguridad;

import java.util.Scanner;

public class Main {

    static char[] alf = {'a','b','c','d','e','f','g','h','i','j','k','l'
            ,'m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menuText = """
                Bienvenido al programa de criptografía Pollitoconpapas
                
                ======================
                    Menú Principal
                ======================
                1. Cifrado Cesar
                2. Descifrado Cesar
                3. Cifrado Vigenere
                4. Descifrado Vigenere
                
                Escoja una opción:
                """;
        System.out.println(menuText);
        int opc = sc.nextInt();

        switch (opc) {
            case 1:
                String palabra = sc.nextLine();
                System.out.println("Ingrese la clave: ");
                int clave= sc.nextInt();
                cifradoCesar(palabra,clave);
                break;
            case 2:
                descifradoCesar();
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

    public static void cifradoCesar(String palabra, int clave){
        palabra = palabra.toLowerCase();
        char[] arrPalabra = palabra.toCharArray();
        char[] descifrada = new char[0];
        for(int i = 0; i < palabra.length(); i++){
            for(int j = i + 1; j <= i; j++) {
                if (arrPalabra[i] == alf[j]){
                    descifrada[i] = alf[j + clave];
                }
            }
        }
        System.out.println(descifrada);
    }

    private static void descifradoCesar() {
    }

    public static void cifradoVigenere(){
    }

    private static void descifradoVigenere() {
    }
}