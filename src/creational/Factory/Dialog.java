package creational.Factory;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    // creational.Factory Method
    protected abstract Button createButton();
}
