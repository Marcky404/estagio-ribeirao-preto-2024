package questao5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra ou uma frase:");
        String frase = sc.nextLine();

        String[] split = frase.split("");

        for (int s = split.length - 1; s >= 0; s--) {
            System.out.print(split[s]);
        }

    }
}


