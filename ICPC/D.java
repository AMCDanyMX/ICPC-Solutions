import java.io.*;

public class D{

  public static void main(String args[]) throws IOException{
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
  int c;
  int d; 
  int cambia;
  String ene = in.readLine();
  int n = Integer.parseInt(ene);
  String datos = in.readLine();
  String elementos [] = datos.split(" ");
  int array[] = new int[elementos.length];

    for (c = 0; c < n; c++){
      array[c]=Integer.parseInt(elementos[c]);
    }

int contador =0;
  for (c = 0 ; c < n - 1; c++){
    for (d = 0 ; d < n - c - 1; d++){
      if (array[d] > array[d+1]){
        cambia      = array[d];
        array[d]   = array[d+1];
        array[d+1] = cambia;
         contador++;
      }
     
    }
  }


    System.out.println(contador);

  }
}
