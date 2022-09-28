import java.util.Scanner;

public class tres {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner (System.in);
        int x, y, soma;
        System.out.print("Digite o primeiro numero");
        x = leia.nextInt();
        System.out.println("Digite o segundo numero");
        y = leia.nextInt();
        soma = (x + y);
        System.out.println("A soma dos numeros e: " + soma);
    }
    
}
