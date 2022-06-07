public class CreateBicycleCommand implements Command {

    private Toys bicycles;

    public CreateBicycleCommand(Toys bicycles) {
        this.bicycles = bicycles;
    }

    @Override
    public void execute() {
        this.bicycles.createBicycle();
    }
}
