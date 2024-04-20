import java.util.Scanner;
public class MultiplicacionRecursiva {

    public static void main(String[] args) {
        Scanner option = new Scanner(System.in);
        int a;
        do{
System.out.println("ingresa un valor ");
System.out.println("1:evaluar");
System.out.println("0:cerar programa");
a=option.nextInt();
int b,u;
if(a==1){
    System.out.println("ingresa 1 numero entero");

         b=option.nextInt();

         System.out.println("ingresa otro numero entero");

         u=option.nextInt();

         System.out.print("el resultado es: ");
         System.out.println(b * u);
    }
}

    while(a>0);
}
}