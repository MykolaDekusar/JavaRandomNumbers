import java.util.Random; //importiamo la classe random

public class Main {

	public static void main(String[] args) {
		//creiamo una nuova classe random
		Random caso = new Random();
		int x = caso.nextInt();//crea un numero casuale tra -2miliardi e +2miliardi
		System.out.println(x);
		//se vogliamo limitare il numero bisogna inserire il valore tra le parentesi
		//ricordiamoci che i numeri partono da 0, quindi se si vuole
		//partire da 1 bisogna aggiungere +1 fuori dalle parentesi
		int y= caso.nextInt(6)+1;
		System.out.println(y);
		double z = caso.nextDouble();
		System.out.println(z);
		boolean bool=caso.nextBoolean();
		System.out.println(bool);
	}

}
