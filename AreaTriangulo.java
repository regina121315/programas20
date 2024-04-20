import java.util.Scanner;
public class AreaTriangulo{
    public static void main(String[] args) {
        Scanner option=new Scanner(System.in);
        float a;
        int r=2;
        do{
            System.out.println("ingresa el area deseada");
            System.out.println("1:evaluar area");
            System.out.println("0:cerrar programa");
            a=option.nextFloat();

            float b,c;
            
            if(a==1){
                System.out.println("ingresa 1 numero entero");
                b=option.nextFloat();

         System.out.println("ingresa otro numero entero");

         c=option.nextFloat();

         System.out.print("el resultado es: ");
         System.out.println(b*c /r);
    }
}

    while(a>0);
}
}