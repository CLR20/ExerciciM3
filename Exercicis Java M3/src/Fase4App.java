import java.util.*;

public class Fase4App {
	
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
		

//FASE 4
		
		// Construim les variables.
		char city_1_rev[] = new char[city_1.length()];
		char city_2_rev[] = new char[city_2.length()];
		char city_3_rev[] = new char[city_3.length()];
		char city_4_rev[] = new char[city_4.length()];
		char city_5_rev[] = new char[city_5.length()];
		char city_6_rev[] = new char[city_6.length()];
		
		// Les emplenem i omplim l'array, i demanem la inversa.
		for (int i=0; i < city_1.length(); i++) {
			city_1_rev[city_1.length()-i-1] = city_1.charAt(i);
		}
		for (int i=0; i < city_2.length(); i++) {
			city_2_rev[city_2.length()-i-1] = city_2.charAt(i);
		}
		for (int i=0; i < city_3.length(); i++) {
			city_3_rev[city_3.length()-i-1] = city_3.charAt(i);
		}
		for (int i=0; i < city_4.length(); i++) {
			city_4_rev[city_4.length()-i-1] = city_4.charAt(i);
		}
		for (int i=0; i < city_5.length(); i++) {
			city_5_rev[city_5.length()-i-1] = city_5.charAt(i);
		}
		for (int i=0; i < city_6.length(); i++) {
			city_6_rev[city_6.length()-i-1] = city_6.charAt(i);
		}
		
		// Imprimim.
		System.out.println(city_1_rev);
		System.out.println(city_2_rev);
		System.out.println(city_3_rev);
		System.out.println(city_4_rev);
		System.out.println(city_5_rev);
		System.out.println(city_6_rev);
		
		}

}
