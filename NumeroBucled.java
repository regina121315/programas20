import java.util.Scanner;
public class NumeroBucled{

    public static void main(String[] args){
        Scanner option = new Scanner(System.in);
        int a,b;
        do{
System.out.println("ingresa un valor ");
System.out.println("0:cerar programa");
a=option.nextInt();
if(a==1){
    System.out.println("ingresa un numero");
}
System.out.println("ingresa otro numero");
b=option.nextInt();
for(int i;i>b;--i){
    System.out.println("i");
}
        }
    while(a>0);
}
}