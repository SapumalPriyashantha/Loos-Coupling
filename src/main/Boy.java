package main;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class Boy {
    public void chattingWithAGirl(){

        //Tight Coupling
        Girl girl = new Girl();
        girl.chat();

        //Loos Coupling
        SuperGirl superGirl = new Girl();
        superGirl.chat();

    }
}
