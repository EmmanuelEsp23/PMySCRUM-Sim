/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_scrum;

/**
 *
 * @author emman
 */
public class Project {
    
    String name;
    // Variables de impacto
    double time; // en días
    double cost; // en USD
    double quality; // en una escala de 0 a 100
    double motivation; // en una escala de 0 a 100

    public Project(String name, double initialTime, double initialCost, double initialQuality, double initialMotivation) {
        this.name = name;
        this.time = initialTime;
        this.cost = initialCost;
        this.quality = initialQuality;
        this.motivation = initialMotivation;
    }

    //
    public void applyConsequence(Consequence consequence) {
        this.time += consequence.timeImpact;
        this.cost += consequence.costImpact;
        this.quality += consequence.qualityImpact;
        this.motivation += consequence.motivationImpact;

        // Asegurarse de que calidad y motivación no se salgan del rango 0-100
        this.quality = Math.max(0, Math.min(100, this.quality));
        this.motivation = Math.max(0, Math.min(100, this.motivation));
    }

  
    public void printStatus() {
        System.out.println("\n--- Estado Actual del Proyecto: " + this.name + " ---");
        System.out.printf("Tiempo consumido: %.2f días\n", this.time);
        System.out.printf("Costo acumulado: $%.2f\n", this.cost);
        System.out.printf("Nivel de Calidad: %.2f / 100\n", this.quality);
        System.out.printf("Motivación del Equipo: %.2f / 100\n", this.motivation);
        System.out.println("-------------------------------------------\n");
    }

    // Getters para la evaluación final
    public double getQuality() { return quality; }
    public double getMotivation() { return motivation; }
}
