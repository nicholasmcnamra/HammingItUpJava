package zipcode;

public class Hamming {
    private String s;
    private String s1;

    IllegalArgumentException iae = new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");

    public Hamming(String s, String s1) {
        this.s = s;
        this.s1 = s1;
        if (s.length() != s1.length()) {
            throw iae;
        }
    }

    public int getHammingDistance() {
            int hammingDist = 0;

            char[] sC = s.toCharArray();
            char[] sC1 = s1.toCharArray();

            for (int i = 0; i < sC.length; i++) {
                if (sC[i] != sC1[i]) {
                    hammingDist++;
                }

            }
            return hammingDist;
    }
}
