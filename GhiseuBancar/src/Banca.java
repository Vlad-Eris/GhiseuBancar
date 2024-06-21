import java.util.ArrayList;

public class Banca {
    private ArrayList<Client> clienti;
    private String codBanca;

    public Banca(String codBanca) {
        this.codBanca = codBanca;
        this.clienti = new ArrayList<>();
    }

    public void add(Client c) {
        for (Client client : clienti) {
            if (client.getNume().equals(c.getNume())) {
                System.out.println("Clientul cu acest nume există deja.");
                return;
            }
        }
        clienti.add(c);
    }

    public void afisareClient(String nume) {
        for (Client client : clienti) {
            if (client.getNume().equals(nume)) {
                client.afisare();
                return;
            }
        }
        System.out.println("Clientul nu a fost găsit.");
    }
}
