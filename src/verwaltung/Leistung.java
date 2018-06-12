package verwaltung;

public class Leistung 
{
	private Modul modul;
	private String pruefer;
	private double ergebnisImProzent;
	
	
	public Leistung(Modul modul, String pruefer, double ergebnisImProzent )
	{
		this.modul=modul;
		this.ergebnisImProzent=ergebnisImProzent;
		this.pruefer=pruefer;
	}
	
	public Modul getModul()
	{
		return modul;
	}
	
	public String getPruefer()
	{
		return pruefer;
	}
	
	public double getLeistung()
	{
		return ergebnisImProzent;
	}
	
	public void setLeistung(double ergebnisImProzent)
	{
		this.ergebnisImProzent=ergebnisImProzent;
	}
	
	public String toString()
	{
		String printLeistungen="Modulname :"+modul.getModulname()+
							   ";Pruefer :"+pruefer+
							   ";Leistung :"+ergebnisImProzent+"%";
		return printLeistungen;
	}
}