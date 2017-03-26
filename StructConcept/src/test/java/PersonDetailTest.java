import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kino on 2017-03-26.
 */


class PersonDetailTest
{
    private String name, sname, streetname, suburb;
    private int unit, age;

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