public class Terrestre {
	protected String nome;
	protected int vita;
	protected int velocita;
	protected int armamento;
	public Terrestre() {
		this.nome="sconosciuto";
		this.vita=50;
		this.velocita=5;
		this.armamento=5;
		System.out.println("Il terrestre "+nome+" entra in gioco.");
	}
	public Terrestre(String x,int y[]) {
		this.nome=x;
	    this.vita=y[0];
	    this.velocita=y[1];
	    this.armamento=y[2];
	    System.out.println("Il terrestre "+nome+" entra in gioco.");
	}
	public void attaccaMarziani(Marziano m) {
		int r =(int)(Math.random()*6);
		if(vivente()==false) {
			System.out.println("Non posso attaccare: Sono morto!");
		}
		else {
			m.aut=m.aut-(r*velocita+armamento);
		System.out.println("Il terrestre "+nome+" attacca il marziano "+m.matricola+" infliggendo "+((r*velocita+armamento))+" danni");
		}
	}
	public boolean vivente() {
		if(vita>0)
			return true;
		return false;
	}
	public String toString() {
		return "Terrestre:"+nome+"\nVita:"+vita;
	}
	public boolean equiv(Terrestre x) {
		  if((vita==x.vita)&&(velocita==x.velocita)&&(armamento==x.armamento)) {
			  return true;}
		  return false;
	  }
}