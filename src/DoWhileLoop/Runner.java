package DoWhileLoop;

public class Runner {
    public static void main(String[] args) {

Animal myDog = new Dog(); // this is called upcasting
 Animal myCat = new Cat(); // upcasting

     Animal anm = new Animal();
     anm.sound();
     anm.scream();
        myDog.sound();
        myCat.scream();
        myDog.scream();
        myCat.sound();

    }
}
