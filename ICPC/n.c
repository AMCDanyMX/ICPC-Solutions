int main()
{
  int frecuencia[5] = { 0 };
  int i, numero;
  srand(time(NULL));
 
/* Proceso numeros */
   for(i = 0; i < 10; i++){
  numero = rand() % 5;
  frecuencia[numero]++;       /*   Esta linea es la que no entiendo, Gracias!*/
    }
/* Muestro resultado */
   for(i = 0; i < 5; i++){
   printf("%d salio %d veces\n", i, frecuencia[i]);
    }
   return 0;
}