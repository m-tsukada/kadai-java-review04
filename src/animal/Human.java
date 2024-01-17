package animal;

import animal.Thinkable;

public class Human extends Animal implements Thinkable {

    private String hobby;
    
    // 変数なしコンストラクタ
    public Human () {
        
    }
    // 変数ありコンストラクタ
    public Human(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    // getter setter
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public void think() {
        System.out.println("私は" + getHobby() + "について考えています。" );
    }
}
