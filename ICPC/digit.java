import java.io.*;
public class digit {
  public static void main(String[] args) throws IOException {
    try{
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
      String linea = in.readLine();
      String elems[]=linea.split(" ");
      String  v1 = elems[0];
      String  v2 = elems[1];
      String  v3 = elems[2];
      int limiteInf =Integer.parseInt(v1);
      int limiteSup =Integer.parseInt(v2);
      int buscado =Integer.parseInt(v3);
      int contador = 0;
      for(int i=limiteInf;i<=limiteSup;i++){
        String numero= i+"";
        for(int j=0;j<4;j++){
          char ch=numero.charAt(j);
          String str=ch+"";
          int token = Integer.parseInt(str);
          if(token==buscado){
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
