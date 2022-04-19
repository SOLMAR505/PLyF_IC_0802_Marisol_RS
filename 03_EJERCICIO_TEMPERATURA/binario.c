#include <stdio.h>
#include<stdint.h>
#include<math.h>

int main() {
int i,m,nume,posicion,base,resultado,deci;
float total;
float b7,b6,b5,b4,decimal;

printf("\n Ingrese numero binario: ");
scanf("%d",&nume);
base=1;
resultado=0;

while(nume>0){
	posicion=0;
	posicion=base*(nume%10);
	resultado+=posicion;
	base*=2;
	nume/=10;
}
printf("Numero entero es: %d",resultado);

printf("\n Ingrese segundo valor: ");
scanf("%d",&nume);
m=-4;
      while(nume!=0){
        deci=nume%10;
        nume=nume/10;
        m++;
          if(m==1){  
          b7=deci*0.0625;
          }
          else if(m==2){ 
          b6=deci*0.125;
          }
          else if(m==3){  
          b5=deci*0.25;
          }
          else if(m==4){
          b4=deci*0.5;
          }
    }
    decimal=b7+b6+b5+b4;
    printf( "Valor decimal = %f\n", decimal );
    total=resultado+decimal;
    printf("\n  TEMPERATURA: %f\n",total);
return 0;
}

