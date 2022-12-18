public class GameEntity {

    private int Health;

    private int Damage;

    private String Name;

    private int Defense;

    public GameEntity() {

    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getDefense() {
        return Defense;
    }

    public void setDefense(int bossDefense) {
        Defense = bossDefense;
    }
    public GameEntity(String name, int health, int attack, int defense) {
        this.Name = name;
        this.Health = health;
        this.Damage = attack;
        this.Defense = defense;
    }
}
