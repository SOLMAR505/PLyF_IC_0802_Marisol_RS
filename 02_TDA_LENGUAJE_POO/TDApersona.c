#include<stdio.h>

struct Persona {                                                                                                                                                                                  
                                                                                                                                                                                                  
        char nombre[20];                                                                                                                                                                          
        char apellidos[25];                                                                                                                                                                      
        char genero[1];
        int edad;                                                                                                                                                                                 
    };                                                                                                                                                                                            
 
void Datos( struct Persona p ) {

    printf( "\n\tNombre: %s\n", p.nombre );
    printf( "\tApellidos: %s\n", p.apellidos);
    printf( "\tEdad: %d\n", p.edad );
    printf( "\tGenero: %s\n", p.genero );
}

	void Comer( struct Persona p ) { 
		printf( "\n%s %s come golosinas", p.nombre, p.apellidos );                                                                                                                              
	}                                                                                                                                                                                                                                                                                                                                                                                              
	void Caminar( struct Persona p ) {                                                                                                                                                                                               
    printf( "\nCamina todos los dias");                                                                                                                            
	}                                                                                                                                                                                                 
	void Hablar( struct Persona p ) {      
		printf( "\nHabla con sus amigos");                                                                                                                                                 
	}                                                                                                                                                                                                                     
	void Dormir( struct Persona p ) {                                                                                                                                                                 
        printf( "\n Y Duerme 8 horas diarias\n");                                                                                                                                                   
		}  

int main( int argc, char* argv[] ) {
    
    struct Persona p0;

    printf( "Ingresa tu nombre: " );
    scanf( "%[^\n]%*c", p0.nombre );
    printf( "Ingresa tus apellidos: " );
    scanf( "%[^\n]%*c", p0.apellidos );
    printf( "Ingresa tu genero [M/F]: " );
    scanf( "%[^\n]%*c", p0.genero );
    printf( "Ingresa tu edad: " );
    scanf( "%d", &p0.edad );
    
    Datos( p0 );
    Comer( p0 );
    Caminar( p0 );
    Hablar( p0 );
    Dormir( p0 );

    return 0;
}



