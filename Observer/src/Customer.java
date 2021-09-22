

import java.util.ArrayList; // import the ArrayList class

public class Customer extends Observer{
   
    //Variables
    private String name;
    private Store favStore;
    private float discount;

    //arraylist for registering stores
    private ArrayList<Store> stores =new ArrayList<Store>();

    //constructor
    public Customer(Store favStore, String name){
        this.name= name;

        this.favStore=favStore;
        register(favStore);
    }

    //register 
    void register(Store store){
        store.register(this);
        stores.add(store);
        //System.out.println(name + " was registered for " + store.getName());
    }

    //deregister
    void unregister(Store store){

       if (stores.contains(store)){
           store.unregister(this);
           stores.remove(stores.indexOf(store));
       }else
           System.out.println("Customer is not registered for " + store.getName());
        
    }

    //implement observer methods
    void update(float discount){
        this.discount=discount;

        System.out.println("\nName: " + name + "\nDiscount: " + discount);
    }


    @Override
    public String toString(){
        return name;
    }
}
