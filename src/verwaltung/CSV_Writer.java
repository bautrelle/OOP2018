package verwaltung;

import java.nio.file.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSV_Writer
{
	//public String nameHomeVerzeichnis=System.getProperty("./Desktop");
	private String outputPath;
	public List<Student> listStudenten;
								
	public CSV_Writer(String outputPath) 
	{
		this.outputPath=outputPath;
	}
	
	public void setOutputPath(String outputPath)
	{
		this.outputPath = outputPath;
	}
	
	public String format(String toFormat)
	{
		return toFormat.replace(" ", ";");
	}
	
	public void append(String toAppend)
	{
		try(FileWriter fw = new FileWriter(outputPath, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter out = new PrintWriter(bw))
		{
		    out.append(toAppend);
		} catch (IOException e) 
		{
		    
		}
	}
	
	private Path getPath()
	{
		return Paths.get(outputPath);
	}
}





























