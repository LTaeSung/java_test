package gameExample;

public class Bettle {
    public static void main(String[] args){
        Character ryu = new Character("류",100,10);
        Character ken = new Character("캔",90,15);
        //a.setName(); ,
        //a.setHp();
        //a.setPower() 매번해줘야 하기 때문에 생성자로 작성한다

        while (true){
            int random = (int)(Math.random()*2);
            Character own, target;
            if(random ==0){
                own = ryu; target = ken;
                //ryu.attack(ken);
            }else {
                //ken.attack(ryu);
                own = ken; target = ryu;
            }
            own.attack(target);

            if(own.getHp()==0 || target.getHp() ==0){
                //if(own.getHp()==0) System.out.println(target.getName());
                //if(target.getHp()==0) System.out.println(own.getName());
                break;
            }
        }
        System.out.println(ryu.getName()+":"+ryu.getHp());
        System.out.println(ken.getName()+":"+ken.getHp());

    }
}
