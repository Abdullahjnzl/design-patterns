package creational.abstract_factory;

class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Windows checkbox");
    }
}
