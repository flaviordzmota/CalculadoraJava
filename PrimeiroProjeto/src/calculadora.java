import java.util.Scanner;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class calculadora {
    public static void main(String[]args){
        var scan=new Scanner(System.in);

        int a,b;

        System.out.println("Digite um Número: ");
        a=scan.nextInt();
        System.out.println("Digite outro Número: ");
        b=scan.nextInt();

        int soma=soma(a, b);
        int subtracao=subutracao(a, b);
        float divisao=divisao(a, b);
        int multiplicacao=multiplicacao(a, b);

        System.out.println("a soma dos números é igual a: " + soma);
        System.out.println("a subtração dos números é igual a: " +subtracao);
        System.out.println("a divisão dos números é igual a: " +divisao);
        System.out.println("a multiplicação dos números é igual a: " +multiplicacao);


    }
    public static int soma(int a, int b) {
        return a+b;
    }
    public static int subutracao(int a, int b) {
        return a-b;
    }
    public static int divisao(int a, int b) {
        return a/b;
    }
    public static int multiplicacao(int a, int b) {
        return a*b;
    }
    
    
}

