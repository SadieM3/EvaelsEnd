package EvaelsEnd;

public class character {

    private String name;
    private int hp;
    private int attackPower;
    private int magic;

    public character(String name, int hp, int attackPower, int magic){
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        this.magic = magic;
    }

    public String getName(){
        return name;
    }

    public int getHp(){
        return hp;
    }

    public int getAttackPower(){
        return attackPower;
    }

    public int getMagic(){
        return magic;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setHp(int newHp){
        hp = newHp;
    }

    public void setAttackPower(int newAttackPower){
        attackPower = newAttackPower;
    }

    public void setMagic(int newMagic){
        magic = newMagic;
    }

    public int NPCattack(){
        int charge = 0;
        int move = (int)Math.round(2 * Math.random());

        if (move == 0){
            System.out.println("Missed!");
        }
        else if(move == 1){
            System.out.println(name + " attacks!");
            return this.getAttackPower();
        }
        else{
            System.out.println("Charging Ultimate Spell!");
            charge += 50;
            if (this.getMagic() == charge){
                System.out.println(name + " fires their special attack!");
                return this.getMagic() * 2;
            }
        }
        return -1;
    }

    //public int playerAttack(Scanner keyboard){

    //}




}
