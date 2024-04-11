/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursivo;

/**
 *
 * @author solo1
 */

import java.util.Scanner;
import static recursivo.FuncionR.invertir;

/**
 *
 * @author solo1
 */
public class Recursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int numero=0;
        try (Scanner leer = new Scanner(System.in)) {
            boolean Llave = false;
            while (Llave==false) {
                try {
                    System.out.print("Ingrese un numero: ");
                    numero = leer.nextInt();
                    Llave = true;
                } catch (Exception NoEsEntero) {
                    System.out.println("Se esperaba un numero entero intente denuevo");
                    leer.nextLine();
                }
            }
            
            int numeroInvertido = invertir(numero, 0);
            System.out.println("Numero invertido es: " + numeroInvertido);
        }
    }
}


