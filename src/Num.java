public class Num {
    private int value;

    public Num(int newValue){
        value = newValue;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int newNum){
        value = newNum;
    }

    public String toString(){
        String result = Integer.toString(value);
        return result;
    }

    public boolean equals(Num otherNum){
        return this.value == otherNum.value;
    }
}