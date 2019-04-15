package strangereons;

import ui.ApplicationInterface;

public class StrangerEonsApplication implements ApplicationInterface {
    @Override
    public String leet(String string) {
        return string.replace('S', '5');
    }
}
