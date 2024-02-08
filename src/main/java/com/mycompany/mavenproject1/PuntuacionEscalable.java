
package com.mycompany.mavenproject1;

/**
 *
 * @author Quiej
 */
 
public class PuntuacionEscalable {
    
    public static int calcularPuntuacion(String palabra) {
        int[] valores = new int[128]; 

        asignarValores(valores, "AEIOULNRST", 1);
        asignarValores(valores, "DG", 2);
        asignarValores(valores, "BCMP", 3);
        asignarValores(valores, "FHVWY", 4);
        asignarValores(valores, "K", 5);
        asignarValores(valores, "JX", 8);
        asignarValores(valores, "QZ", 10);
        
        int puntuacion = 0;
        for (char letra : palabra.toUpperCase().toCharArray()) {
            puntuacion += valores[letra]; 
        }
        return puntuacion;
    }
    
    private static void asignarValores(int[] valores, String letras, int valor) {
        for (char letra : letras.toCharArray()) {
            valores[letra] = valor;
        }
    }

    public static void main(String[] args) {
        String palabra = "repollo"; // Ingresar palabra que queremos calcular Puntos
        int puntuacion = calcularPuntuacion(palabra);
        System.out.println("La palabra '" + palabra + "' nos da " + puntuacion + " puntos.");
    }
}

