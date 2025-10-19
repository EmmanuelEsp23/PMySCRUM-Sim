/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_scrum;

/**
 *
 * @author emman
 */
public class Decision {
       String scenario;
    List<Option> options;

    public Decision(String scenario) {
        this.scenario = scenario;
        this.options = new ArrayList<>();
    }

    public void addOption(Option option) {
        this.options.add(option);
    }
    
    public List<Option> getOptions() {
        return this.options;
    }

    public void display() {
        System.out.println(">>> DECISIÓN: " + scenario);
        for (int i = 0; i < options.size(); i++) {
            System.out.println("    " + (i + 1) + ". " + options.get(i).description);
        }
    }
}
