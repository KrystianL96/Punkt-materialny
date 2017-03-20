public class PktMat {
private double m;
private double d;
public PktMat() { //konstruktor domyœlny
	this.m = 10;
}
public PktMat(double masa )	{ //konstruktor z parametrem
	this.m = masa;
}
public double zmianaMasy(double a) { //akcesor kontroli wartoœci
	this.m=a;
	return this.m;
}
public void opis() { //podanie informacji o punkcie materialnym
	System.out.println("Punkt materialny");
	System.out.format("Masa: %f%n",m);
	System.out.format("G³owny moment bezw³adnoœci: %f%n",moment());
	System.out.format("Moment bezw³adnoœci wzglêdem zmienionej osi: %f%n",steiner(d));
}
public double moment () { //obliczenie g³ównego momentu bezw³adnoœci = 0
	return 0;
}
public double steiner(double od) { //obliczenie momentu bezw³adnoœci wzglêdem zmienionej osi
	this.d = od;
	return moment() + m*d*d;
}
}
