package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Error;
import usantatecla.mastermind.views.console.ColorView;

public class ErrorView {
    public static final String[] MESSAGES = {
    "Repeated colors",
    "Wrong colors, they must be: " + ColorView.allInitials(), 
    "Wrong proposed combination length" };

    protected Error error;

    public ErrorView(Error error) {
        this.error = error;
    }
}
