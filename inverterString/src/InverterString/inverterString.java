package InverterString;

import java.util.Scanner;

public class inverterString {
    public static void inverterStringmetodo() {
        Scanner scan = new Scanner(System.in);
        String texto = scan.next();
        String novotexto = "";
        for(int i = texto.length()-1; i>=0; i--){
            novotexto= novotexto+texto.charAt(i);

        }
        System.out.print(novotexto);

    }
}
