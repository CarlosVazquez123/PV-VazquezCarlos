package ar.edu.unju.fi.ejercicio11;

public class Main {

	public static void main(String[] args) {
		 	int i;
	        int j;
	        int suma=80;
	        
	        for(i=2,j=40;j>0;j--)
	        {
	        	i++;
	        System.out.print(suma+" ");
	        suma+=(j-i);
	        //80+37+35+33+31+29+27+25+23+21+19+17+15+13+11+9+7+5+3+1
	        //-1-3-5-7-9-11-13-15-17-19-21-23-25-27-29-31-33-35-37-39
	        }
	}
}