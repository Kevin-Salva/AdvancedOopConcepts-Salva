public class Fiction extends Book {
    public Fiction(String name){
        super(name);
        setPrice();


    }
    public void setPrice(){
        this.price = 24.99;
    }

}
