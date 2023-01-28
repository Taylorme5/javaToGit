public class Frog extends Animal{

    public Frog(){
        super();
    }

    @Override
    public void makeNoise(){
        System.out.print("Croak");
    }

    @Override
    public String getType(){
        return "Frog";
    }
}