import javax.lang.model.element.Name;

public class Boss extends GameEntity{
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String PrintInfo() {
        return "Name: " + getName() + "\nHealth: " + getHealth() + " \nDefense: " + getDefense() + "\nWeapon: " + "Weapon name: " + weapon.getWeaponName() + " | " +  "Weapon type: " + weapon.getType() ;
    }
}
