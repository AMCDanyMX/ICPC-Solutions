#include<stdio.h>


int main(){

    int a,b,c, descuento,descuento2;
    int suma=0, paquete1= 0;
    scanf("%d %d %d", &a,&b,&c);
    paquete1 = a+b;
    suma = paquete1 + c;

    if(suma<500){
        printf("%d",suma);
    }

    else if(paquete1>=500){
        if(c>=500){
            descuento = paquete1-100;
            descuento2 = c-100;
            suma = descuento+descuento2;
            printf("%d", suma);
        }
    }

    else if(suma>500){
        descuento =suma-100;
        printf("%d",descuento);
    }

    return 0;
}