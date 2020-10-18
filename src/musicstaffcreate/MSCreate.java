package musicstaffcreate;

public class MSCreate {

    private String name ="MidiStaffCreate";
    private String version = "1.0";

    public MainWin mainWin;

    MSCreate(){

        mainWin = new MainWin(this);


    }

}
