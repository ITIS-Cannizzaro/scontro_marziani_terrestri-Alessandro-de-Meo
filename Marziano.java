public class Marziano {
	protected String matricola;
	protected int aut;
	protected int AI;
	protected int tek;
	public Marziano(){
	    this.matricola="indefinito";
	    this.aut=50;
	    this.AI=5;
	    this.tek=5;
	    System.out.println("Il marziano "+matricola+" entra in gioco.");
	  }
	  public Marziano(String a,int[]b){
	    this.matricola=a;
	    this.aut=b[0];
	    this.AI=b[1];
	    this.tek=b[2];
	    System.out.println("Il marziano "+matricola+" entra in gioco.");
	  }
	  public int getAut(){
	    return aut;
	  }
	  public int getAI(){
	    return AI;
	  }
	  public int getTek(){
	    return tek;
	  }
	  public void attaccaTerrestri(Terrestre t){
		int r =(int)(Math.random()*6);
	    if(attivo()==false) {
	      System.out.println("Non posso attaccare: Sono morto!");
	    }
	    else {
	    	t.vita=t.vita-(r*AI+tek);
	    	System.out.println("Il marziano "+matricola+" attacca il terrestre "+t.nome+" infliggendo "+((r*AI+tek))+" danni");
	    }
	  }
	  public boolean attivo(){
	    if (aut>0)
	      return true;
	    else
	      return false;
	  }
	  public String toString(){
	    return "Marziano:"+matricola+"\nAutonomia:"+aut;
	  }
	  public boolean equiv(Marziano x) {
		  if((aut==x.aut)&&(AI==x.AI)&&(tek==x.tek)) {
			  return true;}
		  return false;
	  }
}