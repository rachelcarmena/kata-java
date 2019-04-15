package mastercrupt;

import ui.ApplicationInterface;
import ui.UI;

public class Application implements ApplicationInterface {
    @Override
    public void leet(String string, UI ui) {
        ui.setLeeted(Leeter.leet(string));
    }
    public static void main(String[] args) {
        UI ui = new UI(new Application());
        System.out.println(ui.leetMessage(args[0]));
    }
}