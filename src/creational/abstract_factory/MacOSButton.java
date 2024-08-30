package creational.abstract_factory;

class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering macOS button");
    }
}
