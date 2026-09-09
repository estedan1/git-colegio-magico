package com.colegiomagico.reto4;

/**
 * Si el hechizo es 'Imperius' o 'Crucio', retorna 'Maldicion'. De lo contrario, 'Permitido'.
 */
public class DefensaCondicional {

    public static String evaluar(String hechizo) {
<<<<<<< HEAD
        return ""; 
        if(hechizo == "Imperius" || hechizo == "Crucio"){
             System.out.println("Maldicion")
        }
         else {
            System.out.println("Permitido")
         }
=======
         
        if (hechizo.equals("Imperius") || hechizo.equals("Crucio")) {
            return "Maldicion";
        } else {
            return "Permitido";
        }
>>>>>>> 269a96ad298fa85797fe5ed1aa1a7859978163ec
    }

    
    public static void main(String[] args) {
        System.out.println("Lumos: " + evaluar("Lumos"));
        System.out.println("Crucio: " + evaluar("Crucio"));
    }
}
