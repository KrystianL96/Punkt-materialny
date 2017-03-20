public class PktMat {
private double m;
private double d;
public PktMat() { //konstruktor domy�lny
	this.m = 10;
}
public PktMat(double masa )	{ //konstruktor z parametrem
	this.m = masa;
}
public double zmianaMasy(double a) { //akcesor kontroli warto�ci
	this.m=a;
	return this.m;
}
public void opis() { //podanie informacji o punkcie materialnym
	System.out.println("Punkt materialny");
	System.out.format("Masa: %f%n",m);
	System.out.format("G�owny moment bezw�adno�ci: %f%n",moment());
	System.out.format("Moment bezw�adno�ci wzgl�dem zmienionej osi: %f%n",steiner(d));
}
public double moment () { //obliczenie g��wnego momentu bezw�adno�ci = 0
	return 0;
}
public double steiner(double od) { //obliczenie momentu bezw�adno�ci wzgl�dem zmienionej osi
	this.d = od;
	return moment() + m*d*d;
}
}
