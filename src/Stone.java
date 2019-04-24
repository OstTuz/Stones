public class Stone {
    String name;
    double karat;
    double price;
    String color;
    double opacity;


    Stone()
    {
        this.name = "";
        this.karat = 0;
        this.price = 0;
        this.color = "";
        this.opacity = 0;
    }

    public Stone(String name, double karat, double price, String color, double opacity) {
        this.name = name;
        this.karat = karat;
        this.price = price;
        this.color = color;
        this.opacity = opacity;
    }

    public void Display()
    {
        System.out.print(getName()+" "+getKarat()+" "+getPrice()+" "+getColor()+" "+getOpacity()+" ");
    }

    public void Search_less_karat(double karat)
    {
        if (this.getKarat()<=karat)
        {
            Display();
        }
    }

    public String getName() {
        return name;
    }

    public double getKarat() {
        return karat;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public double getOpacity() {
        return opacity;
    }


}
