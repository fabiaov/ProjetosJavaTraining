package entities;

public class Enterprise extends TaxPayer{

   private Integer nEmploees;

    public Enterprise() {
        super();
    }

    public Enterprise(Integer nEmploees) {
        this.nEmploees = nEmploees;
    }

    public Enterprise(String name, Double anualIncomme, Integer nEmploees) {
        super(name, anualIncomme);
        this.nEmploees = nEmploees;
    }

    public Integer getnEmploees() {
        return nEmploees;
    }

    public void setnEmploees(Integer nEmploees) {
        this.nEmploees = nEmploees;
    }

    @Override
    public Double tax() {
        if (nEmploees <= 10){
            return (getAnualIncomme() * 0.16);
        }else{
            return (getAnualIncomme() * 0.14);
        }
    }
}
