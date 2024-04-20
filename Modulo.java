import java.util.Scanner;
public class Modulo {
    public static void main (String[] args){
Scanner opcion= new Scanner(System.in);
float a,b;
System.out.println("ingresa un numero");
a=opcion.nextFloat();

System.out.println("ingresa otoro numero");
b=opcion.nextFloat();

System.out.print("el resultado es: ");
System.out.println(a%b);

    }
}
