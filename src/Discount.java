import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.*;
public class Discount {
    public static void main(String[] args) {

        DecimalFormat dec=new DecimalFormat("#.##");
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the price : ");
        float price=scan.nextFloat();
        System.out.println("enter the percentage : ");
        int percentage= scan.nextInt();
        float newPrice=discount(price,percentage);
       // String str=Float.toString(newPrice);
        System.out.println(newPrice);

        System.out.print("the price is :"+dec.format(newPrice));
      //  System.out.println("%2.f",newPrice);




    }
    private static float discount (float price, int percentage){
       return  price*(100-percentage)/100;

    }

}
