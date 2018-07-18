package Mastermind;

import java.util.Random;

public class Codee {
    private String compartment = "ABCDEF";
    private int N = compartment.length();
    private int codeLength = 4;
    private int randomCompartement;
    Random random = new Random();


    public Codee(String compartment, int n, int codeLength, int randomCompartement, Random random) {
        this.compartment = compartment;
        N = n;
        this.codeLength = codeLength;
        this.randomCompartement = randomCompartement;
        this.random = random;
    }

    public int method1() {

        for (int i = 0; i < codeLength; i++) {
            randomCompartement = compartment.charAt(random.nextInt(N));
        }
        return randomCompartement;
    }

}




