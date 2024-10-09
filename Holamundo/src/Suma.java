import java.util.Scanner;

public class Suma {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        float  a = sc.nextFloat();
        
        System.out.println("Dame otro numero");
        float b = sc.nextFloat();

        System.out.println("Tus numeros son "+a+" y "+b);
        float c =  a + b;
        System.out.println("La suma es "+c);
        sc.close();

    }

}
