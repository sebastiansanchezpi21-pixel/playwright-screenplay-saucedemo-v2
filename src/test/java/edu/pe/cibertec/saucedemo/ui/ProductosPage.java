package com.saucedemo.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductosPage {
    public static final Target PRODUCTOS = Target.the("lista de productos")
            .locatedBy(".inventory_item");
}
