public class LightArmor implements Armor{

    final double reductionPercentage = 20;

    public boolean isHeavy() {
        return false;
    }

    public double reductionPercentage() {
        return reductionPercentage;
    }

    public String type(){
        return "Light armor";
    }
}
