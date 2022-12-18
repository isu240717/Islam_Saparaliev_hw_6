import javax.print.attribute.standard.PrinterInfo;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss ();
        boss.setName("Juggernaut");
        boss.setHealth(500);
        boss.setDefense(100);
        Weapon bossWeapon = new Weapon();
        bossWeapon.setWeaponName("Excalibur");
        bossWeapon.setType(WeaponType.Sword);
        boss.setWeapon(bossWeapon);

        System.out.println(boss.PrintInfo());

        System.out.println("--------------------------------");

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setName("Skeleton");
        skeleton1.setHealth(100);
        skeleton1.setDefense(50);
        skeleton1.setNumberOfArrows(40);
        Weapon SkeletonWeapon = new Weapon();
        SkeletonWeapon.setWeaponName("Super Bow");
        SkeletonWeapon.setType(WeaponType.Bow);
        skeleton1.setWeapon(SkeletonWeapon);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setName("Skeletik");
        skeleton2.setHealth(90);
        skeleton2.setDefense(60);
        skeleton2.setNumberOfArrows(50);
        Weapon Skeleton2Weapon = new Weapon();
        SkeletonWeapon.setWeaponName("Light Bow");
        SkeletonWeapon.setType(WeaponType.Bow);
        skeleton2.setWeapon(SkeletonWeapon);

        System.out.println(skeleton1.PrintInfo());
        System.out.println("--------------------------------");
        System.out.println(skeleton2.PrintInfo());
    }
}