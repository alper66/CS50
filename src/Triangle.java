public class Triangle {
static int n=5,i,j,k;
    public static void main(String[] args) {
     //  Triangle T1=new Triangle();
        //square();
      //  IncreaseTriangle();
       // System.out.println();
     // decreaseTriangle();
    //    bridge();
    // reverseHill();
    tree();

    }   public static void square() {
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void IncreaseTriangle(){
        for (i = 1; i <5; i++) {
            for (j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void decreaseTriangle(){
        for (i = 1; i <= 5; i++) {
            for (j = i; j <= 5; j++) {
                System.out.print("  ") ;
            }
            for(j=1;j<i;j++){
                System.out.print("* ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void  reverseHill(){
        for(i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print("  ");
            }
                for(j =i;j<=n; j++) {
                    System.out.print("* ");
                }
                  for (j = i; j < n; j++) {
                      System.out.print("* ");
                  }


                    System.out.println();
        }

    }
    public static void bridge(){

        for(i=1;i<=n;i++){
           for (j=1;j<n;j++) {
                System.out.print("  ");
            }
            System.out.print("|   |");
            System.out.println();
            }
    }


    public static void tree (){
        for(i=1;i<=n;i++){
            for (j=i;j<=n;j++){
                if(j<n){
                    System.out.print(" ");

                }else {
                    for (k=1;k<=i;k++) {
                        System.out.print("* ");
                    }

               }

            }
            System.out.println();
        }
    }

}
