package helpers;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.io.InputStream;


//Clase de utilidad para cargar y gestionar fuentes personalizadas desde los recursos del proyecto.

public class FontManager {
    /*
     Carga una fuente desde el paquete fonts.
     @param fontFileName El nombre del archivo de la fuente (ej. "PressStart2P.ttf").
     @return Un objeto Font listo para ser usado. Si falla, devuelve una fuente
     * por defecto (Arial).
     */
    public static Font loadFont(String fontFileName) {
        try {
            // Construimos la ruta al archivo. La '/' inicial es importante,
            // le dice a Java que busque desde la raíz de los "Source Packages".
            String fontPath = "/fonts/" + fontFileName;

            // Obtenemos el recurso como un flujo de datos (InputStream).
            // Es la forma más robusta de leer archivos internos de un proyecto.
            InputStream is = FontManager.class.getResourceAsStream(fontPath);

            // Verificamos si el archivo fue encontrado para evitar errores.
            if (is == null) {
                throw new IOException("No se pudo encontrar la fuente: " + fontPath);
            }

            // Creamos el objeto Font desde el flujo de datos.
            // Font.TRUETYPE_FONT especifica el formato de la fuente.
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, is);

            // Registramos la fuente en el entorno gráfico de Java.
            // Esto ayuda a que el renderizado de la fuente sea más eficiente.
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);

            return customFont;

        } 
        
        catch (IOException | FontFormatException e) {
            // Si ocurre cualquier error (archivo no encontrado, formato incorrecto),
            // lo notificamos en la consola y devolvemos una fuente segura.
            System.err.println("Error al cargar la fuente '" + fontFileName + "'. Usando fuente por defecto.");
            e.printStackTrace();
            return new Font("Arial", Font.PLAIN, 14); // Fuente de respaldo
        }
    }
}