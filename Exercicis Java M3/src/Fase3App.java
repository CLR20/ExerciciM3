import java.util.*;

public class Fase3App {
	
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
		
//FASE 3
				
		// Canviem les 'a' per '4'.
		
		HashMap <String, String> mapCiutats = new HashMap <String, String>();
		
		mapCiutats.put(city_1, "B4rcelon4");
		mapCiutats.put(city_2, "M4drid");
		mapCiutats.put(city_3, "V4lenci4");
		mapCiutats.put(city_4, "M4l4g4");
		mapCiutats.put(city_5, "C4dis");
		mapCiutats.put(city_6, "S4nt4nder");
		
		//Obtenim els valors del mapa.
		
		Collection <String> values = mapCiutats.values();
		
		//Construim una array amb els valors, per poder ordenar-los, i els ordenem.
		
		ArrayList <String> ArrayCiutatsModificades = new ArrayList <>(values);
		
		Collections.sort(ArrayCiutatsModificades);
		
		//Imprimim.
		
		for (String i: ArrayCiutatsModificades) {
			System.out.println(i);
			}
				
		}

}
