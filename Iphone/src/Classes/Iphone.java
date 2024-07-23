package Classes;

import java.util.Scanner;

import Interfaces.MusicPlayer;
import Interfaces.Telephone;
import Interfaces.WebNavigation;

public class Iphone implements MusicPlayer, Telephone, WebNavigation{
    private boolean isPlayingMusic = false;
    private boolean existTab = false;
    private Scanner scanner;

    @Override
    public void addNewTab() {
        existTab = true;
        System.out.println("New page added");
        showPage();
    }

    @Override
    public void updateTab() {
        if (existTab)
            System.out.println("The page is updated");
        else 
            System.out.println("There is no page for update");
    }

    @Override
    public void showPage() {
        System.out.println("Page content");
    }

    @Override
    public void makeCall() {
        System.out.println("Starting a call");
    }

    @Override
    public void acceptCall() {
        System.out.println("Accepting call");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Starting voice mail");
    }

    @Override
    public void playMusic(String music) {
        isPlayingMusic = true;
        System.out.println("Playing: " + music);
    }

    @Override
    public void pauseMusic() {
        if (!isPlayingMusic)
            System.out.println("There is no music playing now!");
        else 
            System.out.println("The music is paused!");
    }

    @Override
    public void pickMusic() {
        System.out.println("Which music do you want to hear?");

        scanner = new Scanner(System.in);
        String musicName = scanner.nextLine();
        playMusic(musicName);
        scanner.close();
    }
    
}
