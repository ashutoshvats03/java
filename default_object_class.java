class Laptop{
    String model;
    int price;
    static String company;
    
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }


    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }


    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    


}
public class default_object_class {
    public static void main(String[] args) {
        Laptop.company="Lenovo";

        Laptop obj = new Laptop();

        obj.model="yoga u";
        obj.price=7000;
        
        System.out.println(obj.toString());
        System.out.println(obj.hashCode());
        

         Laptop obj1 = new Laptop();

        obj1.model="yoga p";
        obj1.price=9000;
        System.out.println();
        System.out.println(obj1.toString());
        System.out.println(obj1.hashCode());
        
        System.out.println();
        
        System.out.println(obj.equals(obj1));
            
        
    }
}
