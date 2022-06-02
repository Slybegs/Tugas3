import rumus.Bola;
import rumus.Limas;
import rumus.Segitiga;
import rumus.Tabung;
import rumus.Balok;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String pembuka = "Selamat Datang di Mata Kuliah \" Pemrograman Berorientasi Objek \" ";
        int tahun = 2022;

        System.out.println("---------------------------------------------------------------------------");
        System.out.println(pembuka + "Tahun " + tahun);
        System.out.println("---------------------------------------------------------------------------");
        
    /*
    Aplikasi Bangun Ruang
    1. Bola
    2. Limas
    3. Segitiga
    4. Tabung
    5. Balok
    6. Keluar
    Pilihan Anda (1/2/3/4/5/6) :

    Apakah anda ingin kembali ke menu utama (y/n)?

    percabangan untuk 1,2,3,4,5,6
    while => bungkus code untuk mengulag ke perintah pertama?
    */

    //cetak menu
    //terima input 1,2,3,4,5,6 (int)
    //percabangan
    //terima input pilihan y/n (string)
    //perulangan
    
        Scanner keyboard = new Scanner(System.in);

        int pil = 0;
        String yn = "y";

        do{
            //cetak menu
            System.out.println("Aplikasi Bangun Ruang");
            System.out.println("1. Bola");
            System.out.println("2. Limas");
            System.out.println("3. Segitiga");
            System.out.println("4. Tabung");
            System.out.println("5. Balok");
            System.out.println("6. Keluar");
            System.out.print("Pilihan Anda (1/2/3/4/5/6) : ");

            //terima input 1,2,3,4,5,6 (int)
            pil = keyboard.nextInt();

            //percabangan
            if (pil == 1){
                menuBola(keyboard);
            }
            else if (pil == 2){
                menuLimas(keyboard);
            }
            else if (pil == 3){
                menuSegitiga(keyboard);
            }
            else if (pil == 4){
                menuTabung(keyboard);
            }
            else if (pil == 5){
                menuBalok(keyboard);
            }
            else if (pil == 6) break;

        //terima input pilihan y/n (string)
            System.out.print("Apakah anda ingin kembali ke menu utama (y/n)? ");
            yn = keyboard.next();
            bersihkanlayar();

        }while(yn.equalsIgnoreCase("y"));

        }

    //Scan Keyboard 
    public static void bersihkanlayar(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void menuBola (Scanner keyboard){
        Bola bola = new Bola();
        System.out.println("Menghitung Luas dan Volume Permukaan Bola");
        System.out.print("Masukkan Nilai r = ");
        bola.r = keyboard.nextInt();    
        bola.tampilkanLuasPermukaanBola();
        bola.tampilkanVolumeBola();

    }
    
    public static void menuLimas (Scanner keyboard){
        Limas limas = new Limas();
		System.out.print("Masukkan alas = ");
		limas.alas = keyboard.nextFloat();
		System.out.print("Masukkan tinggi = ");
		limas.tinggi = keyboard.nextFloat();
		limas.hitungVolume();
		System.out.println("Hasil Perhitungan Volume Limas = "+limas.volume);

    }

    public static void menuSegitiga (Scanner keyboard){
        Segitiga segitiga = new Segitiga();
        System.out.print("Masukkan alas = ");
        segitiga.a = keyboard.nextInt();
        System.out.print("Masukkan tinggi = ");
        segitiga.t = keyboard.nextInt();

        //tampilkan luas segitiga siku-siku
        segitiga.tampilkanLuasSegitiga();

    }
    
    public static void menuTabung (Scanner keyboard){
        Tabung tabung = new Tabung();
        System.out.print("Input Jari-jari = ");
        tabung.r = keyboard.nextInt();
        System.out.print("Input Tinggi = ");
        tabung.t = keyboard.nextInt();

        //tampilkan volume tabung
        tabung.tampilkanVolumeTabung();

    }

    public static void menuBalok (Scanner keyboard){
        System.out.println("Menghitung Volume Balok");
        Balok balok = new Balok();

        System.out.print("Masukkan panjang sisi balok = ");
        balok.p = keyboard.nextInt();

        System.out.print("Masukkan lebar sisi balok = ");
        balok.l = keyboard.nextInt();

        System.out.print("Masukkan tinggi sisi balok = ");
        balok.t = keyboard.nextInt();

        balok.caraVolumeBalok();
        balok.showVolumeBalok();
    }

}
