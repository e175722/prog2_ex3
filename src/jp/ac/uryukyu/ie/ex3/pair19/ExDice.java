package jp.ac.uryukyu.ie.ex3.pair19;

public class ExDice extends Dice {
    private int minValue;
    private int maxvalue;

    public ExDice(int minValue, int maxValue){
        this.minValue = minValue;
        this.maxvalue = maxValue;
        super.play();
    }

    public void play(){
        int range =maxvalue-minValue+1;
        super.setValue((int)(Math.random()*range)+minValue);
    }
}
