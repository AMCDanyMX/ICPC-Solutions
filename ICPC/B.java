import java.io.*;
public class B{
        public static void main (String args[]) throws IOException{
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
                String b = in.readLine();
                int barcos = Integer.parseInt(b);
                int [][]matriz = new int [11][11];
                for(int i = 0; i<11; i++){
                        for(int j = 0; j<11; j++)
                                matriz[i][j] = 0;
                }
                boolean respuesta = true;
                for(int x = 0; x < barcos; x++){
        	       String barco = in.readLine();
        	       String []elems = barco.split(" ");
        	       int d= Integer.parseInt(elems[0]);
                       int l= Integer.parseInt(elems[1]);
                       int r= Integer.parseInt(elems[2]);
                       int c= Integer.parseInt(elems[3]);
                       if(d==0){
                                int campo = (c+l-1);
                                if(campo>10){
                                        campo = 10;
                                        respuesta = false;
                                }
                                for(int i=c; i<=campo; i++){
                                        if(matriz[r][i]==1){
                                                respuesta = false;
                                        }
                                        matriz[r][i] = 1;
                                }
                       }
                       else{
                                int campo = (r+l-1);
                                if(campo>10){
                                        campo = 10;
                                        respuesta = false;
                                }                                
                                for(int i=r; i<=campo; i++){
                                        if(matriz[i][c]==1){
                                                respuesta = false;
                                        }
                                        matriz[i][c] = 1;                                       
                                }
                       }//FIN ELSE       
	       }//FIN CICLO FOR INICIAL
               if(respuesta==true){
                System.out.println("Y");
               } 
               else{
                System.out.println("N");
               }    
        }//FIN MAIN
}//FIN CLASE
