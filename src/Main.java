import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Stone> Creation()           //функція створення намиста із каменів
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Stone> necklace = new ArrayList<>();
        String command;

        String name;
        double karat;
        double price;
        String color;
        double opacity;
        double blick;
        boolean cutted;

        System.out.println("How much money do you have?");
        System.out.print("Input: ");
        double money = scanner.nextDouble();
        double amount = 0;

        while (true)
        {
            System.out.println("What stone do you want ta add?  Stone/Gemstone");
            command = scanner.next();
            switch (command)
            {
                case("Stone"):
                    System.out.print("Input name: ");
                    name = scanner.next();
                    System.out.print("Input karat: ");
                    karat = scanner.nextDouble();
                    System.out.print("Input price: ");
                    price = scanner.nextDouble();
                    System.out.print("Input color: ");
                    color = scanner.next();
                    System.out.print("Input opacity: ");
                    opacity = scanner.nextDouble();
                    amount+=price;
                    if (amount <= money)
                    {
                        necklace.add(new Stone(name, karat, price, color, opacity));
                    }
                    else amount+=money;
                    break;
                case("Gemstone"):
                    System.out.print("Input name: ");
                    name = scanner.next();
                    System.out.print("Input karat: ");
                    karat = scanner.nextDouble();
                    System.out.print("Input price: ");
                    price = scanner.nextDouble();
                    System.out.print("Input color: ");
                    color = scanner.next();
                    System.out.print("Input opacity: ");
                    opacity = scanner.nextDouble();
                    System.out.print("Input blick: ");
                    blick = scanner.nextDouble();
                    System.out.print("Input is it cutted: ");
                    cutted = scanner.nextBoolean();
                    amount+=price;
                    if (amount <= money)
                    {
                        necklace.add(new Gemstone(name, karat, price, color, opacity, blick, cutted));
                    }
                    else amount+=money;
                    break;
                 default:
                     System.out.println("Error!!! Input Stone or Gemstone");
                     break;

            }
            if (amount > money)
            {
                break;
            }
        }

        return necklace;
    }

    public static void Sort(ArrayList<Stone> stones, int start, int end)        //функція сортування
    {
        if (start>=end) return;
        int i = start, j = end;
        int cur = i-(i-j)/2;
        while (i<j)
        {
            while (i < cur && stones.get(i).getPrice()<=stones.get(cur).getPrice())
            {
                i++;
            }
            while (j > cur && stones.get(cur).getPrice()<=stones.get(j).getPrice())
            {
                j--;
            }

            if(i<j)
            {
                Stone temp = stones.get(i);
                stones.set(i,stones.get(j));
                stones.set(j, temp);
                if (i == cur)
                {
                    cur = j;
                }
                else if(j == cur)
                {
                    cur = i;
                }

            }
            Sort(stones, start, cur);
            Sort(stones, cur+1, end);
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Stone> necklace = Creation();

        System.out.println();
        System.out.println("-----------Your stones----------");
        for (Stone s : necklace)
        {
            s.Display();
            System.out.println();
        }

        Sort(necklace, 0, necklace.size()-1);
        System.out.println();
        System.out.println("---------Sorted------------");
        for (Stone s : necklace)
        {
            s.Display();
            System.out.println();
        }

        System.out.println();
        System.out.println("--------------Search stones which karats are less than 5");
        for (Stone s : necklace)
        {
            s.Search_less_karat(5);
        }

        System.out.println();
        System.out.println("--------------Search stones which opacity is more than 0,1 and less than 0,8");
        for (Stone s : necklace)
        {
            s.Search_between_opacity(0.1, 0.8);
        }
    }
}
