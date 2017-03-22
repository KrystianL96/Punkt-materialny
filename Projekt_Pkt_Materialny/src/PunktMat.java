
public class PunktMat extends PktMat{ //klasa testowa

	public static void main(String[] args) {
		PktMat pkt1 = new PktMat();	//tworzenie obiektu przez konstruktor domyœlny
		PktMat pkt2 = new PktMat(20);	//tworzenie obiektu przez konstruktor z parametrem
		pkt1.steiner(5);	//obliczenie nowego momentu bezw³adnoœci
		pkt2.steiner(5);
		pkt1.opis();	//wyœwietlenie opisu pkt. materialnego
		pkt2.opis();
		pkt1.setMasa(2);	//ustawienie nowej masy
		pkt1.opis();
		PktMat[] tablica = new PktMat[5];	//utworzenie tablicy obiektów
		for (int i=0; i<5; i++){
			PktMat pkt = new PktMat(i+1);	//utworzenie punktów dla tablicy obiektów
			tablica[i] = pkt;				//przypisanie punktów do tablicy
		}
		for(PktMat punkt : tablica){	//wyœwietlenie opisu dla pkt. z tablicy obiektów
			punkt.steiner(5);
			punkt.opis(); 
		}

	}
}

