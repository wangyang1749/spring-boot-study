package test.loop;

public class Tes01 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println("before");
            if(i>5)
                return;
                System.out.println("i is" +i);
            System.out.println("after");
        }
    }
}
