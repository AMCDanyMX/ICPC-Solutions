#include <stdio.h>


int main(){
    double PI = 3.14159265358979323846;
    float r,a,l;
    scanf("%f",&r);
    l = (r*6);
    a = ((l*l)- (PI*(r*r)));

    printf("%.5f",a);



    return 0;
}
