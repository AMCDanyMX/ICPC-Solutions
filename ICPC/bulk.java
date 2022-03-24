import java.io.*;
public class bulk{
    public static void main(String args[]) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
        String linea = in.readLine();
        String elems[]=linea.split(" ");
        int elementos = Integer.parseInt(elems[0]);
        int precio = Integer.parseInt(elems[1]);
        int neto = elementos*precio;
        int descontado = (elementos*2)-2;
        int total = neto-descontado;
        System.out.println(total);
    }
}
