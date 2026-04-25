package com.saucedemo.stepdefinitions;

import com.saucedemo.screenplay.tasks.AgregarAlCarrito;
import com.saucedemo.screenplay.ui.CarritoPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CarritoStepDefinitions {

    @And("she adds the product {string} to the cart")
    public void sheAddsTheProductToTheCart(String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarAlCarrito.llamado(producto)
        );
    }

    @And("she navigates to the cart page")
    public void sheNavigatesToTheCartPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(CarritoPage.CARRITO)
        );
    }

    @Then("she should see the product {string} in the cart")
    public void sheShouldSeeTheProductInTheCart(String producto) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(CarritoPage.PRODUCTO_EN_CARRITO.of(producto), isVisible())
        );
    }
}
