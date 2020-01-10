public class Slogan {
    private static int count;
    private String slowgan;

    public Slogan(String aSlogan){
        count = 0;
        slowgan = aSlogan;
    }

    public static int getCount(){
        return count;
    }

    public String toString(){
        String printSlogan = slowgan;
        count++;
        return printSlogan;
    }
}
