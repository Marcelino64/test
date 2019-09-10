package temperatura;

public class Temperatura{

	    public static void main(String[] args) {
	       System.out.println("90 grados celsius son " + celciusAFarenheit(90));
	       System.out.println("192 grados farenheit son " + farenheitACelcius(194));	
	    }
	    public static double farenheitACelcius(double tmp){
	    	
	    	return ((tmp - 32)/1.8);

	    }
	    public static double celciusAFarenheit(double tmp){
	    	return (tmp * 1.8) + 32;

	    }




}