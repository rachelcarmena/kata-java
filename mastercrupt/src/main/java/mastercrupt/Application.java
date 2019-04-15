package mastercrupt;

import ui.ApplicationInterface;

public class Application implements ApplicationInterface {

    @Override
    public String leet(String string) {
        return string.replace('e', '3');
    }

//    public static void main(String[] args) {
//        UI ui = new UI(new Application());
//        System.out.println(ui.leetMessage(args[0]));
//    }
}