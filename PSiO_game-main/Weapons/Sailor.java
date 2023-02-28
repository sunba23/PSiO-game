public class Sailor extends Character{

    public Sailor(){
        movementBehavior = new Paddle();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
