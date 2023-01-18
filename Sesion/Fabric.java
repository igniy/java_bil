package Sesion;

import java.util.Random;

public class Fabric{

    public Complex createComplex() {
        return new Complex(new Random().nextInt(1,100), new Random().nextInt(1,100));
    }

    public Complex createComplex(int Re, int im) {
        return new Complex(Re, im);
    }
}
