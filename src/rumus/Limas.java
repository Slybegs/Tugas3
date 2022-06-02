package rumus;

public class Limas {
    public float alas;
	public float tinggi;
	public float luasalas;
	public float volume;
	
	public void hitungVolume() {
		luasalas=alas*alas;
		volume = (1.0f/3)*(luasalas)*tinggi;
	}
}
