
public class Chiamata {
	Posizione pos;
	
	//costruttore
	public Chiamata(int posx, int posy) {
		pos=new Posizione(posx, posy);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int posx;
		int posy;
		posx=1;
		posy=2;
		Chiamata ch1 = new Chiamata (posx, posy);
		System.out.println("La posizione x è: " + ch1.pos.getX());
		System.out.println("la posizione y è: " + ch1.pos.getY());
	}

}
