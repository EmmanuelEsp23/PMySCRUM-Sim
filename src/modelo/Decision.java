/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author emman
 */
import java.util.ArrayList;
import java.util.List;

/*
  Representa un evento o momento en la simulación donde el usuario debe
  tomar una decisión. Contiene el escenario y una lista de opciones disponibles.
 */
public class Decision {

    private final String title;
    private final String scenarioDescription;
    private final List<Option> options;

    public Decision(String title, String scenarioDescription) {
        this.title = title;
        this.scenarioDescription = scenarioDescription;
        this.options = new ArrayList<>();
    }

    /*
     Añade una opción posible a esta decisión.
     */
    public void addOption(Option option) {
        this.options.add(option);
    }

    // --- Getters para que la Vista muestre la decisión ---
    public String getTitle() {
        return title;
    }

    public String getScenarioDescription() {
        return scenarioDescription;
    }

    public List<Option> getOptions() {
        return options;
    }
}
