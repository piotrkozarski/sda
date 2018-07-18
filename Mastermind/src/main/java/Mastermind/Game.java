package Mastermind;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Code password = Code.generateRandom();
        List<Move> moves = new ArrayList<>();

        Scanner inScanner = new Scanner(System.in);


        while (true) {  //no while

            Code userInputCode = new Code(inScanner.nextLine());
            Move move = new Move(password, userInputCode);

            moves.add(move);

            if (move.isGuessed())
                break;

            System.out.println(move.numberGuessed() + " , " + move.numberMissed());

        }

    }

}
