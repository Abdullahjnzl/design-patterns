import creational.abstract_factory.*;
import structural.adapter.LegacyService;
import structural.adapter.LegacyServiceAdapter;
import structural.adapter.LegacyServiceImpl;
import structural.adapter.TargetService;
import structural.bridge.*;


public class Main {
    private Button button;
    private Checkbox checkbox;

    public Main(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
    }
    public static void main(String[] args) {



        // user the builder pattern
   //     House house = House.builder()
    //            .foundation("Concrete")
     //           .walls("Brick")
     //           .roof("Tile")
      //          .floors(2)
      //          .build();

      //  System.out.println(house);

        //using prototype model
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

//        Dialog dialog = new WindowsDialog();
//        dialog.renderWindow();
//
//
//        GUIFactory factory = new WindowsFactory();
//        Main main = new Main(factory);
//        main.renderUI();
//
//        factory = new MacOSFactory();
//        main = new Main(factory);
//        main.renderUI();


        // Create an instance of LegacyService
        LegacyService legacyService = new LegacyServiceImpl();

        // Wrap it with the structural.adapter
        TargetService targetService = new LegacyServiceAdapter(legacyService);

        // Use the targetService as expected by the modern system
        System.out.println(targetService.getData());


        DeliveryMethod emailDelivery = new EmailDelivery();
        DeliveryMethod smsDelivery = new SMSDelivery();

        Notification emailNotification = new EmailNotification(emailDelivery);
        Notification smsNotification = new SMSNotification(smsDelivery);

        emailNotification.send("Hello, this is an email!", "john.doe@example.com");
        smsNotification.send("Hello, this is an SMS!", "123-456-7890");

        // Switching delivery method for EmailNotification
        emailNotification = new EmailNotification(smsDelivery);
        emailNotification.send("Hello, this is an email using SMS delivery method!", "john.doe@example.com");
    }
}