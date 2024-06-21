
public class Client {
    private String nume;
    private String adresa;
    private ContBancar[] conturi;

    public Client(String nume, String adresa, ContBancar[] conturi) {
        if (conturi.length < 1 || conturi.length > 5) {
            throw new IllegalArgumentException("Un client trebuie să aibă între 1 și 5 conturi.");
        }
        this.nume = nume;
        this.adresa = adresa;
        this.conturi = conturi;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public ContBancar[] getConturi() {
        return conturi;
    }

    public void setConturi(ContBancar[] conturi) {
        if (conturi.length < 1 || conturi.length > 5) {
            throw new IllegalArgumentException("Un client trebuie să aibă între 1 și 5 conturi.");
        }
        this.conturi = conturi;
    }

    public void afisare() {
        System.out.println(nume + " " + adresa);
        for (ContBancar cont : conturi) {
            System.out.println("Suma totală: " + cont.getSumaTotala());
        }
    }
}
