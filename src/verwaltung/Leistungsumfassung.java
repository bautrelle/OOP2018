package verwaltung;

public class Leistungsumfassung {
	public String modul;
	public String prüfer;
	public double ergebnis;

public Leistungsumfassung(String modul,String prüfer,double ergebnis) {
	this.modul=modul;
	this.prüfer=prüfer;
	this.ergebnis=ergebnis;
	}
public String getModul( ) {
	return this.modul;
}
public String getPruefer() {
	return this.prüfer;
}
public double getLeistung() {
	return this.ergebnis;
}
public void setLeistung(double ergebnis) {
	this.ergebnis=ergebnis;
}
public String leistungToString(String printLeistung) {
	printLeistung="Der Modul lautet: "+this.modul+
			"und wird von Herrn "+this.prüfer+" geprüft "+
			"Leistung: "+this.ergebnis+"%";
	return printLeistung;
}
}
