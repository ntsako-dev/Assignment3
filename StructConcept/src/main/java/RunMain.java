/**
 * Created by Kino on 2017-03-26.
 */
import java.util.*;
import org.junit.Test;


public class RunMain
{

    public static void main(String[]args)
    {

        // Collections - List
        FunctionList();


        // Collections - Set
        FuctionSet();

        // Collections - Map
        FuctionMap();


   /*

    Calc c = new Calc();
    double multi = c.multiplication(20.0, 5.0);
    int add = c.addition(5, 10);
    boolean eq = c.equalIntegers(10, 10);
   */
    }

    @Test
    public static void FunctionList()
    {

        List<PersonDetail> list = new ArrayList<PersonDetail>();

        list.add(new PersonDetail("Ntsako", "Mboweni", 50, 104, "Flar", "Cape Town"));
        list.add(new PersonDetail("John", "Wintar", 23, 101, "tower", "Bloemfontien"));
        list.add(new PersonDetail("Desmon", "Stuart", 40, 65, "Singar", "Goerge"));
        list.add(new PersonDetail("Lucky", "Les", 63, 22, "Tir", "Pretoria"));

        System.out.println("List Function" + "\n");

        for(int i = 0; i < list.size(); i++)
        {

            System.out.println(list.get(i).toString());
        }


    }

    @Test
    public static void FuctionSet()
    {

        Set<PersonDetail> set = new TreeSet<PersonDetail>();

        set.add(new PersonDetail("Ntsako", "Mboweni", 50, 104, "Flar", "Cape Town"));
        set.add(new PersonDetail("John", "Wintar", 23, 101, "tower", "Bloemfontien"));
        set.add(new PersonDetail("Desmon", "Stuart", 40, 65, "Singar", "Goerge"));
        set.add(new PersonDetail("Lucky", "Les", 63, 22, "Tir", "Pretoria"));

        System.out.println("Set Function" + "\n");

        for (PersonDetail det : set) {
            System.out.println(det);
        }

    }

    @Test
    public static void FuctionMap()
    {

        Map<Integer, PersonDetail> map = new TreeMap<Integer, PersonDetail>();

        map.put(1,new PersonDetail("Ntsako", "Mboweni", 50, 104, "Flar", "Cape Town"));
        map.put(2,new PersonDetail("John", "Wintar", 23, 101, "tower", "Bloemfontien"));
        map.put(3,new PersonDetail("Desmon", "Stuart", 40, 65, "Singar", "Goerge"));
        map.put(4,new PersonDetail("Lucky", "Les", 63, 22, "Tir", "Pretoria"));

        System.out.println("Map Function" + "\n");

        for(Map.Entry<Integer, PersonDetail> entry:map.entrySet())
        {
            int key= entry.getKey();
            PersonDetail per =entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(per.toString());
        }

    }




}
