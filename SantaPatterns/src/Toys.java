public class Toys {

    Topic topic = new Topic();
    Observer elves = new MagicBoard("Elves");

    public void createDoll() {
    topic.subscribe(elves);
    topic.setTopic("Dolls");

    }

    public void createBicycle() {
        topic.subscribe(elves);
        topic.setTopic("Bicycles");
    }
}
