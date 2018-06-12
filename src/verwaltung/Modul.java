package verwaltung;

public class Modul 
{
	public String modulname;
	public String dozent;
	public int sws;
	public int credits;

	public Modul(String modulname,String dozent, int sws,int credits)
	{
		this.modulname=modulname;
		this.dozent=dozent;
		this.sws=sws;
		this.credits=credits;
	}
	public Modul(int credits)
	{
		this.credits=credits;
	}
	
	public int getCredits()
	{
		return credits;
	}
	
	public int getSws() 
	{
		return sws;
	}
	
	public String getModulname() 
	{
		return modulname;
	}
	
	public String getDozent()
	{
		return dozent;
	}
	
	public void setCredits(int credits)
	{
		this.credits=credits;
	}
	
	public void setSws(int sws)
	{
		this.sws=sws;
	}
	
	public void setModulname(String modulname) 
	{
		this.modulname=modulname;
	}
	
	public void setDozent(String dozent)
	{
		this.dozent=dozent;
	}
	
	public String moduleToString()
	{
		String printText="Der Modulname lautet: "+this.modulname+
				" und wird von Herrn "+this.dozent+" unterrichtet. "+
				"\nDie Semestewochenstunden  betragen: "+this.sws+
				"\nCreditpunkte: "+this.credits;
		return printText;
	}


}