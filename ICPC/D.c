#include <stdio.h>

int main(){
  int array[100], n, c, d, cambia;

  scanf("%d", &n); 





  for (c = 0; c < n; c++)
    scanf("%d", &array[c]);

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


    printf("%d",contador);
  return 0;
}