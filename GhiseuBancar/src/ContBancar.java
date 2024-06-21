
public abstract class ContBancar implements SumaTotala {
	
    private String numarCont;
    private float suma;

    public ContBancar(String numarCont, float suma) {
        this.numarCont = numarCont;
        this.suma = suma;
    }

    public String getNumarCont() {
        return numarCont;
    }

    public void setNumarCont(String numarCont) {
        this.numarCont = numarCont;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    @Override
    public float getSumaTotala() {
        return suma;
    }
}

class ContLei extends ContBancar {
    public ContLei(String numarCont, float suma) {
        super(numarCont, suma);
    }

    public void transfer(ContLei contDestinatie, float suma) {
        if (getSuma() >= suma) {
            setSuma(getSuma() - suma);
            contDestinatie.setSuma(contDestinatie.getSuma() + suma);
        } else {
            System.out.println("Suma insuficientă pentru transfer.");
        }
    }
}

class ContEuro extends ContBancar {
    public ContEuro(String numarCont, float suma) {
        super(numarCont, suma);
    }

    public float getDobanda() {
        return getSuma() > 500 ? 0.3f : 0f;
    }

    @Override
    public float getSumaTotala() {
        return getSuma() * 36000;
    }
}
