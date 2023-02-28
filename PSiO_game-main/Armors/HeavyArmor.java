public class HeavyArmor implements Armor{

    final double reductionPercentage = 30;

    public boolean isHeavy() {
        return true;
    }

    public double reductionPercentage() {
        return reductionPercentage;
    }

    public String type(){
        return "Heavy armor";
    }
}
