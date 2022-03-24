import java.io.*;
public class G{
	public static void main (String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
        String c = in.readLine();
        int casos = Integer.parseInt(c);
        int []cajas = new int [casos];
        for(int i = 0; i < casos; i++){
        	String ca = in.readLine();
        	int caja = Integer.parseInt(ca);
        	cajas[i]=caja;
        }
        int masMaximo = 100;
        int apuesta = 100;
        for(int i = 0; i < casos; i++){
        	apuesta+=cajas[i];
 			if(apuesta>masMaximo){
 				masMaximo=apuesta;
 			}
        }
        System.out.println(masMaximo);
	}
}