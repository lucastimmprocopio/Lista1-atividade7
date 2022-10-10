import java.util.Scanner;

public class lt1_at7 {
    public static void main(String[] args) throws Exception {
        //Req_1: solicitar valor do lado do quadrado.
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a medida do lado do quadrado: ");
        int lado = sc.nextInt();
        sc.close();

        //Req_2: Calcular área do quadrado.
        int area = lado * lado;

        //Req_3: Calcular e mostrar o dobro da área do quadrado.

        int dobro = area * 2;

        System.out.println("O dobro da área do quadrado de lado " + lado + " é igual a " + dobro);


    }
}
