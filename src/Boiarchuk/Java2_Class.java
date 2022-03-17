package Boiarchuk;

public class Java2_Class {
    public static void main(String[] args){

        double a = 8.5d;
        double b = 11.45d;
        double c = 10d;
        double dis1 = c - a;
        double dis2 = c - b;
        if(dis1 > dis2){
            System.out.println(b);
        }
        else{
            System.out.println(a);
        }
    }

}
