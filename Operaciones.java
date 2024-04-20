import java.util.Scanner;
public class Operaciones{
    public static void main(String[] args){
        Scanner option = new Scanner(System.in);
    int a;
    do{
        System.out.println("ingresa un numero");
        System.out.println("1:suma");
        System.out.println("2:resta");
        System.out.println("3:multiplicacion");
        System.out.println("4:division");
        System.out.println("5:modulo");
        System.out.println("0:cerar programa");
        a=option.nextInt();
    int b,c;
    switch (a) {
        case 1:
            System.out.println("Suma");
            System.out.println("ingresa 1 numero entero");
            b=option.nextInt();
            System.out.println("ingresa otro numero entero");
            c=option.nextInt();
            System.out.print("el resultado es: ");
            System.out.println(b + c);
            break;

        case 2:
            System.out.println("Resta");
            System.out.println("ingresa 1 numero entero");
            b=option.nextInt();
            System.out.println("ingresa otro numero entero");
            c=option.nextInt();
            System.out.print("el resultado es: ");
            System.out.println(b - c);
            break;

        case 3:
            System.out.println("Multiplicacion");
            System.out.println("ingresa 1 numero entero");
            b=option.nextInt();
            System.out.println("ingresa otro numero entero");
            c=option.nextInt();
            System.out.print("el resultado es: ");
            System.out.println(b * c);
            break;

        case 4:
            System.out.println("Division");
            System.out.println("ingresa 1 numero entero");
            b=option.nextInt();
            System.out.println("ingresa otro numero entero");
            c=option.nextInt();
            System.out.print("el resultado es: ");
            System.out.println(b / c);
            break;

        case 5:
            System.out.println("Modulo");
            System.out.println("ingresa 1 numero entero");
            b=option.nextInt();
            System.out.println("ingresa otro numero entero");
            c=option.nextInt();
            System.out.print("el resultado es: ");
            System.out.println(b % c);
            break;
            default:System.out.println("cerrar programa");
            break;
    }
}

    while(a>0);
}
}