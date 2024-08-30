package creational.Factory;

class MacOSDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new MacOSButton();
    }
}
