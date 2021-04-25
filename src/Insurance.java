public abstract class Insurance {
    String typeInsurance;
    double cost;
    public Insurance(String type){
        typeInsurance = type;
        cost = 0;
    }

    public String getTypeInsurance() {
        return typeInsurance;
    }

    public double getCost() {
        return cost;
    }

    public abstract void setCost();
    public abstract void display();
}
