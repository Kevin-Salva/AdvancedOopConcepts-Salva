import java.util.*;
public class Health extends Insurance{

    public Health() {
        super("Health Policy");
        setCost();
    }

    @Override
    public void setCost() {
        this.cost = 196;
    }

    @Override
    public void display() {
        System.out.println(typeInsurance+"cost per month: $"+ getCost());
    }
}


