package verwaltung;

import java.util.ArrayList;
import java.util.List;
public class Student 
{
	private int matrNr;
	private String name;
	private String vorname;
	private List<Leistung> pruefungsLeistungen=new ArrayList<>();
	
	public Student(int matrNr,String name,String vorname)
	{
		this.matrNr=matrNr;
		this.name=name;
		this.vorname=vorname;
	}
	
	public Student(int matrNr)
	{
		this.matrNr=matrNr;
	}
	public Student(List<Leistung> pruefungsLeistungen)
	{
		this.pruefungsLeistungen=pruefungsLeistungen;
	}
	
	public int getMatrNr()
	{
		return matrNr;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getVorname()
	{
		return vorname;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setVorname(String vorname)
	{
		this.vorname=vorname;
	}
	
	public void addLeistung(Leistung leistung)
	{
		this.pruefungsLeistungen.add(leistung);
	}
	
	public void addLeistungen(List<Leistung> leistungen)
	{
		this.pruefungsLeistungen.addAll(leistungen);
	}
	
	public List<Leistung> getLeistungen()
	{
		return this.pruefungsLeistungen;
	}
	
	public String toString()
	{
		String printDaten="Name :"+name+
						  ";Vorname: "+vorname+
						  ";Matrikelnumer: "+matrNr;
		return printDaten;
	}
	
	//public int getLeistungsDurschschnitt()
	{
	//	double durchschnitt=0;
		
		//String[] stringArray  = stringArray[i];
		
	//	for (int i = 0; i < pruefungsLeistungen.size(); i++)
		{
				
	//		Leistung leist=pruefungsLeistungen.get(i);
			//durchschnitt += leist.getPunkte();
		}
		
		//for(Leistung leist:pruefungsLeistungen)
		{
			//durchschnitt += leist.getPunkte();
		}
	}
}



