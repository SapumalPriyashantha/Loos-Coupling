package main;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/

public class Boy {
    public void chattingWithGirl() {
        //Tight Coupling
       /* Girl girl = new Girl();
        while (true) {
            girl.chat();//break down
        }*/

        //Loos Coupling
        SuperGirl girl = new Girl();
        while (true) {
            girl.chats();
        }


    }


}
