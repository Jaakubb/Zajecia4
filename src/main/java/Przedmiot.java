public class Przedmiot {
    private String nazwa;
    private double cena;

    public Przedmiot(String nazwa, double cena){
        this.nazwa = nazwa;
        this.cena = cena;
    }
    public double getCena(){
        return cena;
    }
    public String getNazwa(){
        return nazwa;
    }

    @Override
    public int hashCode(){
        return 20 * nazwa.hashCode();
    }
    @Override
    public int compareTo(Przedmiot inny){
        if (inny == null){
            return 1;
        }
        int comparision = this.getNazwa().compareTo(inny.getNazwa());
        if (comparision != 0){
            return comparision;
        }
        return Double.compare(this.getCena(), inny.getCena());
    }
}
