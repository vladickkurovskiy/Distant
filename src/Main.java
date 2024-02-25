import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");

//        int i = 5;
//        for ( ; i<10; i += 2){
//            System.out.println("puki");
//        }
//        System.out.println("i= " +i);



//        int num1 = 1;
//        int num2 = 1;
//        int sum = 0;
//        for (int i = 0; i < 9; i++) {
//            sum = num1 + num2;
//            System.out.print(sum + " ");
//            num1 = num2;
//            num2 = sum;
//        }



        int i = 10;

        while (true) {
            int random = (int) (Math.random() * 101);
            System.out.println(i + " sec.");
            System.out.println("random = " + random);

            if ( (random >= 85) && (random <= 100)) {
                System.out.println("WIN!!!!");
                break;
            }

                i--;
                if (i == -1) {
                    System.out.println("BOOM");
                    break;
                }

        }
    }
}