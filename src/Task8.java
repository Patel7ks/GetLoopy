import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        String answer = "y";

        while(answer.equalsIgnoreCase("y")){

            int roll = 0;
            int dice1 = 0;
            int dice2 = 0;
            int dice3 = 0;
            boolean triple = false;

            System.out.printf("%-8s", "Roll");
            System.out.printf("%-8s", "Dice1");
            System.out.printf("%-8s", "Dice2");
            System.out.printf("%-8s", "Dice3");
            System.out.printf("%-8s%n", "Sum");

            System.out.println("----------------------------------------");

            while (!triple){
                roll++;

                dice1 = random.nextInt(6) + 1;
                dice2 = random.nextInt(6) + 1;
                dice3 = random.nextInt(6) + 1;

                int sum = dice1 + dice2 + dice3;

                System.out.printf("%-8d", roll);
                System.out.printf("%-8d", dice1);
                System.out.printf("%-8d", dice2);
                System.out.printf("%-8d", dice3);
                System.out.printf("%-8d%n", sum);

                if (dice1 == dice2){
                    if (dice1 == dice3){
                        triple = true;
                        System.out.println("You got a triple!");
                    }
                }
            }
            System.out.print("Would you like to play again? (y/n): ");
            answer = input.next();
        }
        System.out.println("Thanks for playing!");

        input.close();
    }
}
