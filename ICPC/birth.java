import java.io.*;
public class birth {
  public static void main(String[] args) throws IOException {
    try{
      String [] fechas = new String [50];
      int [][] matriz = new int [13][32];
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
      String n = in.readLine();
      int numFechas = Integer.parseInt(n);
      for(int i=0;i<numFechas;i++){
        fechas[i]=in.readLine();
      }
      for(int i=0;i<13;i++){
        for(int j=0;j<32;j++){
           matriz[i][j]=0;
        }
      }
      for(int j=0;j<numFechas;j++){
        String fecha = fechas[j];
        char m1=fecha.charAt(0);
        char m2=fecha.charAt(1);
        String m=m1+""+m2;
        char d1=fecha.charAt(3);
        char d2=fecha.charAt(4);
        String d=d1+""+d2;
        int mes = Integer.parseInt(m);
        int dia = Integer.parseInt(d);
        matriz[mes][dia]=1;
      }
      int contador = 0;
      for(int i=0;i<13;i++){
        for(int j=0;j<32;j++){
          if(matriz[i][j]==1){
            contador++;
          }
        }
      }
      System.out.println(contador);
    }
    catch(IOException e){
    e.printStackTrace();
    }
  }
}