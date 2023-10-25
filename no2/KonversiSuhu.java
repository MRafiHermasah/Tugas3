package no2;

public class KonversiSuhu {
    double celcius,fahrenheit,reamur;
public void CelciusToFahrenheit(double celcius){
    fahrenheit = (celcius * 9/5) + 32;
}
public void CelciusToReamur(double celcius){
    reamur = celcius * 4/5;
}
public double getFahrenheit(){
    return fahrenheit;

}
public double getReamur(){
    return reamur;
}
public void disp(){
    System.out.println("Konversi dari celcius ke fahrenheit adalah "+ getFahrenheit());
    System.out.println("Konversi dari celcius ke reamur adalah "+ getReamur());
}
}
