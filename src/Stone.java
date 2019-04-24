public class Stone {
    String name;        //назва каменю
    double karat;       //к-сть карат
    double price;       //вартість
    String color;       //колір
    double opacity;     //прозорість


    Stone()             //пустий конструктор
    {
        this.name = "";
        this.karat = 0;
        this.price = 0;
        this.color = "";
        this.opacity = 0;
    }

    public Stone(String name, double karat, double price, String color, double opacity) {       //конструктор
        this.name = name;
        this.karat = karat;
        this.price = price;
        this.color = color;
        this.opacity = opacity;
    }

    public void Display()           //метод, що виводить дані об'єкта на екран
    {
        System.out.print(getName()+" "+getKarat()+" "+getPrice()+" "+getColor()+" "+getOpacity()+" ");
    }

    public void Search_less_karat(double karat)        //метод виводить на екран усі об'єкти каратність яких менша параметра karat
    {
        if (this.getKarat()<=karat)
        {
            Display();
        }
    }

    public void Search_between_opacity(double from, double to)      //метод виводить на екран усі об'єкти, прозорість яких є в діапазоні from - to
    {
        if (this.getOpacity() >= from && this.getOpacity() <= to)
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
