package ie.atu.week6;

public class Passenger {
    private String Title;
    private String Name;
    private String Id;
    private int Phone_no;
    private int Age;

    public Passenger(String title, String name, String id, int phone_no, int age) {
        Title = title;
        Name = name;
        Id = id;
        Phone_no = phone_no;
        Age = age;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setPhone_no(int phone_no) {
        Phone_no = phone_no;
    }

    public void setAge(int age) {
        Age = age;
    }

}
