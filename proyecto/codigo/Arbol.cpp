#include <iostream>
#include <string>

using namespace std;
struct Nodo{
    int dato;
    Nodo *derecha;
    Nodo *izquierda;
};
//Prototipo de las funciones 
Nodo *crearNodo(int );
void insertarNodo(Nodo *&, int);

Nodo *arbol = NULL;

int main(){
    return 0;
}

/* Este metodo crea un nuevo Nodo */
Nodo *crearNodo(int n){
    Nodo *nodoNuevo = new Nodo();

    nodoNuevo-> dato = n;
    nodoNuevo-> derecha = NULL;
    nodoNuevo-> izquierda = NULL;

    return nodoNuevo;
} 
/* Este metodo inserta un nuevo Nodo en el arbol, si el arbol está vacio este lo asignará como raiz del arbol */
void insertarNodo(Nodo *&arbol, int n){
    if(arbol == NULL){
        Nodo *nodoNuevo = crearNodo(n);
        arbol = nodoNuevo;
    }
    else{
        int valorRaiz = arbol-> dato;
        if(n < valorRaiz){
            insertarNodo(arbol->izquierda, n);
        }
        if(n > valorRaiz){
            insertarNodo(arbol-> derecha, n);
        }
    }
}