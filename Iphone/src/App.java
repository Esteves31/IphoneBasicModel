import Classes.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone newIphone = new Iphone();

        newIphone.playMusic("Bad Omens - Never Know");
        newIphone.pauseMusic();
        newIphone.pickMusic();

        newIphone.makeCall();
        newIphone.acceptCall();
        newIphone.startVoiceMail();

        newIphone.updateTab();
        newIphone.addNewTab();
        newIphone.updateTab();
    }
}
