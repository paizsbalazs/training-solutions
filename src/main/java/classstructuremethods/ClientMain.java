package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();
        client.setName("John Doo");
        client.setYear(1980);
        client.setAddress("Nem tudomka utca 3.");
        System.out.println(client.getName() + client.getAddress() + client.getYear());

        client.migrate("Terez korut 5.");
        System.out.println(client.getAddress());

    }
}
