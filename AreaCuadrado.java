import java.util.Scanner;
public class AreaCuadrado{
    public static void main(String[] args) {
        Scanner option=new Scanner(System.in);
        double a;
        do{
            System.out.println("ingresa el lado del cuadrado");
            System.out.println("1:area");
            System.out.println("0:cerar programa");
            a=option.nextInt();

            int b,c;
            if(a==1){
                System.out.println("ingresa 1 numero entero");

         b=option.nextInt();

         System.out.println("ingresa otro numero entero");

         c=option.nextInt();

         System.out.print("el resultado es: ");
         System.out.println(b*c);
    }
}

    while(a>0);
}
}

