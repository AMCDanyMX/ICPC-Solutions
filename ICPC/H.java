import java.io.*;
public class H{
	public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
        String c = in.readLine();
        int casos = Integer.parseInt(c);
        for (int i=0; i<casos; i++){
        	String ca = in.readLine();
        	int casas = Integer.parseInt(ca);
        	String du = in.readLine();
        	String dul[] = du.split(" ");
        	int dulces[] = new int[casas];
        	int maximo = 0;
        	int maximo2 = 0;
        	int masMaximo = 0;
        	for (int j = 0; j<casas; j++){
        		dulces[j] = Integer.parseInt(dul[j]);
        	}
        	maximo = Math.max(sumatoria2(dulces,0,dulces.length),sumatoria2(dulces,1,dulces.length));
        	System.out.println(maximo);
        }

	}
	public static int sumatoria(int [] dulces, int pos,int longitud){
		if(pos>=longitud){
			return 0;
		}
		else{
			return dulces[pos]+sumatoria(dulces,pos+2,longitud);
		}
	}
	public static int sumatoria2(int [] dulces, int pos, int longitud){
		if(pos>=longitud){
			return 0;
		}
		else{
			return Math.max(dulces[pos]+sumatoria(dulces,pos+2,longitud),dulces[pos]+sumatoria(dulces,pos+3,longitud));
		}
	}
}