package com.saucedemo.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class AgregarAlCarrito implements Task {

    private final String producto;

    public AgregarAlCarrito(String producto) {
        this.producto = producto;
    }

    public static AgregarAlCarrito llamado(String producto) {
        return Tasks.instrumented(AgregarAlCarrito.class, producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Target botonAgregar = Target.the("botón agregar al carrito")
                .locatedBy("//div[text()='{0}']/ancestor::div[@class='inventory_item']//button")
                .of(producto);

        actor.attemptsTo(Click.on(botonAgregar));
    }
}
