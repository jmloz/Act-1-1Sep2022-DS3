/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1java1sep;

/**
Escribe un método auxiliar de nombre “caracterEn” en Java que realice la siguiente acción:
Recibe como parámetros una cadena (String) y un entero (int);
Si el entero está entre 0 y la longitud de la cadena (puedes hacer uso
del método “length(): int” de la clase “String”) devuelve el carácter en 
la posición correspondiente (puedes hacer uso del método “charAt(int)” de la clase “String”).
En caso contrario, construye y lanza una excepción de tipo “Exception”.
 */
import java.sql.SQLOutput;
public class Main {


    public static void main(String[] args) {
    String s = "Hola mundo cruel";
        int n = 8;
        caracterEn(s, n);
    }
    public static void caracterEn(String s, int n) {
        try {
            if (n <= s.length() && n > 0) {
                System.out.println("La posicion del caracter en la cadena es: " + s.charAt(n));
            }
        } catch (Exception e) { }
    }
    
}
