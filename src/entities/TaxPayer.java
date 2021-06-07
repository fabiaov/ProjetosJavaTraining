package entities;

public abstract class TaxPayer {
    private String name;
    private Double anualIncomme;

    public TaxPayer() {
    }

    public TaxPayer(String name, Double anualIncomme) {
        this.name = name;
        this.anualIncomme = anualIncomme;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncomme() {
        return anualIncomme;
    }

    public void setAnualIncomme(Double anualIncomme) {
        this.anualIncomme = anualIncomme;
    }

    public abstract Double tax();

    @Override
    public String toString() {
        return name
                + " $ "
                + String.format("%.2f",anualIncomme);
    }
}
