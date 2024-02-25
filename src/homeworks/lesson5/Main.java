package homeworks.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введіть ім'я першої команди:");

        String Team1 = scanner.nextLine();
        System.out.println("Команда 1 - " + Team1);
        System.out.println();

        int Playercount = 0;
        System.out.println("Введіть кількість фрагів для кожного гравця:");

        int player1 = 0 ;


            for (int i = 0; i < 5; i++) {
                switch (++Playercount) {
                    case 1: {
                        System.out.print("Перший гравець: ");
                        break;
                    }
                    case 2: {
                        System.out.print("Другий гравець: ");
                        break;
                    }
                    case 3: {
                        System.out.print("Третій гравець: ");
                        break;
                    }
                    case 4: {
                        System.out.print("Четвертий гравець: ");
                        break;
                    }
                    case 5: {
                        System.out.print("П'ятий гравець: ");
                        break;
                    }
                    default: {
                        System.out.println("default");
                        break;
                    }
                }
                if (scanner.hasNextInt()) {
                    player1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Очки " + Playercount + "го гравця: " + player1);
                } else {
                    System.out.println("Будь-ласка введіть числове значення!");
                    System.exit(0);
                }
                System.out.println();
            }
    }
}
