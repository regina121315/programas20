import java.util.Scanner;
public class Multiplicacion {
    public static void main (String [] args){
        Scanner option = new Scanner(System.in);
        int a,b;

         System.out.println("ingresa 1 numero entero");

         a=option.nextInt();

         System.out.println("ingresa otro numero entero");

         b=option.nextInt();

         System.out.println("el resultado es: ");
         System.out.print(a*b);
    }
}
