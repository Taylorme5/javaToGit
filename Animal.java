public abstract class Animal {

    private String name;

    
    public Animal(){
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void makeNoise(){
        System.out.print("?????");
    }

    public abstract String getType();

}
