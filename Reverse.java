import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un texto \n");
        String eltexto = scanner.nextLine();
        String eltextoreverse = reverse(eltexto);
        System.out.println(eltextoreverse);
    }

    public static String reverse(String texto) {
        String res1 = "";
        /************* Reverse Con StringBuilder  ***************/
        String reversedText = new StringBuilder(texto).reverse().toString();


        /************ Array Unidireccional **************/
        String textoArray[] = texto.split("");

        for (int i = textoArray.length -1; i >= 0 ; i--){
            res1 += textoArray[i];
        };

        return res1;
    }
}