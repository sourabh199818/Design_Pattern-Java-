package Singleton_Pattern;

public class LazyWay {
    //This is Lazy way of creating a Singleton Object
    private  static LazyWay obj;
    public static LazyWay getObj()
    {
        if(obj==null)
        {
           obj = new LazyWay();
        }
        return obj;
    }
    public static void main(String args[])
    {
        System.out.println("Singleton Method");
         LazyWay obj = LazyWay.getObj();
         System.out.println(obj.hashCode());

         // Checking if the we can create another object
        LazyWay obj1 = LazyWay.getObj();
        System.out.println(obj1.hashCode());

//        O/P should always be same otherwise it is not a Singleton method

    }
}
