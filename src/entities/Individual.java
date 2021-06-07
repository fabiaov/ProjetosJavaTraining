package entities;

public class Individual extends TaxPayer {
    private Double healthTax;

    public Individual(){
        super();
    }


    public Individual(Double healthTax) {
        this.healthTax = healthTax;
    }

    public Individual(String name, Double anualIncomme, Double healthTax) {
        super(name, anualIncomme);
        this.healthTax = healthTax;
    }

    @Override
    public Double tax() {
        if (getAnualIncomme() < 20000.0){
            return (getAnualIncomme() * 0.15) - (healthTax * 0.50);
        } else (getAnualIncomme() >= 20000.0){
            return (getAnualIncomme() * 0.25) - (healthTax * 0.50);
        }
    }

}
