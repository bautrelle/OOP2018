package verwaltung;

public class Auto {
/*instanzvariablen
 * 
 */
	public String farbe;
	public int marque;
	
	private int serienNummer;
	private int anzahlTueren;
	private int ps;
	
	/*Konstruktur
	 * 
	 */
	public Auto()//default Konstruktor
	{
		
	}
	/*Instanzmethoden
	 * 
	 */
	public void setPs(int ps)
	{
		this.ps=ps;
	}
	public int getPs()
	{
		return this.ps;
	}
	public void autoToString()
	{
		System.out.println("Farbe: "         +this.farbe+
						   "\nMarque: "      +this.marque+
						   "\nserienNummer: "+this.serienNummer+
						   "\nPs:           "+this.ps);
	}
}
