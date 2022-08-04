
import java.util.Scanner;

public class W102CreditCartNUm {
    /*
    34 or 37 amex
    51,52,53,54,55 master
    4 visa
     */
     long cartNumber;
    static long cartInput;
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        //request  cart number
        W102CreditCartNUm obj=new W102CreditCartNUm();
       // long cart_number=obj.prompt();

        do {
            System.out.println("enter the credit number: ");
           cartInput = obj.prompt();
        } while (obj.valid_cart(cartInput));
        obj.check(cartInput);
    }
    public  void check( long cartNumber){
            int digit=cartDigit(cartNumber);
        int fDigit=firstDigit(cartNumber);
        if(digit==15&&(firstTwoDigit(cartNumber)>=51&&firstTwoDigit(cartNumber)<=55)){
            System.out.println("AMEX");
        }
        else if((digit==13|| digit==16) && fDigit==4 ) {
            System.out.println("visa");
        }else if( digit==16&&(firstTwoDigit(cartNumber)==34||firstTwoDigit(cartNumber)==37)){
            System.out.println("Master card");
        }
        else {
            System.out.println("unknown bank cart");
        }
    }
    public long prompt(){
        cartNumber= scan.nextLong();
        return cartNumber;
    }
    public int firstDigit(long cartNumber) {
        int first_digit = 0;
        while(cartNumber!=0) {
            cartNumber/=10;
            if (cartNumber == cartNumber % 10) {
                first_digit=(int) cartNumber;
                break;
            }
        }  return first_digit;
    }
    public int firstTwoDigit(long cartNumber){
        return (int)Long.parseLong(Long.toString(cartNumber).substring(0,2));
    }
    public  int cartDigit(long cartNumber) {
        int digit=0;
      while(cartNumber!=0){
          cartNumber/=10;
          digit++;
      }
       // System.out.println(digit);
        return digit;
    }
    public boolean valid_cart(long cartNumber){
      int sum=calculate_sum_of_2nd_digit()+sum_of_rest_digit(cartNumber);
        //System.out.println(sum);
       // System.out.println("validcart cart number:"+cartNumber);
        boolean valid;
      if(sum%2!=0||cartDigit(cartNumber)<13||cartDigit(cartNumber)>16){
          System.out.println("Invalid cart");
          System.out.println(cartNumber);
          valid= true;
      }else {
      valid=false;
    }
      return valid;
    }
    public  int calculate_sum_of_2nd_digit(){
        int digits; int sum1=0,sum2=0,sumB,sumTotal;
        while(cartNumber!=0){
            cartNumber/=10;
            digits=(int)(cartNumber%10)*2;
            if(digits<10) {
                sum1 += digits;
            }else {
                sumB=bigger_digit(digits);
                sum2+=sumB;
            }
            cartNumber /= 10;
        }
        sumTotal=sum1+sum2;
        return sumTotal;
    }
    public int sum_of_rest_digit(long cartNumber){
        long rest_digit; int rest_digits_sum=0;
        while(cartNumber!=0){
            rest_digit=cartNumber%10;
            cartNumber/=100;
            rest_digits_sum+=rest_digit;

        }
    return rest_digits_sum;
    }
    public int bigger_digit(int i){
        int firstD, secondD ,sum;
        firstD=i/10;
        secondD=i%10;
        sum=firstD+secondD;
     return  sum;
    }


}

