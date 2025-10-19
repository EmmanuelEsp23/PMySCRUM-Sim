package helpers;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.io.InputStream;

public class FontManager {

    public static Font loadFont(String fontName) {

        try {
            String fontPath = "/fonts/" + fontName;

            InputStream is = FontManager.class.getResourceAsStream(fontPath);

            if (is == null) {
                throw new IOException("No se pudo encontrar el archivo de la fuente en: " + fontPath);
            }

            Font customFont = Font.createFont(Font.TRUETYPE_FONT, is);

            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);

            return customFont;

        } catch (IOException | FontFormatException e) {
            System.err.println("Error al cargar la fuente: " + fontName);
            e.printStackTrace();
            return new Font("Arial", Font.PLAIN, 14);
        }
    }
}