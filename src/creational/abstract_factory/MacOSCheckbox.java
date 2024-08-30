package creational.abstract_factory;

class MacOSCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering macOS checkbox");
    }
}