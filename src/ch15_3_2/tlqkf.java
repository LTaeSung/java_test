package ch15_3_2;

public class tlqkf {
    public static void main(String[] args) {
        Marin m = new Marin("마린", 100);
        m.simpack();
    }
}
    class Marin{
        String name;
        int hp;

        public Marin(String s, int i){
            name = s;
            hp = i;
        }

        public void simpack(){
            System.out.print(name + "의 스팀팩! HP: "+hp+" -> ");
            hp = hp - 10;
            System.out.println(hp);
        }
    }




