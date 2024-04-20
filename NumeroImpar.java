import java.util.Scanner;
public class NumeroImpar{

    public static void main(String[] args){
        Scanner option = new Scanner(System.in);
        int a;
        do{
System.out.println("ingresa un valor ");
System.out.println("1:evaluar");
System.out.println("0:cerar programa");
a=option.nextInt();
int r;
if(r % 2==0){
    
    System.out.println("el numero es par");
}

    else{
        System.out.println("el numero es impar");
    }

    }while(a>0);
}
}
