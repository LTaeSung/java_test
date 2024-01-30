package gameExample;

public class Character{

    private String name;
    private int hp;
    private int power;
    Character(String name, int hp, int power){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public void attack(Character target){
        //int hp = target.getHp() - this.power;
        //if(hp < 0) hp = 0;
        //target.setHp(hp);
        target.setHp(target.getHp() - this.power);
    }
}
