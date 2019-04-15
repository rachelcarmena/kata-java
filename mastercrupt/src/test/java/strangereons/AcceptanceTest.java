package strangereons;

import org.junit.jupiter.api.Test;
import ui.UI;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class AcceptanceTest {
    @Test
    public void testLeeting() {
        UI ui = new UI(new StrangerEonsApplication());
        assertEquals("Leeted: 5ecret", ui.leetMessage("Secret"));
    }
}
