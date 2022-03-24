#include <stdio.h>
#include <string.h>

int main(){

    char letras [100];
    gets(letras);
    int cp, passwd;
    scanf("%d", &cp);

    while(cp--){





    
        for(int i =0; i<strlen(letras); i++){

           
            if(letras[i]>=97 && letras[i]<=122 &&letras[i]>=65 && letras[i]<=90){
                printf("Rejected");
            }



            if(letras[i]>='A' && letras[i]<='Z'){
                printf("%c",letras[i]);
            }
        }
        


    }

   
   

    return 0;
}