package no2;

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu ks = new KonversiSuhu();
        ks.CelciusToFahrenheit(15);
        ks.CelciusToReamur(15);
        ks.disp();
        KonversiSuhu2 ks1 = new KonversiSuhu2();
        ks1.FahrenheitToReamur(20);
        ks1.disp2();
    }
}
