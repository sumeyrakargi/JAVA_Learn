package Day11;

public class Varargs2 {

    // Create a multiply method with double varargs (return double)

    public static void main(String[] args) {

    }

        public static double carpim(double... a) {
        int carpim = 1;
        for (double value : a) {
            carpim *= value;
        }
        return carpim;
    }
}
