package Sesion;

public class Complex extends Re {
    private int Im;

    public Complex(int iReal, int iImage){
        super(iReal);
        this.Im = iImage;
    }

    public String toString(){
        return re + " + " + Im + "*i";
    }
}

