public class MagicBoard implements Observer {

    private String name;
    private Observable topic;

    public MagicBoard(String name) {
        this.name = name;
    }

    public void update() {

        String lastTopic = this.topic.getUpdate();
        System.out.println("The display on the magick board shows: " + lastTopic);

        Workshop toyFactory = new ToyFactory();
        ToyProduct toy = toyFactory.produceProduct(lastTopic);
    }

    public void setTopic(Observable topic) {
        this.topic = topic;
    }
}
