package rumus;

public class Segitiga {
    //atribut: alas, tinggi, Luas
    public final float setengah = 1.0f/2;
    public int a=0;
    public int t=0;
    public float luas=0;

    //method hitung luas segitiga siku-siku = 1/2*a*t
    public void hitungLuasSegitiga(){
        luas = setengah * a * t;
    }

    //menampilkan luas segitiga
    public void tampilkanLuasSegitiga(){
        hitungLuasSegitiga();
        System.out.println("Luas Segitiga siku-siku = 1/2 * " + a + " * " + t + " = " + luas + "");
    }

}
