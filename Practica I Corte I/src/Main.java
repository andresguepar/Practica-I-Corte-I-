import domain.enums.ProductType;
import domain.models.Customer;
import domain.models.Order;
import domain.models.Product;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Customer client = new Customer(1,"Emma",1);
        Customer client2 = new Customer(2,"Cho",2);
        Customer client3 = new Customer(3,"Lexa",1);

        List<Product> products = new ArrayList<Product>();

        Product product = new Product(1,"Cake", ProductType.BEAKED,10000);
        Product product2 = new Product(2,"Ice Cream",ProductType.FREZEE,20000);
        Product product3 = new Product(3,"Sorbet",ProductType.BEVERAGE,30000);
        Product product4 = new Product(4,"lemon Pie",ProductType.BEAKED,40000);
        Product product5 = new Product(5,"Popsicles",ProductType.FREZEE,50000);
        Product product6 = new Product(6,"Cookies",ProductType.BEAKED,60000);
        Product product7 = new Product(7,"Jelly Beans",ProductType.CANDY,70000);
        Product product8 = new Product(8,"Milkshake",ProductType.BEVERAGE,80000);
        Product product9 = new Product(9,"Marshmallows",ProductType.CANDY,90000);
        Product product10 = new Product(10,"Macarons",ProductType.BEAKED,100000);


        products.add(product);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        products.add(product10);

       /* Order order = new Order(1,"Processing", LocalDate.of(2023,05,28),
                LocalDate.of(2023,06,05),product,client3);
        Order order2 = new Order(2,"Processing", LocalDate.of(2023,05,28),
                LocalDate.of(2023,06,05),product,client2);
        Order order3 = new Order(3,"Processing", LocalDate.of(2023,05,28),
                LocalDate.of(2023,06,05),product,client);
        Order order4 = new Order(4,"Processing", LocalDate.of(2023,05,28),
                LocalDate.of(2023,06,05),product,client3);
        Order order5 = new Order(5,"Processing", LocalDate.of(2023,05,28),
                LocalDate.of(2023,06,05),product,client2);



        byte option = 0;

        do{
            option = Byte.parseByte(JOptionPane.showInputDialog(
                            "⟡ MENU ⟡\n"+
                            "1. Add\n" +
                            "2. List\n" +
                            "3. Edit\n" +
                            "4. Delete\n" +
                            "5. Exit\n" +
                            "Choose your option"
            ));
            switch (option){
                case 1:
                    JOptionPane.showMessageDialog(null, "Add");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "List");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Edit");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Delete");
                    break;
                case 5:
                    option=5;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "I ∧,,,∧   ~ ┏━━━━━━━━┓\n" +
                            "(  ̳• · • ̳)   ~ ♡  Invalid Option   ♡\n" +
                            "/       づ  ~ ┗━━━━━━━━┛     ");
            }

        }while (option!=5);
        System.exit(0);

*/
    }
}