#include <stdio.h>

typedef enum{
	goNorte=0,
	waitNorte=1,
	goEste=2,
	waitEste=3,
	detenido=4
}estados;

typedef enum{
	no_carros=00,
	carros_este=01,
	carros_norte=10,
	ambos_lados=11
}accion;

int main(){
	estados estado = goEste; 
	int evento = 0;
	int pila = 8;
	int acciones[8] ={00, 01, 10, 11, 11, 10, 01,00};

	for( int i = 0; i < pila; i++ ) {
	switch(acciones [i]){
		case no_carros:
			if (estado==detenido){
				estado=goNorte;
				printf("llendo a norte\n");
				printf("estado en el que te encuentras: %i",estado);
			}
			else if(estado==goNorte){
				estado=goEste;
				printf("\tllendo al este\n");
				printf("estado en el que te encuentras: %i",estado);
			}else if(estado==waitNorte){
				estado=goEste;
				printf("\tllendo al este\n");
				printf("estado en el que te encuentras: %i",estado);
			}else if(estado==goEste){
				estado=goEste;
				printf(" \tllendo al este\n");
				printf("estado en el que te encuentras: %i",estado);
			}else if(estado==waitEste){
				estado=goNorte;
				printf("\tllendo al norte\n");
				printf("estado en el que te encuentras: %i",estado);
			}break;
		case carros_este:
			if (estado==goNorte){
				estado=waitNorte;
				printf("\tesperando en norte\n");
				printf("estado en el que te encuentras: %i",estado);
			}else if(estado==waitNorte){
				estado=goEste;
				printf("\tllendo al este\n");
				printf("estado en el que te encuentras: %i",estado);
				break;
			}else if(estado==goEste){
				estado=goEste;
				printf(" \tllendo al este\n");
				printf("estado en el que te encuentras: %i",estado);
				break;
			}else if(estado==waitEste){
				estado=goNorte;
				printf("\tllendo a norte\n");
				printf("estado en el que te encuentras: %i",estado);
				break;
			}break;
		case carros_norte:
			if (estado==goNorte){
				estado=goNorte;
				printf("\tllendo a norte\n");
				printf("estado en el que te encuentras: %i",estado);
				break;
			}else if(estado==waitNorte){
				estado=goEste;
				printf("\tllendo a este\n");
				printf("estado en el que te encuentras: %i",estado);
				break;
			}else if(estado==goEste){
				estado=waitEste;
				printf("\t esperando en este\n");
				printf("estado en el que te encuentras: %i",estado);
				break;
			}else if(estado==waitEste){
				estado=goNorte;
				printf("\tllendo a norte\n");
				printf("estado en el que te encuentras: %i",estado);
				break;
			}break;
		case ambos_lados:
			if (estado==goNorte){
				estado=waitNorte;
				printf("\tesperando en norte\n");
				printf("\nestado en el que te encuentras: %i",estado);
				break;
			}else if(estado==waitNorte){
				estado=goEste;
				printf("llendo a este\n");
				printf("estado en el que te encuentras: %i",estado);
				break;
			}else if(estado==goEste){
				estado=waitEste;
				printf(" \tesperando en este\n");
				printf("estado en el que te encuentras: %i",estado);
				break;
			}else if(estado==waitEste){
				estado=goNorte;
				printf("\tllendo a norte\n");
				printf("estado en el que te encuentras: %i",estado);
				break;
			}break;
		default:
			printf("SALIR");
			break;		
			
	}
}
return 0;
}

