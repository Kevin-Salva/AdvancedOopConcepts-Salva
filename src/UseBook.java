public class UseBook {
    public static void main(String[] args) {
        Fiction aBook = new Fiction("Pride and Prejudice");
        NonFiction bBook = new NonFiction("In Cold Blood");
        System.out.println("Fiction: "+aBook.getName()+ "Costs: $"+aBook.getPrice());
        System.out.println("NonFiction: "+bBook.getName()+"Costs: $"+bBook.getPrice());
    }
}
