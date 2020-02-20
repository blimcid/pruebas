package mipaqt;


import java.util.Date;

public class Ooo {

    public Ooo() {
        try {
            System.out.println("helloWorld"+(new Date()).getTime());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


}
