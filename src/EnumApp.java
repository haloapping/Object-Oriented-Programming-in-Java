public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.classes = Classes.PREMIUM;

        System.out.println(customer.classes);
    }
}
