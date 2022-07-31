public class runner {
  static long cart;
    public static void main(String[] args) {

        W102CreditCartNUm a=new W102CreditCartNUm();
       int g=1;
        while(g!=0) {
            do {
                cart = a.prompt();
            } while (a.valid_cart(cart));
            a.check(cart);
        }
    //    System.out.println(a.firstDigit(4003600000000014L));
        //firstDigit(4003600000000014L);
    }
    public static int sum_of_rest_digit(long a){
        long rest_digit; int rest_digits_sum=0;
        while(a!=0){
            rest_digit=a%10;
            a/=100;
            rest_digits_sum+=rest_digit;

        }
        return rest_digits_sum;
    }

    public static void  check2(long cartNumber ){
        int digit=cartDigit2(cartNumber);
        int fDigit=firstDigit2(cartNumber);
        if(digit==15){
             System.out.println("AMEX");
        }else if((digit==13|| digit==16) && fDigit==4 ) {
            System.out.println("visa");
        }else if( digit==16){
            System.out.println("Master card");
        }
        else {
            System.out.println("Invalid cart-not enough length");
        }

    }
    public static int firstDigit( long cartNumber){
        int first2digit=(int)Long.parseLong(Long.toString(cartNumber).substring(0,2));
        System.out.println(first2digit);
        return first2digit;
    }
    public static int firstDigit2( long cartNumber) {
        int first_digit=0;
        while(cartNumber>0){
             cartNumber/=10;
            System.out.println(cartNumber);
            if (cartNumber == cartNumber % 10) {
                first_digit =(int) cartNumber;
                break;
            }
            }


        System.out.println(" first digit is: "+cartNumber);
        return first_digit;
    }
    public static   int cartDigit2(long cartNumber) {
        int digit=0;
        while(cartNumber!=0){
            cartNumber/=10;
            digit++;
        }
        System.out.println(digit);
        return digit;
    }
}
