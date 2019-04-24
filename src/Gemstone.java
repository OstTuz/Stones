public class Gemstone extends Stone {

    double blick;     //блиск, падіння світла під кутом 20*
    boolean cutted;   //гранування

    public Gemstone() {
        super();
        this.blick = 0;
        this.cutted = false;
    }

    public Gemstone(String name, double karat, double price, String color, double opacity, double blick, boolean cutted) {
        super(name, karat, price, color, opacity);
        this.blick = blick;
        this.cutted = cutted;
        if (cutted == true)
        {
            this.price += 100;
        }
    }

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

    public double getBlick() {
        return blick;
    }

    public boolean isCutted() {
        return cutted;
    }
}

