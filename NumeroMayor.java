import java.util.Scanner;
public class NumeroMayor{

    public static void main(String[] args){
        Scanner option = new Scanner(System.in);
        int a,b=1;
        do{
System.out.println("ingresa un valor ");
System.out.println("0:cerar programa");
a=option.nextInt();

if(a>=b){
    System.out.println("el numero es mayor");
}
else if(b<=0 && b>=a){
    System.out.println("el numero es menor");

}
        }
    while(a>0);
    }
}
