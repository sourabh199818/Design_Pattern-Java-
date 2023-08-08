package Singleton_Pattern;

public class EagerWay {

    private static  EagerWay ob = new EagerWay();
    public static EagerWay getEagerway()
    {
        return ob ;
    }
    public static void main(String args[]) {
        System.out.println("Singleton EagerWay Method");
        EagerWay obj = EagerWay.getEagerway();
        System.out.println(obj.hashCode());

        // Checking if the we can create another object
        EagerWay obj1 = EagerWay.getEagerway();
        System.out.println(obj1.hashCode());
    }
}
