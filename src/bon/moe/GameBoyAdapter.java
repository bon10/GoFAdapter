package bon.moe;

/**
 * Created by setup on 2015/06/04.
 */
public class GameBoyAdapter extends GameBoy implements ConvertGB {
    private GameBoy gb;

    GameBoyAdapter(){
        gb = new GameBoy();
    }

    @Override
    public void mountAdapterToGba(GameBoyAdvance gba) {
        System.out.println("mount this adapter to the gba");
    }

    @Override
    public void play(GameBoyRom gbRom){
        System.out.println("play gba to gb game!!");
        gb.play(gbRom);
    }

}
