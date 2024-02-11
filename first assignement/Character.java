import Abilities.Ability;

public class Character {
    private Ability ability;

    public void setAbility(Ability ability){
        this.ability=ability;

    }

    public void useAbility()
    {
        if (ability !=null) {
            ability.performAbility();
        }
    }
}
