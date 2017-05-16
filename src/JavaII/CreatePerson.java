package JavaII;


public class CreatePerson {
    public static void main(String[] args) {

        Person me = new Person("Carlos");
        Person gf = new Person();


        System.out.println(me.getName());

        gf.setName("Kelli");

        System.out.println(gf.getName());

        me.sayHello();

        gf.sayHello();

    }
}
