package discoteca;

import java.util.Random;

public class Discoteca {
	private final static String[] NOM_PERSONES = {"Mario", "Jon", "Anna","Manel", "Pere", "Juan", "Maria", "Juana", "Tania", "Ariadne"};
	private final static String[] SEXE = {"Home", "Dona"};
	private final static String[] Calsat = {"sabates", "bambes", "sandalies"};
	
	private static final int NOMERO_PERSONES = 5;

	public static void main(String[] args) {
		
		Random MrRand = new Random();
		
		Porter gorila=new Porter(NOM_PERSONES[MrRand.nextInt(NOM_PERSONES.length)],MrRand.nextInt(18),
				SEXE[MrRand.nextInt(SEXE.length)],Calsat[MrRand.nextInt(Calsat.length)],MrRand.nextInt(30));
		System.out.println(gorila.toString());
		System.out.println(" ");
		System.out.println("              ----------------------------");

		for(int i=0; i<NOMERO_PERSONES; i++) {
						
			Client Persona = new  Client(NOM_PERSONES[MrRand.nextInt(NOM_PERSONES.length)],16+MrRand.nextInt(50),
					SEXE[MrRand.nextInt(SEXE.length)],Calsat[MrRand.nextInt(Calsat.length)],MrRand.nextInt(300));
			System.out.println(Persona.toString());
			
			if(gorila.PotEntrar(Persona)==true) {
				System.out.println("Pot entrar");
				System.out.println(" ");
			}else{
				System.out.println("No pot entrar");
				System.out.println(" ");
			}
		}
	}
}