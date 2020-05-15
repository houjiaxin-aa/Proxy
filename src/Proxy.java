public class Proxy implements GiveGift {
    Pursuit gg;

    public Proxy(SchoolGirl mm){
        gg=new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveChocolate();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveDolls();
    }
}
