package rumus;
public class Bola {
    //deklarasi 
    public final float PI = 22.0f/7;
    public float luas = 0;
    public double volume = 0;
    public int r = 5;

    //menghitung luas permukaan bola
    public void hitungLuasPermukaanBola(){
        //luas permukaan bola = 4 * pi * r2
        luas = 4 * PI * r * r;
    }

    //menampilkan luas permukaan bola
    public void tampilkanLuasPermukaanBola(){
        hitungLuasPermukaanBola();
        System.out.println("Luas Permukaan Bola = 4 * "+ PI +" * "+ r +" * "+ r +" = "+ luas +"");
    }

    //menghitung volume bola
    public void hitungVolumeBola(){
        //volume bola = (4/3) * pi * r3
        volume = 4 * PI * Math.pow(r,3) / 3; //Math.pow(r,3) -> r * r * r
    }

    //menampilkan volume bola
    public void tampilkanVolumeBola(){
        hitungVolumeBola();
        System.out.println("Volume Bola = (4/3) * "+ PI +" * "+ r +" * "+ r +" * "+ r +" = "+ volume +"");
    }
}
