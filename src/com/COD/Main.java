package com.COD;


import LIBRERIAINOUT.FactoriaDeSalidas;
import LIBRERIAINOUT.InterfaceMetodosComunes;

public class Main {

    public static void main(String[] args) {
        InterfaceMetodosComunes unaConsola = FactoriaDeSalidas.getProducto(FactoriaDeSalidas.CONSOLA, "Hola");
        unaConsola.visualiza();

        InterfaceMetodosComunes unaVentana = FactoriaDeSalidas.getProducto(FactoriaDeSalidas.VENTANA,"Chao");
        unaVentana.visualiza();


    }
}