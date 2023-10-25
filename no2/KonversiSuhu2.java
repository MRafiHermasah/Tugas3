package no2;

public class KonversiSuhu2 extends KonversiSuhu {
    public void FahrenheitToReamur(double fahrenheit) {
        reamur = (fahrenheit - 32) * 4/9;
    }

    public double getReamur2() {
        return reamur;
    }

    public void disp2() {
        System.out.println("Konversi dari fahrenheit ke reamur adalah " + getReamur2());
    }
}
