package bon.moe;

/**
 * Created by setup on 2015/06/04.
 */
public class GameBoyAdvance{
    private GameBoyAdvanceRom gbaRom;

    public void play(GameBoyAdvanceRom rom){
        System.out.println("play gba");
    }
    public void setGame(){
        gbaRom = new GameBoyAdvanceRom();
        System.out.println("set gba rom");
    }
}
