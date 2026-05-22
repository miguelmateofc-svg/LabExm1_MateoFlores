/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exm1_mateoflores;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Exm1_MateoFlores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 4) {
            System.out.println("-------MENU-------");
            System.out.println("1. Binario a decimal");
            System.out.println("2. Contains Manual");
            System.out.println("3. Remplazo de palabras");
            System.out.println("4. Salir");
            System.out.println("Elegi una opcion");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    System.out.print("Ingrese la cadena principal");
                    String cadenaPrincipal = entrada.nextLine();
                    System.out.println("Ingrese la cadena a buscar");
                    String cadenaBuscar = entrada.nextLine();
                    containsManolo(cadenaPrincipal, cadenaBuscar);
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    System.out.println("Cheque bro");
                    break;
                default:
                    System.out.println("Opcion invalida bro");

            }
        }
    }

    public static void ejercicio1() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una cadena binaria de 8 caracteres");
        String cdbinaria = entrada.nextLine();
        if (cdbinaria.length() != 8) {
            System.out.println("Error la cadena debe de tener 8 caracteres");
            return;

        }
        int decimal = 0;
        int valorposicion = 1;
        for (int i = 7; i >= 0; i--) {
            char caracterActual = cdbinaria.charAt(i);
            if (caracterActual == '1') {
                decimal = decimal + valorposicion;
            }
            if (caracterActual != '0' && caracterActual != '1') {
                System.out.println("Error la cadena debe de contener solo 0s y 1s");
                return;
            }
                valorposicion = valorposicion * 2;
            }
            System.out.println("Binario:" + cdbinaria + "El decimal es :" + decimal);
        }

    }


