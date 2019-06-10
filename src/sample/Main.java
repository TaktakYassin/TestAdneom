package sample;

import java.util.Arrays;
import java.util.List;


public class Main {


    public static void main(String[] args) {

        Controller controller=new Controller();
        
        List<Object> list= Arrays.asList(1,2,3,4,5);
        System.out.println(controller.partition(list,2));
        System.out.println(controller.partition(list,3));
        System.out.println(controller.partition(list,1));

    }


}
