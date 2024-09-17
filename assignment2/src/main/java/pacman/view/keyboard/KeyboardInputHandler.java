package pacman.view.keyboard;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 * Responsible for handling keyboard input from player
 */
public class KeyboardInputHandler {


    public KeyboardInputHandler() {

    }

    public void handlePressed(KeyEvent keyEvent) {
        KeyCode keyCode = keyEvent.getCode();
        switch (keyCode) {
            case LEFT:
                break;
            case RIGHT:
                break;
            case DOWN:
                break;
            case UP:
                break;
        };
    }
}
