package Metodos;

public class Tv {
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	
	public void ligar() 
	{
		if (ligada == false) 
		{
			ligada = true;
		}
		else 
		{
			ligada = false;
		}
	}
	
	public void aumentarVolume() 
	{
		volume++;
	}
	
	public void diminuirVolume() 
	{
		volume--;
	}
	
	public void subirCanal() 
	{
		canal++;
	}
	
	public void descerCanal() 
	{
		canal--;
	}
	
	public void mudarCanal(int novoCanal) 
	{
		canal = novoCanal;
	}
	
}
