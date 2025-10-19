/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author emman
 */

/*
Representa una única elección disponible dentro de una decisión.
Contiene tanto el texto de la opción como las consecuencias que acarrea.
 */
public class Option {
    private final String optionText;
    private final String consequenceText; // El texto que se muestra después de elegir
    private final int impactoTiempo;
    private final int impactoCosto;
    private final int impactoCalidad;
    private final int impactoMotivacion; //La idea es que cada opcion tenga una consecuencia sobre las 4 variables

    public Option(String optionText, String consequenceText, int impactoTiempo, int impactoCosto, int impactoCalidad, int impactoMotivacion) {
        this.optionText = optionText;
        this.consequenceText = consequenceText;
        this.impactoTiempo = impactoTiempo;
        this.impactoCosto = impactoCosto;
        this.impactoCalidad = impactoCalidad;
        this.impactoMotivacion = impactoMotivacion;
    }

    /*
     Le "ordena" al proyecto que aplique las consecuencias de esta opción.
     @param project El estado del proyecto que será modificado.
     */
    public void aplicar(Project project) {
        project.aplicarImpacto(this.impactoTiempo, this.impactoCosto, this.impactoCalidad, this.impactoMotivacion);
    }

    // --- Getters para que la Vista muestre la información ---
    public String getOptionText() { return optionText; }
    public String getConsequenceText() { return consequenceText; }
}
