import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Fase2App {
	
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
		

// FASE 2
		
		// Construim una nova ArrayList.
		
		ArrayList <String> arrayCiutats = new ArrayList <String>();
		
		//Emplenem amb les variables obtingudes anteriorment.
		
		arrayCiutats.add(city_1);
		arrayCiutats.add(city_2);
		arrayCiutats.add(city_3);
		arrayCiutats.add(city_4);
		arrayCiutats.add(city_5);
		arrayCiutats.add(city_6);
		
		//Construim la col·lecció arrayCiutats per ordenar-la.
		
		Collections.sort(arrayCiutats);
		
		// Imprimim.
		
		for(String i: arrayCiutats){
			
			System.out.println(i);
		
		}
	}

}
