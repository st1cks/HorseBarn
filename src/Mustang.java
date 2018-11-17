public class Mustang implements Horse{
    private int weight;
    private String name;

    public Mustang(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName(String name){
        return this.name;
    }
    public int getWeight(int weight){
        return this.weight;
    }
}
