import java.util.Scanner;

public class program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");

        int num = sc.nextInt();
        Integer numeroConvertido = num;

        System.out.println(num);

        sc.close();
    }
}

