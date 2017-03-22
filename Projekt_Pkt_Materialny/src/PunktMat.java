
public class PunktMat extends PktMat{ //klasa testowa

	public static void main(String[] args) {
		PktMat pkt1 = new PktMat();	//tworzenie obiektu przez konstruktor domy�lny
		PktMat pkt2 = new PktMat(20);	//tworzenie obiektu przez konstruktor z parametrem
		pkt1.steiner(5);	//obliczenie nowego momentu bezw�adno�ci
		pkt2.steiner(5);
		pkt1.opis();	//wy�wietlenie opisu pkt. materialnego
		pkt2.opis();
		pkt1.setMasa(2);	//ustawienie nowej masy
		pkt1.opis();
		PktMat[] tablica = new PktMat[5];	//utworzenie tablicy obiekt�w
		for (int i=0; i<5; i++){
			PktMat pkt = new PktMat(i+1);	//utworzenie punkt�w dla tablicy obiekt�w
			tablica[i] = pkt;				//przypisanie punkt�w do tablicy
		}
		for(PktMat punkt : tablica){	//wy�wietlenie opisu dla pkt. z tablicy obiekt�w
			punkt.steiner(5);
			punkt.opis(); 
		}

	}
}

