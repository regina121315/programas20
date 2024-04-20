import java.util.Scanner;
public class NumerosOrdenados{

    public static void main(String[] args){
        Scanner option = new Scanner(System.in);
        int a,b,c,d;
        do{
            System.out.println("primer numero: ");
            a=option.nextInt();
            System.out.println("segundo numero: ");
            b=option.nextInt();
            System.out.println("tercer  numero: ");
            c=option.nextInt();
            System.out.println("1:evaluar numero ");
            System.out.println("0:cerrar programa");
            d=option.nextInt();
            
            if(a<b && a<c){
               if (b<a) {
                System.out.println("mayor " + a );
                System.out.println("enmedio" + b );
                System.out.println("menor" + c );
                   
            }
               else{
                System.out.println("mayor " + a );
                System.out.println("menor " + c );
                System.out.println("enmedio " + b );
               }
            }

            if(b<a && b<c){
                if (b<c) {
                 System.out.println("enmedio " + b );
                 System.out.println("mayor " + a );
                 System.out.println("menor " + c );
                    
             }
                else{
                 System.out.println("enmedio " + b );
                 System.out.println("menor " + c );
                 System.out.println("mayor " + a );
                }
             }
             if(c<a && c<b){
                if (c<b) {
                 System.out.println("menor " + c );
                 System.out.println("mayor " + a );
                 System.out.println("enmedio " + b );
                    
             }
                else{
                 System.out.println("menor " + c );
                 System.out.println("enmedio " + b );
                 System.out.println("mayor " + a );
                }
             }
        } 
        while(a>0);
} 
}
