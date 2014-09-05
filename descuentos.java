
import java.io.*;
import java.util.Random;

public class descuentos {
    static String prod1, prod2, pre1,pre2; 
    static double d,sum, pt,pr1,pr2;
    static int x,limite=10;
    public static void main(String[]args){
        Random r = new Random();
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Dame producto 1");
            prod1=entrada.readLine();
            System.out.println("Dame precio 1");
            pre1=entrada.readLine();
            pr1=Float.parseFloat(pre1);
            System.out.println("Dame producto 2");
            prod2=entrada.readLine();
            System.out.println("Dame precio 2");
            pre2=entrada.readLine();
            pr2=Float.parseFloat(pre2);
            sum=pr1+pr2;
            if(sum < 5000){
                x=r.nextInt(limite+1);
                if(x==2){
                    d=sum*.5;
                    pt=sum-d;
                    System.out.println("Verde");
                }else if(x==4){
                    d=sum*.3;
                    pt=sum-d;
                    System.out.println("Azul");
                }else if(x==6){
                    d=sum*.25;
                    pt=sum-d;
                    System.out.println("Rojo");
                }else if(x==9){
                    d=sum*.1;
                    pt=sum-d;
                    System.out.println("Rojo");
                }else if(x==1){
                    pt=sum-sum;
                    System.out.println("Dorado");
                }else{
                    System.out.println("No hay descuento");
                    pt=sum;
                }
                System.out.println("Tu producto 1: "+ prod1+"+ tu producto 2: "+prod2+" dan un total de: "+sum+" con un descuento de: "+d+" y da un total de: "+pt);            
            }else{
                System.out.println("No hay descuento, paga: "+sum);
            }
        }catch(IOException e){
            System.out.println("Error");
        }
    }
    
}
