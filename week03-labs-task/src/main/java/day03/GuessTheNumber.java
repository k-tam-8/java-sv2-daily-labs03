package day03;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public String checkNum(int number, int guess) {
        if (number < guess) {
            return "A szám kisebb.";
        } else if (number > guess) {
            return "A szám nagyobb.";
        } else {
            return "Kitaláltad a számot!";
        }
    }

    public static void main(String[] args) {
        int guessNumber=1;
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        GuessTheNumber guessTheNumber=new GuessTheNumber();
        int number = rnd.nextInt(99) + 1;
        while (guessNumber < 7) {
            System.out.print("Kérek egy tippet: ");
            int guess = sc.nextInt();
            guessNumber++;
            System.out.println(guessTheNumber.checkNum(number,guess));
            if (guessNumber==7) System.out.println("Nem sikerült kitalálni: "+ number);
            if (guessTheNumber.checkNum(number,guess).equals("Kitaláltad a számot!")) break;
        }
    }
}
