public class Person
{
    public String fullName = "Николенко А.Д";
    public int age = 31;

    public void talk()
    {
        System.out.println(fullName + " говорит - blablabla ");
    }

    public void move()
    {
        System.out.println(fullName + " идёт вперёд ");
    }

    public Person()
    {

    }

    public Person(String fullname, int age)
    {
        this.fullName = fullname;
        this.age = age;
    }






}

