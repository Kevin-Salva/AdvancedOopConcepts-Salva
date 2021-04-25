public class Life extends Insurance{
    public Life() {
        super("LifePolicy");
        setCost();
    }

    @Override
    public void setCost() {
        this.cost = 36;
    }

    @Override
    public void display() {
        System.out.println(typeInsurance+"cost per month: $"+ getCost());
    }
}
