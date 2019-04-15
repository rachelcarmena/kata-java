package ui;

public class UI {
    private ApplicationInterface application;

    public UI(ApplicationInterface application) {
        this.application = application;
    }

    public String leetMessage(String unLeeted) {
        return "Leeted: " + application.leet(unLeeted);
    }
}