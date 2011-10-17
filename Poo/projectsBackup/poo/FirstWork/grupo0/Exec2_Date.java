package grupo0;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class Exec2_Date {
	
	private Calendar currentDate= Calendar.getInstance(Locale.ROOT);

	
	
	public Exec2_Date (int year, int month, int day){
		this.currentDate.set(Calendar.HOUR,0);
		this.currentDate.set(Calendar.MINUTE,0);
		this.currentDate.set(Calendar.SECOND,0);
		
		
		this.currentDate.set(year, month, day);
		
	}
	
	public Exec2_Date (String str) throws ParseException{
	
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("String Data actual"+str);
		Date myDate = df.parse(str);
		System.out.println("String mydate:"+myDate.toString());
		
		this.currentDate.setTime(myDate);
		
	}
	public Exec2_Date (){
		this.currentDate.set(Calendar.HOUR_OF_DAY,0);
		this.currentDate.set(Calendar.MINUTE,0);
		this.currentDate.set(Calendar.SECOND,0);
		this.currentDate.set(Calendar.MILLISECOND,0);
		
	}
	
	public int compareTo (Exec2_Date d) {
	
		int result;
		
		if (this.currentDate.getTimeInMillis() == d.currentDate.getTimeInMillis())
			result = 0;
		else result = (this.currentDate.getTimeInMillis() > d.currentDate.getTimeInMillis()) ? 1 : -1;
		
		System.out.println("actualDate: "+this.currentDate.getTime());
		System.out.println("stringDate: "+d.currentDate.getTime());
		return result;
	}
	
	public boolean equals (Exec2_Date d){
		
		return (this.currentDate.getTime()).equals(d.currentDate.getTime());
	}
	
	public String toString (){
		
		return this.currentDate.get(Calendar.YEAR)+"-"+(this.currentDate.get(Calendar.MONTH)+1)+"-"+this.currentDate.get(Calendar.DAY_OF_MONTH);
	}
	
	public int hashCode (){
		
		return ( this.currentDate.get(Calendar.YEAR)+(this.currentDate.get(Calendar.MONTH)+1)+this.currentDate.get(Calendar.DAY_OF_MONTH));
	}
	
	public static void main(String[] args) throws ParseException{
		
		Exec2_Date emptyDate = new Exec2_Date();
		Exec2_Date stringDate = new Exec2_Date("2011-10-16");
		
		System.out.println("String Date:");
		System.out.println(stringDate.toString()+" | HashCode: "+stringDate.hashCode());
		System.out.println("Empty Data:");
		System.out.println(emptyDate.toString()+" | HashCode: "+emptyDate.hashCode());
		
		System.out.println("Empty comparison: "+emptyDate.compareTo(stringDate));
		System.out.println("");
		System.out.println("Equals to-->: "+ emptyDate.equals(stringDate));
		
		
		
		
	}

}
