package rumus;

public class Tabung {
    //atribut
    public final float PI = 22.0f/7;
    public int r = 0;
    public int t = 0;
    public float volume = 0;

    //hitung volume tabung
    public void hitungVolumeTabung(){
        volume = PI * r * r * t;
    }

    //tampilkan volume tabung
    public void tampilkanVolumeTabung(){
        hitungVolumeTabung();
        System.out.println("Volume Tabung = " + PI + " * " + r + " * " + r + " * " + t + " = " + volume + " ");
    }
}
