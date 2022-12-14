package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.Color;
import usantatecla.utils.Console;

public class ColorView {
    
    private static final char[] INITIALS = {'r', 'b', 'y', 'g', 'o', 'p'};

    private Color color;

    ColorView(Color color) {
        this.color = color;
    }

    public static String allInitials() {
        String result = "";
        for(char character: ColorView.INITIALS) {
            result += character;
        }
        return result;
    }

    static Color getInstance(char character) {
        for (int i = 0; i < ColorView.INITIALS.length; i++) {
            if (ColorView.INITIALS[i] == character) {
                return Color.values()[i];
            }
        }
        return null;
    }
    
    void write() {
        Console console = Console.instance();
        console.write(ColorView.INITIALS[this.color.ordinal()]);
    }
}
