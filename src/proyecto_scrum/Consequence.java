/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_scrum;

/**
 *
 * @author emman
 */
public class Consequence {
    double timeImpact;
    double costImpact;
    double qualityImpact;
    double motivationImpact;

    public Consequence(double timeImpact, double costImpact, double qualityImpact, double motivationImpact) {
        this.timeImpact = timeImpact;
        this.costImpact = costImpact;
        this.qualityImpact = qualityImpact;
        this.motivationImpact = motivationImpact;
    }
}
