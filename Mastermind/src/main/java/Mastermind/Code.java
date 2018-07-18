package Mastermind;

import java.util.Objects;
import java.util.Random;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class Code {
    public static final String ALLOWED_CHARS = "ABCD";
    public static final int CODE_SIZE = 4;
    private String code;

    public Code(String code) {
        this.code = code;
    }

    public static Code generateRandom() {
        String generatedCode = "";

        Random generator = new Random();

/*        for (int i = 0; i<CODE_SIZE; i++){
            generatedCode += ALLOWED_CHARS.charAt(new Random().nextInt()%ALLOWED_CHARS.length());
        }*/  //to jest to samo co poniżej w streamie

        generatedCode = Stream.generate(generator::nextInt)
                .filter(n -> n >= 0)
                .limit(CODE_SIZE)
                .map(n -> n % ALLOWED_CHARS.length())
                .map(ALLOWED_CHARS::charAt)
                .map(String::valueOf)
                .collect(joining());

        return new Code(generatedCode);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Code code1 = (Code) o;
        return Objects.equals(code, code1.code);
    }

    @Override
    public int hashCode() {

        return Objects.hash(code);
    }

    public String getCode() {
        return code;
    }
}
