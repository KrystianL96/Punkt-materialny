public class PktMat {
private double m;
private double d;
public PktMat() { //konstruktor domyślny
	this.m = 10;
}
public PktMat(double masa )	{ //konstruktor z parametrem
	this.m = masa;
}
public double zmianaMasy(double a) { //akcesor kontroli wartości
	this.m=a;
	return this.m;
}
public void opis() { //podanie informacji o punkcie materialnym
	System.out.println("Punkt materialny");
	System.out.format("Masa: %f%n",m);
	System.out.format("Głowny moment bezwładności: %f%n",moment());
	System.out.format("Moment bezwładności względem zmienionej osi: %f%n",steiner(d));
}
public double moment () { //obliczenie głównego momentu bezwładności = 0
	return 0;
}
public double steiner(double od) { //obliczenie momentu bezwładności względem zmienionej osi
	this.d = od;
	return moment() + m*d*d;
}
}
