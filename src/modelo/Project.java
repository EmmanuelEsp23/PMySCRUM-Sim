/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author emman
 */

//Representa el estado actual y centralizado del proyecto que se está simulando. Es el "panel de control" de la simulación.

public class Project { //Variables de impacto marcadas en la tarea de Jira, se hacen privadas para evitar su modificación externa, asegurando su acceso por rutinas getters
    private int tiempo;
    private int costo;
    private int calidad;
    private int motivacion;

    public Project() { //Valores iniciales de las variables de impacto, por logica las inicializamos en 100 (valor max)
        this.tiempo = 100;
        this.costo = 100;
        this.calidad = 100;
        this.motivacion = 100;
    }

    //Rutina para modificar las variables de impacto, esto suma la variable de la derecha con la de la izquierda
    public void aplicarImpacto(int deltaTiempo, int deltaCosto, int deltaCalidad, int deltaMotivacion) {
        this.tiempo += deltaTiempo;
        this.costo += deltaCosto;
        this.calidad += deltaCalidad;
        this.motivacion += deltaMotivacion;

        /* Aseguramos que los valores se mantengan en un rango lógico 
        (de 0 a 100 tipicamente en valores cuantificados de manera independiente como la calidad o motivacion)
        (valores reales para variables establecidas como el tiempo y costo, ya que la idea es no tener deuda y no hay tiempo negativo)
        */
        this.calidad = Math.max(0, Math.min(100, this.calidad)); //Se asignan los rangos minimo y maximo a la variable
        this.motivacion = Math.max(0, Math.min(100, this.motivacion));
        this.tiempo = Math.max(0, this.tiempo); // El tiempo no puede ser negativo
        this.costo = Math.max(0, this.costo);   // El costo no puede ser negativo
    }

    /*
    Comprueba si el proyecto ha entrado en un estado de fracaso. El estado de fracaso lo definimos como puntos valle del projecto, es decir, 
    puntos bajos como el fin de tiempo con actividades aun por realizar, termino de presupuesto o una calidad baja
     @return true si el proyecto ha fracasado, false en caso contrario.
    */
    public boolean isFailed() {
        return tiempo <= 0 || costo <= 0 || calidad <= 40; // Condiciones de fracaso personalizables
    }

    // --- Métodos Getters para que la Vista pueda leer el estado ---
    public int getTiempo() { return tiempo; }
    public int getCosto() { return costo; }
    public int getCalidad() { return calidad; }
    public int getMotivacion() { return motivacion; }
}
