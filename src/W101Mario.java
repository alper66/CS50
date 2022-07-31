import java.util.Scanner;

public class W101Mario {
    static Scanner scan = new Scanner(System.in);
   static int height;

    public static void main(String[] args) {

             Build(prompt());

    }


    public static int prompt() {

        do {
            System.out.println("enter the height: ");
            height = scan.nextInt();
        } while (height <= 0||height>9);
        return height;
    }

    public static void Build(int height) {
        int i, j,hashes;
        for (i =1; i <=height ; i++) {
            for (j =i; j <= height; j++) {
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







