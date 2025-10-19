/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_scrum;

/**
 *
 * @author emman
 */
public class Option {
    String description;
    String feedback;
    Consequence consequence;

    public Option(String description, String feedback, Consequence consequence) {
        this.description = description;
        this.feedback = feedback;
        this.consequence = consequence;
    }
    
    public Consequence getConsequence() {
        return this.consequence;
    }

    public String getFeedback() {
        return this.feedback;
    }
}
