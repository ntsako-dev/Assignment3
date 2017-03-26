/**
 * Created by Kino on 2017-03-26.
 */

import org.junit.Test;

public class PersonDetail
{
    private String name, sname, streetname, suburb;
    private int unit, age;

    public PersonDetail()
    {}


    public int compareTo(PersonDetail det)
    {
        return (det.getName().compareTo(name));
    }


    public PersonDetail(String name, String Sname, int age, int unit, String streetname, String suburb)
    {
        this.name = name;
        this.sname = Sname;
        this.streetname = streetname;
        this.suburb = suburb;
        this.unit = unit;
        this.age = age;

    }


    public String getName()
    {
        return name;
    }

    public String getSname()
    {
        return sname;
    }


    public int getAge()
    {
        return age;
    }

    public int getUnitNumber()
    {
        return unit;
    }

    public String getStreetName()
    {
        return streetname;
    }

    public String getSuburbName()
    {
        return suburb;

    }

    public String toString()
    {
        return "Name : " + getName() + "\nSurname : " + getSname() + "\nAge : " + getAge()+
                "\nUnit Number : " + getUnitNumber() + "\nStreet Name : " + getStreetName() +
                "\nSurburb : " + getSuburbName()+"\n\n";

    }





}
