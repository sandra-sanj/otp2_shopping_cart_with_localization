import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    private static ResourceBundle getLanguageBundleFromInput(int input) {
        Language selectedLanguage;
        switch(input) {
            case 1:
                selectedLanguage = new Language("en", "US");
                break;
            case 2:
                selectedLanguage = new Language("fi", "FI");
                break;
            case 3:
                selectedLanguage = new Language("sv", "SE");
                break;
            case 4:
                selectedLanguage = new Language("ja", "JP");
                break;
            default:
                selectedLanguage = new Language("en", "US"); // fallback
                break;
        }
        Locale locale = new Locale(selectedLanguage.getLocale());
        return ResourceBundle.getBundle("MessagesBundle", locale);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Select language (1 - English, 2 - Finnish, 3 - Swedish, 4 - Japanese): ");
        int number = Integer.parseInt(sc.nextLine());
        ResourceBundle resource = getLanguageBundleFromInput(number);

        ShoppingCart shoppingCart = new ShoppingCart();

        System.out.print(resource.getString("total_items_count_question"));
        int itemsCount = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= itemsCount; i++) {
            System.out.print(resource.getString("item_name_question"));
            String item = sc.nextLine();

            System.out.print(resource.getString("item_price_question"));
            double price = Double.parseDouble(sc.nextLine());

            System.out.print(resource.getString("item_quantity_question"));
            int quantity = Integer.parseInt(sc.nextLine());

            shoppingCart.addItem(new Item(item, price), quantity);
        }

        System.out.println(resource.getString("total_cost") + shoppingCart.getTotalPrice());
    }
}
