package no1;

public class Matematika {
    public int pertambahan(int a, int b) {
        return a + b;
    }

    public int pengurangan(int a, int b) {
        return a - b;
    }

    public int perkalian(int a, int b) {
        return a * b;
    }

    public double pembagian(double a, double b) {
        return a / b;
    }

    public void display() {
        int angka1 = 20;
        int angka2 = 10;
        System.out.println("Pertambahan: " + angka1 + " + " + angka2 + " = " + pertambahan(angka1, angka2));

        angka1 = 10;
        angka2 = 5;
        System.out.println("Pengurangan: " + angka1 + " - " + angka2 + " = " + pengurangan(angka1, angka2));

        angka1 = 10;
        angka2 = 3;
        System.out.println("Perkalian: " + angka1 + " * " + angka2 + " = " + perkalian(angka1, angka2));

        double angka3 = 21;
        double angka4 = 2;
        System.out.println("Pembagian: " + angka3 + " / " + angka4 + " = " + pembagian(angka3, angka4));
    }
}
