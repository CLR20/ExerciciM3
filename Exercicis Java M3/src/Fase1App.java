import java.util.Scanner;

public class Fase1App {
	
	public static void main(String[] args) {
		
		// Construim 6 variables String buides.
		
		String city_1;
		String city_2;
		String city_3;
		String city_4;
		String city_5;
		String city_6;
		
		//Li demanem al usuari què ens escrigui les 6 ciutats amb un control panel.
		
		Scanner cities = new Scanner (System.in);
			
		System.out.println("Escriu sis noms de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander): ");
	
		//Assignem per ordre les ciutats a cada variable creada.
		
		city_1 = cities.nextLine();
		city_2 = cities.nextLine();
		city_3 = cities.nextLine();
		city_4 = cities.nextLine();
		city_5 = cities.nextLine();
		city_6 = cities.nextLine();
		
		//Imprimim les variables.
		
		System.out.println("La primera ciutat és " + city_1);
		System.out.println("La segona ciutat és " + city_2);
		System.out.println("La tercera ciutat és " + city_3);
		System.out.println("La quarta ciutat és " + city_4);
		System.out.println("La cinquena ciutat és " + city_5);
		System.out.println("La sisena ciutat és " + city_6);

	}

}
