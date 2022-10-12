public class Friend {

    private String name = "A friend";
    private int hp = 100;

    // Constructors

    public Friend() {

    }

    public Friend(String name) {
        this.name = name;
    }

    public Friend(String name, boolean isFriend) {
        this.name = name;
    }

    //Methods
    public void hit(int damage) {
        this.hp = this.hp - damage;

    }


    // Getters Setters
    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}