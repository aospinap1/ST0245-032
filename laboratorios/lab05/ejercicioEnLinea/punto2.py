import networkx as nx
G = nx.Graph()
class Punto2:
    def agragarNodos():
        teclado = input
        while teclado != "Fin":
            G.add_node (teclado)

   def agragarCaminos():
        teclado = input
        while teclado != "Fin":
            G.add_edge (teclado)

    def recorrerGrafo():
        for i in G: 
            for j = i + 1 in G:
                if G [i] == G [2]:
                    return False
        return True
            
