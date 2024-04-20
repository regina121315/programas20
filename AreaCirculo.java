import java.util.Scanner;
public class AreaCirculo{
    public static void main(String[] args) {
        Scanner option=new Scanner(System.in);
        int a;
        int r=2;
        double b=3.1415;
        do{
            System.out.println("ingresa el numero");
            System.out.println("1:evaluar el radio");
            System.out.println("0:cerrar programa");
            a=option.nextInt();

            if(a==1){

         System.out.println("ingresa el area");
         r=option.nextInt();
         
         System.out.print("el resultado es: ");
         System.out.println(r*r *b);
    }
}while(a>0);
    }
}