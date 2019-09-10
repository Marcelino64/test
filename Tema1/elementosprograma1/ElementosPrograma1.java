package elementosprograma1;

import temperatura.*;

public class ElementosPrograma1 {
	public static void main(String[] args) {
		int a = 1;
		short b, c = 3;
		int d = 30;
		long l = 45900;
		long x = 5L;
		char letra = 'c';
		char letra2 = 99;
		float pi = 3.14f ;
		float pi2 = 3.14F;
		float medio = 1/2F;
		double millon = 1e10;
		double medio1 = 4.56667777d;
		String y ="35";
		double tc,tf;


		

		System.out.println("el valor de pi es:" + pi);
		// intercambio de dos variables en java con xor
		
		a = (byte)((short)a ^ c);
		c = (short)((byte)a ^ c);
		a = (byte)((short)a ^ c);

		 System.out.println ("la variable a: " + a); 
		 System.out.println ("la variable c: " + c); 

		 Temperatura.celciusAFarenheit(15);
		 Temperatura.farenheitACelcius(40);

		 tf = Temperatura.celciusAFarenheit(15);
		 tc = Temperatura.farenheitACelcius(40);

		





	}
}