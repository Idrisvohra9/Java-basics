import ImportThisClass;
public class Import_Taker {
    public static void main(String[] args) {
        // This is also an example of has-a relationship between classes
        ImportThisClass i = new ImportThisClass();
        System.out.println(i.s);
        i.putMessage();
    }
}