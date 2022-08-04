import java.util.Scanner;

public class W101Mario {
    static Scanner scan = new Scanner(System.in);
    static int height;
    public static void main(String[] args) {

        do{
            prompt();
        } while (height < 0 || height > 9);
        Build(height);

    }
    public static void prompt() {

        System.out.println("enter the height: ");
         height = scan.nextInt();

    }
    public static void Build(int h) {
        int i, j;
        for (i =1; i <=h ; i++) {
            for (j =i; j <= h; j++) {
                System.out.print("  ");
            }
            for(j=1;j<=i;j++){
                    System.out.print(" #");

                }System.out.print("  ");
            for(j=1;j<=i;j++){
                System.out.print(" #");
            }

            System.out.println();
        }
    }

}







