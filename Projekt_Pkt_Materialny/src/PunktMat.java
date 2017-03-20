
public class PunktMat extends PktMat{

	public static void main(String[] args) {
		PktMat pkt1 = new PktMat();
		PktMat pkt2 = new PktMat(20);
		pkt1.steiner(5);
		pkt2.steiner(5);
		pkt1.opis();
		pkt2.opis();
		pkt1.zmianaMasy(2);
		pkt1.opis();
		PktMat[] tablica = new PktMat[5];
		for (int i=0; i<5; i++){
			PktMat pkt = new PktMat(i+1);
			tablica[i] = pkt;
		}
		for(PktMat punkt : tablica){
			punkt.steiner(5);
			punkt.opis(); 
		}

	}
}

