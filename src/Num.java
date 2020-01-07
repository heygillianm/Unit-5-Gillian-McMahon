public class Num {
    int num;

    public Num(int number){
        num = number;
    }

    public int getNum(){
        return num;
    }

    public void setNum(int newNum){
        num = newNum;
    }

    public String toString(){
        String result = "";
        result += "Num: " + num;
        return result;
    }
}