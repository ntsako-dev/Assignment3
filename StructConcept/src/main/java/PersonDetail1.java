/**
 * Created by Kino on 2017-03-26.
 */
import org.junit.Test;

class PersonDetail1 implements Person, Address, Comparable<PersonDetail1>
{
    private String name, sname, streetname, suburb;
    private int unit, age;

    public int compareTo(PersonDetail1 det)
    {
        return (det.getName().compareTo(name));
    }


    public PersonDetail1(String name, String Sname, int age, int unit, String streetname, String suburb)
    {
        this.name = name;
        this.sname = Sname;
        this.streetname = streetname;
        this.suburb = suburb;
        this.unit = unit;
        this.age = age;

    }

    @Test
    public String getName()
    {
        return name;
    }

    @Test
    public String getSname()
    {
        return sname;
    }

    @Test
    public int getAge()
    {
        return age;
    }

    @Test
    public int getUnitNumber()
    {
        return unit;
    }

    @Test
    public String getStreetName()
    {
        return streetname;
    }

    @Test
    public String getSuburbName()
    {
        return suburb;

    }
    @Test
    public String toString()
    {
        return "Name : " + getName() + "\nSurname : " + getSname() + "\nAge : " + getAge()+
                "\nUnit Number : " + getUnitNumber() + "\nStreet Name : " + getStreetName() +
                "\nSurburb : " + getSuburbName()+"\n\n";

    }





}
