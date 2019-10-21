import networkx as nx
G = nx.Graph()

class Node:

    def __init__(self, id, coordenadaX, coordenadaY, nombre, nextNode=None):
        self.id = id
        self.coordenadaX = coordenadaX
        self.coordenadaY = coordenadaY
        self.nombre = nombre
        self.nextNode = nextNode

    def getId(self):
        return self.id

    def setId(self, val):
        self.id = val

    def getCoordenadaX(self):
        return self.coordenadaX

    def setCoordenadaX(self, val):
        self.coordenadaX = val

    def getCoordenadaY(self):
        return self.coordenadaY

    def setCoordenadaY(self, val):
        self.coordenadaY = val

    def getNombre(self):
        return self.nombre

    def setNombre(self, val):
        self.nombre = val

    def getNextNode(self):
        return self.nextNode

    def setNoextNode(self, val):
        self.nextNode = val

class Edges:

    def __init__(self, id, id2, distancia, nombre):
        self.id = id
        self.id2 = id2
        self.distancia = distancia
        self.nombre = nombre

    def getId(self):
        return self.id

    def setId(self, val):
        self.id = val

    def getId2(self):
        return self.id2

    def setId2(self, val):
        self.id2 = val

    def getDistancia(self):
        return self.distancia

    def setDistancia(self, val):
        self.distancia = val

    def getNombre(self):
        return self.nombre

    def setNombre(self, val):
        self.nombre = val

class Grafos:

    teclado = input()

    while teclado != "Exit":
        G.add_node (Node(teclado, teclado, teclado, teclado))

    while teclado != "Exit":
        G.add_edge (Edges(teclado, teclado, teclado, teclado))
