package com.saucedemo.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoPage {
    public static final Target CARRITO = Target.the("icono del carrito")
            .locatedBy(".shopping_cart_link");

    public static final Target PRODUCTO_EN_CARRITO = Target.the("producto en carrito")
            .locatedBy("//div[@class='inventory_item_name' and text()='{0}']");
}
