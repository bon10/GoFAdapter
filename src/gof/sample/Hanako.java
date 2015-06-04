package gof.sample;

/**
 * Created by setup on 2015/06/04.
 */
public class Hanako implements Chairperson{
    private Taro taro;

    public Hanako(){
        taro = new Taro();
    }
    @Override
    public void organizeClass() {
        taro.enjoyWithAllClassmate();
    }
}
