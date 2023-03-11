public class GiocoBattaglia {

	public static void main(String[] args) {
		System.out.println("Il gioco ha inizio.");
		Marziano m1 = new Marziano();
		Terrestre t1 = new Terrestre();
		int [] a =  {50,5,5};
		Marziano m2 = new Marziano("x102",a);
		int [] b = {75,10,6};
		Terrestre t2 = new Terrestre ("Ken",b);
		System.out.println(m1.equiv(m2));
		System.out.println(t1.equiv(t2));
		System.out.println(m2.toString());
		System.out.println(t2.toString());
		m2.attaccaTerrestri(t2);
		t2.attaccaMarziani(m2);
		System.out.println(m2.toString());
		System.out.println(t2.toString());
		m2.attaccaTerrestri(t2);
		t2.attaccaMarziani(m2);
		System.out.println(m2.toString());
		System.out.println(t2.toString());
		System.out.println("Il gioco è terminato.");
	}

}