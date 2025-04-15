// SuperStore Exercise: Access Modifiers & Object Modeling Focus

// TODO: Define a class called Product with:
// - A protected String field called name
// - A protected double field called price
// - A private final int productId
// - A public static int nextId to help generate unique IDs
// - A constructor that sets name, price, and assigns a unique ID
// - Public getters for all fields
// - Override toString() to return formatted product details
// - Override equals(Object o) to compare name and productId
class Product{
    protected String name;
    protected double price;
    private final int productId;
    public static int nextId = 1;

    Product(String name, double price){
        this.name = name;
        this.price = price;
        this.productId = nextId;
        ++nextId;

    }

    public String getName() {
        return this.name;
    }


    public double getPrice() {
        return this.price;
    }

    public int getProductId() {
        return this.productId;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + "\nPrice: " + this.price + "\nProductId: " + getProductId();
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;

        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        return name.equals(product.name);
    }

}
// TODO: Define a subclass Electronics that extends Product
// - Add a private String field called brand
// - Add a private boolean field called hasBattery
// - Constructor takes all fields and uses super for shared ones
// - Override toString() to include brand and battery status
class Electronics extends Product{
    private String brand;
    private boolean hasBattery;

    Electronics(String name, double price, String brand, boolean hasBattery){
        super(name, price);
        this.brand = brand;
        this.hasBattery = hasBattery;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nPrice: $" + this.price + "\nProductId: " + getProductId() + "\nBrand: " + this.brand + "\nHas battery: " + this.hasBattery + "\n";
    }
}

// TODO: Define a subclass Grocery that extends Product
// - Add a private double field called weight (in kg)
// - Add a private boolean field called isPerishable
// - Constructor takes all fields and uses super for shared ones
// - Override toString() to include weight and perishability
class Grocery extends Product{
    private double weight;
    private boolean isPerishable;

    Grocery(String name, double price, double weight, boolean isPerishable){
        super(name, price);
        this.weight = weight;
        this.isPerishable = isPerishable;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + "\nPrice: $" + this.price + "\nProductId: " + getProductId() + "\nWeight: " + this.weight + "kg" + "\nPerishability: " + this.isPerishable + "\n";
    }

    final void warrantyInfo(){
        ;
    }
}



// TODO: Define a final class Toy that extends Product
// - Add a private int field called minAge
// - Constructor takes all fields and uses super for shared ones
// - Override toString() to include minAge
final class Toy extends Product{
    private int minAge;

    Toy(String name, double price, int minAge){
        super(name, price);
        this.minAge = minAge;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + "\nPrice: $" + this.price + "\nProductId: " + getProductId() + "\nMinimum Age: " + this.minAge + "\n";
    }
}


// TODO: Define class SuperStoreTest with a main method
// - Create at least one instance of each subclass
// - Store them in a Product[] array
// - Loop through and print each item
// - Call equals() to compare two products with the same ID and name
class SuperStoreTest{
    public static void main(String[] args) {
        Electronics electronics = new Electronics("A PC packed with a ROG STRIX Rtx 5090 OC Edition, Ryzen 9 9950x3D, G.Skill Trident Z5 RGB 256GB of DDR5 6000Mhz CL-30, Sabrent Rocket 16TB M.2 SSD, 1000W Platinum Rated PSU, Lian Li Galahad II LCD, ROG STRIX X870-A Gaming Motherboard, NZXT H9 Flow Elite, and 10 Lian Li Uni Fan SL-Infinity", 9999.99, "Tody's Brand", false);
        Grocery grocery = new Grocery("Sushi", 19.99, 2, true);
        Toy toy = new Toy("Fortnite nerf gun", 29.99, 12);
        Coupon coupon = new Coupon();

        Product product[] = {electronics, grocery, toy};

        for (Product value : product){
            System.out.println(value);
        }

        toy.equals(new Toy("Fortnite nerf gun", 29.99, 12));

        double Price = grocery.getPrice();
        double discount = coupon.discountRate;
        System.out.printf("\nPrice of grocery after discount from coupon: $%.2f" , (Price * discount));
    }
}


// Additional TODOs:
// 1. Try to extend Toy — what happens and why?
// 2. Make a class Coupon with a final discountRate and apply it to a Product
// 3. Add a method to Electronics called warrantyInfo() and mark it final
// 4. Use access modifiers appropriately and explain your choices in comments

//Toy can't be extended because it is final and when a class is final, it can not be inherited by a subclass
//I used the modifiers as said in the instructions?

class Coupon {
    final double discountRate = 0.90;
}
