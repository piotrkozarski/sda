package Mastermind;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static Mastermind.Code.CODE_SIZE;

public class Move {
    private Code password;
    private Code guess;

    public Move(Code password, Code guess) {
        this.password = password;
        this.guess = guess;
    }

    public boolean isGuessed() {
        return password.equals(guess);
    }

    public int numberGuessed() {
        int count = 0;

   /*     for (int i = 0; i < CODE_SIZE; i++) {
            if (password.getCode().charAt(i) == guess.getCode().charAt(i))
                count++;
        }*/  // to jest to samo, co stream poniżej
        count =
                (int) Stream.iterate(0, n -> n + 1)

                        .limit(CODE_SIZE)
                        .filter((i -> password.getCode().charAt(i) == guess.getCode().charAt(i)))
                        .count();

        return count;
    }

    public int numberMissed() {
        int count = 0;
        String passwordCode = password.getCode();
        String guessCode = guess.getCode();

        List<Character> passwordDiff = new ArrayList<>();
        List<Character> guessDiff = new ArrayList<>();

        for (int i = 0; i < CODE_SIZE; i++) {
            if (passwordCode.charAt(i) != guessCode.charAt(i)) {

                passwordDiff.add(passwordCode.charAt(i));
                guessDiff.add(guessCode.charAt(i));
            }
        }

        for (Character ch : guessDiff) {
            if (passwordDiff.contains(ch)) {
                count++;
                passwordDiff.remove(ch);

            }
        }
        return count;
    }
}

