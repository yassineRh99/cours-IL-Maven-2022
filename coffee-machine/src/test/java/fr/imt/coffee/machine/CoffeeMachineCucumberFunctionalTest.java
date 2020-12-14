package fr.imt.coffee.machine;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Ignore;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:functional/features/make_a_coffee.feature"}
)
//Permet d'ignorer les tests fonctionnels de Cucumber
//Ne lance pas la class CoffeeMachineFunctionalTest
@Ignore
public class CoffeeMachineCucumberFunctionalTest {

}
