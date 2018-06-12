package verwaltung;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java.nio.file.Paths;
import java.util.*;

public class DekanatManagement
{
	public static Map<String, Modul> modulMapping = new HashMap<>();
	public static List<Student> studenten;

	public static void main(String[] args) 
	{
		
		
		initModule();
		
		studenten=Arrays.asList(new Student[] {new Student(34545," Schmidt","Harold"),new Student(23566,"Djuikom","Bautrelle"),new Student(17459,"Mueller","Karine"),new Student(34581,"Raki","Ali"),new Student(23756,"Schoen","Thani"),new Student(17451,"Kunold","Elisa")});
		AusgabeStudentenListe(studenten);
		//test.ausgabeLeistungen(test.pruefungsLeistungen);
		//test.module=Arrays.asList(new Modul[] {new Modul(60),new Modul(30),new Modul(60),new Modul(30)});
		List<Leistung>leistungen=Arrays.asList(new Leistung[] {new Leistung(modulMapping.get("oop"),"Bienhaus",83.4),new Leistung(modulMapping.get("DM"),"Metz",98.3),new Leistung(modulMapping.get("Physik"),"Rinn",80.3), new Leistung(modulMapping.get("GDI"),"Herzberg",100.0)});
		//test.listStudenten.forEach(student -> student.addLeistungen(leistungen));//lambda expression
		for (Student student: studenten)
		{
			student.addLeistungen(leistungen);
		}	
	}
	
	public static void initModule()
	{
		Modul oop = new Modul("OOP", "Bienhaus", 20, 6);
		Modul dm = new Modul("DM", "Djuikom", 20, 6);
		Modul physik = new Modul("Physik", "Mueller", 20, 6);
		Modul gdi = new Modul("GDI", "Herzberg", 20, 6);
		addToMapping(oop, dm, physik, gdi);
	}
	
	public static void addToMapping(Modul modul)
	{
		modulMapping.put(modul.getModulname(), modul);
	}
	
	public static void addToMapping(Modul... module)
	{
		for (Modul modul : module)
		{
			addToMapping(modul);
		}
	}
	
	public static void AusgabeStudentenListe(List<Student> listStudenten)
	{
		CSV_Writer writer = new CSV_Writer("C:\\Users\\bautrelle fotso\\Desktop\\studentenliste.csv");		
		String liste = "";
		for (Student std : listStudenten)
		{
			liste+=std.toString()+"\n";
		}
		writer.append(liste);
	}
	
	public static void ausgabeLeistungen(Student student)
	{
		CSV_Writer writer = new CSV_Writer("C:\\Users\\bautrelle fotso\\Desktop\\"+student.getMatrNr()+".csv");
		
		String zeile="";
	
		for(Leistung leist : student.getLeistungen()) 
		{
			zeile=zeile+"\n"+leist.toString();
		}
		writer.append(student+zeile);
	}

	public void ausgabeDurchschnittProStudent(List<Student> studenten)
	{
		CSV_Writer writer = new CSV_Writer("durchschnittProStudent.csv");
		String erg="";
		double summe=0;
		int summecreditspunkte=0;
		String antwort="";
		int matrikel=0;
		writer.append("Matrikelnummer;Durchschnitt(%);Creditpunkte;Durchgefallen");
		
		for (Student stud : studenten) 
		{
			for (Leistung leistung : stud.getLeistungen())
			{
				summe+=leistung.getLeistung();
				summe=summe/4;
				summecreditspunkte+=leistung.getModul().getCredits();
				matrikel=stud.getMatrNr();
				if(summe<50)
				{
					antwort="nein";
				}
				else
				{
					antwort="ja";
				}
			}
			erg += matrikel+";"+summe+";"+summecreditspunkte+";"+antwort+"\n";
			summe = 0;
			summecreditspunkte = 0;
		}		
	}			
	
	public static void ausgabeDurchschnittProModul(List<Student> studenten)
	{
		CSV_Writer writer = new CSV_Writer("durschschnittProModul.csv");
		writer.append("Modul;Durchschnitt(%)");
		Map<String, List<Double>> modulMap = new HashMap<>();
		
		for (Student stud : studenten)
		{
			for(Leistung leist : stud.getLeistungen()) 
			{
				List<Double> leistungen = modulMap.get(leist.getModul().getModulname());
				if (leistungen != null)
					leistungen.add(leist.getLeistung());
				else
					modulMap.put(leist.getModul().getModulname(), Arrays.asList(leist.getLeistung()));
			}
		}
		
		for (String modul : modulMap.keySet())
		{
			List<Double> leistungen = modulMap.get(modul);
			double ds = 0;
			for (Double d : leistungen)
			{
				ds += d;
			}
			ds = ds / leistungen.size();		
			writer.append(modul + ";" + ds);
		}
	}
	
}
