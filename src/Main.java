import creational.abstract_factory.*;
import structural.adapter.LegacyService;
import structural.adapter.LegacyServiceAdapter;
import structural.adapter.LegacyServiceImpl;
import structural.adapter.TargetService;
import structural.bridge.*;
import structural.composite.IndividualEmployee;
import structural.composite.Manager;
import structural.decorator.BasicNotification;
import structural.decorator.EmailNotificationDecorator;
import structural.decorator.LoggingNotificationDecorator;
import structural.decorator.SMSNotificationDecorator;
import structural.facade.OrderFacade;
import structural.flyweight.Circle;
import structural.flyweight.ShapeFactory;


public class Main {
    private Button button;
    private Checkbox checkbox;
    private static final String[] colors = {"Red", "Green", "Blue", "White", "Black"};

    public Main(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
    }

    public static void main(String[] args) {


        // use the builder pattern
        //     House house = House.builder()
        //            .foundation("Concrete")
        //           .walls("Brick")
        //           .roof("Tile")
        //          .floors(2)
        //          .build();

        //  System.out.println(house);

        //using prototype pattern
        // Sedan originalSedan = new Sedan("Toyota Camry", "Blue");

        // Clone the original Sedan
        // Sedan clonedSedan = (Sedan) originalSedan.clone();
        // clonedSedan.setColor("White");
        // Sedan whiteCamry = (Sedan) originalSedan.clone();

        // Display both Sedans
        // System.out.println("Original Sedan: " + originalSedan);
        // System.out.println("Cloned Sedan: " + clonedSedan);

        // Show that both instances are separate
        //  System.out.println("Original Sedan HashCode: " + originalSedan.hashCode());
        //  System.out.println("Cloned Sedan HashCode: " + clonedSedan.hashCode());

        // Drive both Sedans
        //  originalSedan.drive();
        //  clonedSedan.drive();

        // using Factory pattern
//        Dialog dialog = new WindowsDialog();
//        dialog.renderWindow();
//
//        // using abstract factory pattern
//        GUIFactory factory = new WindowsFactory();
//        Main main = new Main(factory);
//        main.renderUI();
//
//        factory = new MacOSFactory();
//        main = new Main(factory);
//        main.renderUI();

        // using adapter design pattern
        // Create an instance of LegacyService
//        LegacyService legacyService = new LegacyServiceImpl();
//
//        // Wrap it with the structural.adapter
//        TargetService targetService = new LegacyServiceAdapter(legacyService);
//
//        // Use the targetService as expected by the modern system
//        System.out.println(targetService.getData());
//
//        // using bridge design factory
//        DeliveryMethod emailDelivery = new EmailDelivery();
//        DeliveryMethod smsDelivery = new SMSDelivery();
//
//        Notification emailNotification = new EmailNotification(emailDelivery);
//        Notification smsNotification = new SMSNotification(smsDelivery);
//
//        emailNotification.send("Hello, this is an email!", "john.doe@example.com");
//        smsNotification.send("Hello, this is an SMS!", "123-456-7890");
//
//        // Switching delivery method for EmailNotification
//        emailNotification = new EmailNotification(smsDelivery);
//        emailNotification.send("Hello, this is an email using SMS delivery method!", "john.doe@example.com");

        // using composite design pattern
        // Create individual employees
//        IndividualEmployee emp1 = new IndividualEmployee("Rashed", 1000);
//        IndividualEmployee emp2 = new IndividualEmployee("Hamza", 1500);
//        IndividualEmployee emp3 = new IndividualEmployee("Abdullah Abed", 1500);
//        IndividualEmployee emp4 = new IndividualEmployee("Noor", 1000);
//
//        // Create managers
//        Manager manager1 = new Manager("Abdullah Nazzal", 2000);
//        Manager manager2 = new Manager("Yazeed Samamah", 2000);
//
//        // Add employees to managers
//        manager1.addSubordinate(emp1);
//        manager1.addSubordinate(emp2);
//        manager1.addSubordinate(emp3);
//
//        manager2.addSubordinate(emp4);
//
//        // Create top-level manager
//        Manager topManager = new Manager("Sadek", 3000);
//        topManager.addSubordinate(manager1);
//        topManager.addSubordinate(manager2);
//
//        // Print salaries
//        System.out.println("Total salary managed by " + manager1.getName() + ": " + manager1.getSalary());
//        System.out.println("Total salary managed by " + manager2.getName() + ": " + manager2.getSalary());
//        System.out.println("Total salary managed by " + topManager.getName() + ": " + topManager.getSalary());
//
//        // using decorator design pattern
//        // Create a basic notification
//        structural.decorator.Notification notification = new BasicNotification("System update available.");
//
//        // Add email functionality
//        structural.decorator.Notification emailNotification = new EmailNotificationDecorator(notification);
//        emailNotification.send();
//
//        System.out.println(); // New line for better readability
//
//        // Add SMS functionality
//        structural.decorator.Notification smsNotification = new SMSNotificationDecorator(notification);
//        smsNotification.send();
//
//        System.out.println(); // New line for better readability
//
//        // Add logging functionality
//        structural.decorator.Notification loggingNotification = new LoggingNotificationDecorator(notification);
//        loggingNotification.send();
//
//        System.out.println(); // New line for better readability
//
//        // Combine all features
//        structural.decorator.Notification combinedNotification = new EmailNotificationDecorator(
//                new SMSNotificationDecorator(
//                        new LoggingNotificationDecorator(notification)));
//        combinedNotification.send();

        // using facade design pattern
        System.out.println("\nusing facade design pattern");
        OrderFacade orderFacade = new OrderFacade();

        orderFacade.placeOrder("Laptop", 1, "Credit Card", 1200.00);
        System.out.println("\n");
        orderFacade.placeOrder("Headphones", 2, "PayPal", 200.00);

        //using flyweight design pattern
        System.out.println("\nusing flyweight design pattern");

        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }

    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}