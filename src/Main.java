public class Main {
    public static void main(String[] args){
        SchoolGirl xiaoxiao=new SchoolGirl();
        xiaoxiao.setName("晓小小");

        Proxy daili=new Proxy(xiaoxiao);
        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();
    }
}
