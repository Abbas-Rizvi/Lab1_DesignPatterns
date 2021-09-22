public class Driver {
    public static void main(String[] args){

        float dis_five = (float) 5.00;

        Store toysrus = new Store("Toys-R-Us", dis_five);
        Store liquour = new Store("LCBO", dis_five);
        Store moltov = new Store("moltov-mart", dis_five);
        Store walmart = new Store("Walmart", dis_five);


        Customer c1 = new Customer(toysrus, "timmy");
        Customer c2 = new Customer(walmart, "shazhabe mahmood");
        Customer c3 = new Customer(liquour, "manny");
        Customer c4 = new Customer(moltov, "jayden");


        c1.register(liquour);
        c2.register(liquour);
        c3.register(liquour);

        liquour.setDiscount("halloween", (float)10.14);
        
        c3.unregister(liquour);
    
    }
}
