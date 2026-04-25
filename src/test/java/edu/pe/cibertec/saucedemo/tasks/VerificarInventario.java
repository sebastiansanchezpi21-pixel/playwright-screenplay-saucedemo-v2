package com.saucedemo.screenplay.tasks;

import com.saucedemo.screenplay.ui.ProductosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarInventario {
    public static Question<Integer> cantidadDeProductos() {
        return actor -> ProductosPage.PRODUCTOS.resolveAllFor(actor).size();
    }
}
