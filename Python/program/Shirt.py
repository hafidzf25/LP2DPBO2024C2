# Import Class Induk
from Clothing import Clothing

# Deklarasi Class

class Shirt(Clothing):

    # Privat (__), Protected (_), Public Atributes
    __color = ""
    __sleevetype = ""

    # Konstruktor
    def __init__(self, color = "", sleevetype = ""):
        self.__color = color
        self.__sleevetype = sleevetype

    # Getter dan Setter
        
    # Get color
    def get_color(self):
        return self.__color
    
    # Set color
    def set_color(self, color):
        self.__color = color

    # Get sleevetype
    def get_sleevetype(self):
        return self.__sleevetype
    
    # Set sleevetype
    def set_sleevetype(self, sleevetype):
        self.__sleevetype = sleevetype
