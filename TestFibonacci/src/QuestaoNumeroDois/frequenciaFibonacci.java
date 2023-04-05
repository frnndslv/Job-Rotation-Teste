package QuestaoNumeroDois;

import java.util.Scanner;
public class frequenciaFibonacci {
    public static void fibonacciMetodo(){
        Scanner scan = new Scanner(System.in);
        int i= scan.nextInt();
        int n1 = 0; int n2 = 1; int Rn = 0 ;

        while (i > Rn){
            Rn=n1+n2;
            n1=n2;
            n2=Rn;

        } if (i==Rn){
            System.out.println("Pertence a sequencia de Fibonacci.");
        } else {
            System.out.println("Não pertence a sequencia. " );
        }
    }
}
