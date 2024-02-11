import Abilities.Ability;
import Abilities.FireballAbility;
import Abilities.HealingAbility;
public class Main {
    public static void main(String[] args) {
        
        Character khan=new Character();
        khan.setAbility(new FireballAbility());
        khan.useAbility();
        


        Character najib=new Character();
        najib.setAbility(new HealingAbility());
        najib.useAbility();

    }
}
