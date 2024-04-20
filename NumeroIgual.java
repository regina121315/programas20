import java.util.Scanner;
public class NumeroIgual{

    public static void main(String[] args){
        Scanner option = new Scanner(System.in);
        int a,r=1,j=0;
        do{
System.out.println("ingresa un valor ");
System.out.println("0:cerar programa");
a=option.nextInt();

if(r % r<=0){
    
    System.out.println("el numero es igual");
}
else if(j % r>1){
    System.out.println("el numero no es igual");
}
    
    else{
        System.out.println("no existe");
    }
    
    }while(a>0);
}
}
