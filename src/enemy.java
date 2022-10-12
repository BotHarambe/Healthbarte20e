public class enemy {

    private String name = "A friend";
    private int hp = 100;

    public enemy() {

    }

    public enemy(String name) {
        this.name = name;
    }

    public enemy(String name, boolean isFriend) {
        this.name = name;
    }

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