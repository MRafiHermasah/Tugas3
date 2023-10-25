package no1;

public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika mtkku = new Matematika();
        mtkku.pertambahan(20, 10);
        mtkku.pengurangan(10, 5);
        mtkku.perkalian(10, 3);
        mtkku.pembagian(21, 2);
        mtkku.display();

        Matematika2 mtkku2 = new Matematika2();
        mtkku2.display2();
    }
}
