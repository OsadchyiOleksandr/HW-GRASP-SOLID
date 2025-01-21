package hillel.hw;

public class App {
    public static void main(String[] args) {
        User user = new User("Semen");
        Address address = new Address("Shevchenka St.", "Kyiv", "01001");
        user.setAddress(address);
        System.out.println("User's address " + user.getName() + ": " + user.getAddress());

        //check
        if (user.getAddress() != null) {
            System.out.println("User's address: " + user.getAddress());
        } else {
            System.out.println("User's address is not set.");
        }

        System.out.println("Is the address correctly set?");
        if (user.getAddress().getStreet().equals("Shevchenka St.") &&
                user.getAddress().getCity().equals("Kyiv") &&
                user.getAddress().getPostalCode().equals("01001")) {
            System.out.println("Address is correctly set.");
        } else {
            System.out.println("There is an issue with the address.");
        }

        System.out.println("User's name: " + user.getName());
        System.out.println("Address details: " + user.getAddress());
    }
}
