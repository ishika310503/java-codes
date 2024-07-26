package oops;

// 1 . employee class print name and salary
class Employee {
    int salary;
    public int getSalary() {
        return salary;
    }
    String name;
    String getName() {
        return name;
    }
    public void setName(String s) {
        name = s;

    }
}
public class oop39
{
public static void main(String[] args)
{
 Employee on=new Employee();
on.setName("Ishika");
on.salary=4599;
    System.out.println(on.getName());
    System.out.println(on.getSalary());
}
}

