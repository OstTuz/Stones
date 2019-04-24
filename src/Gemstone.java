public class Gemstone extends Stone {       //розширення класу Stone

    double blick;     //блиск, падіння світла під кутом 20*
    boolean cutted;   //гранування

    public Gemstone() {         //пустий конструктор
        super();
        this.blick = 0;
        this.cutted = false;
    }

    public Gemstone(String name, double karat, double price, String color, double opacity, double blick, boolean cutted) {      //конструктор
        super(name, karat, price, color, opacity);
        this.blick = blick;
        this.cutted = cutted;
        if (cutted == true)
        {
            this.price += 100;
        }
    }

    @Override
    public void Display()
    {
        super.Display();
        if (this.cutted == true)
        {
            System.out.print(getBlick()+" cutted");
        }
        else System.out.print(getBlick()+" not cutted");

    }

    @Override
    public void Search_less_karat(double karat) {
        super.Search_less_karat(karat);
    }

    @Override
    public void Search_between_opacity(double from, double to) {
        super.Search_between_opacity(from, to);
    }

    public double getBlick() {
        return blick;
    }

}

