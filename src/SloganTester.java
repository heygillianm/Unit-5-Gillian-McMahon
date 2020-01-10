public class SloganTester {
    public static void main(String [] args){
        Slogan aSlogan = new Slogan("We'll need a bigger boat.");
        Slogan bSlogan = new Slogan("He does watercolors. Mostly landscapes but some nudes.");
        Slogan cSlogan = new Slogan("Yippe Ki Yay Mother****");
        Slogan dSlogan = new Slogan("Hello there");

        System.out.println(aSlogan.toString());
        System.out.println(bSlogan.toString());
        System.out.println(cSlogan.toString());
        System.out.println(dSlogan.toString());

        System.out.println("Count of Slogan: " + Slogan.getCount());
    }
}
