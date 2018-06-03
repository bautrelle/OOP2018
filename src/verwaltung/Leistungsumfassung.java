package verwaltung;

public class Leistungsumfassung {
	public String modul;
	public String pr�fer;
	public double ergebnis;

public Leistungsumfassung(String modul,String pr�fer,double ergebnis) {
	this.modul=modul;
	this.pr�fer=pr�fer;
	this.ergebnis=ergebnis;
	}
public String getModul( ) {
	return this.modul;
}
public String getPruefer() {
	return this.pr�fer;
}
public double getLeistung() {
	return this.ergebnis;
}
public void setLeistung(double ergebnis) {
	this.ergebnis=ergebnis;
}
public String leistungToString(String printLeistung) {
	printLeistung="Der Modul lautet: "+this.modul+
			"und wird von Herrn "+this.pr�fer+" gepr�ft "+
			"Leistung: "+this.ergebnis+"%";
	return printLeistung;
}
}
