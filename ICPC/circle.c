#include <stdio.h>

int main(){

    double r;
    scanf("%lf",&r);
    double res=0,res2=0,res3=0;

    res=r*4;  //radio 
    res2+=(1.8637*r); //valor de otro radio a la mitad
    res3=res+res2; 
    printf("%.5f\n",res3*res3);

    return 0;
}