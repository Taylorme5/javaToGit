public class Monkey extends Animal {
    public Monkey(){
        super();
    }

    @Override
    public void makeNoise(){
        System.out.print("Oo oo ahh ahh");
    }

    @Override
    public String getType(){
        return "Monkey";
    }
}