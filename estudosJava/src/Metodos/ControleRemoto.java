package Metodos;

public class ControleRemoto {
	
	public static void main(String[] args) throws Exception {
	    Tv 	tv = new Tv();
	    
	    tv.ligar();

	    
	    System.out.println("A tv está ligada?"+tv.ligada);
	    System.out.println("Canal: "+tv.canal);
	    System.out.println("Volume: "+tv.volume);
	    
	    tv.mudarCanal(32);
	   
	    tv.descerCanal();
	    tv.descerCanal();
	    tv.descerCanal();
	   
	    tv.subirCanal();
	    tv.subirCanal();
	    tv.subirCanal();
	    tv.subirCanal();
	    
	    tv.diminuirVolume();
	    tv.diminuirVolume();
	    tv.diminuirVolume();
	    
	    tv.aumentarVolume();
	    
	    System.out.println("A tv está ligada?"+tv.ligada);
	    System.out.println("Canal: "+tv.canal);
	    System.out.println("Volume: "+tv.volume);
	   
	    tv.ligar();
	    
	    System.out.println("A tv está ligada?"+tv.ligada);
}
	
}
