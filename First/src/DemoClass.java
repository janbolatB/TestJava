import java.util.ArrayList;

public class DemoClass {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
            list.add("India");
            list.add("Mongol");
            list.add("USA");
            list.add("China");
        for(String s : list){
            System.out.println(s);
        }

    }
} 
