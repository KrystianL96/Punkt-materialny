public class PktMat { //klasa reprezentuj�ca pkt. materialny
private double m;
private double d;
public PktMat() { //konstruktor domy�lny
	this.m = 10;
}
public PktMat(double masa )	{ //konstruktor z parametrem
	this.m = masa;
}
public void setMasa(double a) { //akcesor typu set
	this.m=a;
}
public double getMasa() { //akcesor typu get
	return m;
}
public void opis() { //podanie informacji o punkcie materialnym
	System.out.println("Punkt materialny");
	System.out.format("Masa: %f%n",m);
	System.out.format("G��wny moment bezw�adno�ci: %f%n",moment());
	System.out.format("Moment bezw�adno�ci wzgl�dem zmienionej osi: %f\n\n",steiner(d));
}
public double moment () { //obliczenie g��wnego momentu bezw�adno�ci = 0
	return 0;
}
public double steiner(double od) { //obliczenie momentu bezw�adno�ci wzgl�dem zmienionej osi
	this.d = od;
	return moment() + m*d*d;
}
}
