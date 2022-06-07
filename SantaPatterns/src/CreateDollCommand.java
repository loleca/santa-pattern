public class CreateDollCommand implements Command {

    private Toys dolls;

    public CreateDollCommand(Toys dolls) {
        this.dolls = dolls;
    }

    @Override
    public void execute() {
       this.dolls.createDoll();
    }
}
