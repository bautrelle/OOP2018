package verwaltung;

import java.util.ArrayList;
import java.util.List;

public class Studentverwaltung {

	public String vorname;
	public String nachname;
	public int matrNr;
	public List<Leistung> Prüfungsleistung;
	

public Studentverwaltung(String vorname,String nachname,int matrNr,String[]prüfungsLeistungen) {
		this.vorname=vorname;
		this.nachname=nachname;
		this.matrNr=matrNr;
		this.Prüfungsleistung=new ArrayList<>();
	}
	
	public int getMatnr(int matNum) {
		matNum=12345;
		return matNum;
	}
	public String getName(String vor,String nach) {
		String name=vor+nach;
		return name;
	}
	public String[] getLeistungen(String[]leist) {
		String[]list= {
				"OOP: "+1.0,
				"\nPhysik: "+1.1,
				"\nDiscrete Math: "+1.3,
				"\nRechnernetze: "+1.2,
				"GDI: "+1.4,
				};
		return list;
		}
	public void addLeistung() {
		//this.Prüfungsleistung.add(leistung);
	}
	public void setName(String nachname) {
		this.nachname=nachname;
	}
	public void setVorname(String vorname) {
		this.vorname=vorname;
	}
	public String namenToString(String printT) {
		printT="Der nachname des Students lautet: "+this.nachname+
				"Der Vorname lautet: "+this.vorname+
				"Sein Matrikelnummer ist: "+this.matrNr;
	return  printT;
	}


}
