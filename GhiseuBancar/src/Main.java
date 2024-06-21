
public class Main {
	
    public static void main(String[] args) {
        ContBancar contLei1 = new ContLei("RO123", 1000);
        ContBancar contLei2 = new ContLei("RO124", 2000);
        ContBancar contEuro1 = new ContEuro("RO125", 600);

        Client client1 = new Client("Ion Popescu", "Str. Libertatii, nr. 10", new ContBancar[]{contLei1, contEuro1});
        Client client2 = new Client("Maria Ionescu", "Str. Pacii, nr. 5", new ContBancar[]{contLei2});

        Banca banca = new Banca("BCR123");

        banca.add(client1);
        banca.add(client2);

        banca.afisareClient("Ion Popescu");
        banca.afisareClient("Maria Ionescu");

        ((ContLei) contLei1).transfer((ContLei) contLei2, 500);
        
        banca.afisareClient("Ion Popescu");
        banca.afisareClient("Maria Ionescu");
    }
}
