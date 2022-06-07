

public class SantaClaus {
    Toys toys = new Toys();
    Command createDoll = new CreateDollCommand(toys);
    Command createBicycle = new CreateBicycleCommand(toys);
    private static SantaClaus instance;
    private Command command;

    private SantaClaus(String santaSays) {
        System.out.println(santaSays);
        if(santaSays=="I need dolls."){
            setCommand(createDoll);
            chooseToy();
        }
        if(santaSays=="I need bicycles."){
            setCommand(createBicycle);
            chooseToy();
        }
    }

    public static SantaClaus getInstance(String santaSays) {

        if(instance == null) {
            instance = new SantaClaus(santaSays);
        }

        return instance;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void chooseToy() {
        if(this.command == null) {
            System.out.println("No command set");
            return;
        }
        this.command.execute();
    }

}
