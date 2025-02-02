package com.ciberseguridad;

import javax.swing.event.InternalFrameAdapter;
import java.util.Scanner;

public class Main {



    static char[] alf = {'a','b','c','d','e','f','g','h','i','j','k','l'
            ,'m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al programa de cifrado");
        System.out.println("Ingrese la palabra: ");
        String palabra = sc.nextLine();
        System.out.println("Ingrese la clave: ");
        int clave= sc.nextInt();

        CifradoCesar(palabra,clave);
    }


    public static void CifradoCesar(String palabra, int clave){
        palabra = palabra.toLowerCase();
        char[] arrPalabra = palabra.toCharArray();
        char[] decifrada = new char[0];
        for(int i = 0; i < palabra.length(); i++){
            for(int j = i + 1; j <= i; j++) {
                if (arrPalabra[i] == alf[j]){
                    decifrada[i] = alf[j + clave];
                }
            }


        }
        System.out.println( decifrada);

    }

    public static void CifradoVigenere(String palabra, String clave ){
        palabra = palabra.toLowerCase();


    }
}