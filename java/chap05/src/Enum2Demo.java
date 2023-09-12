public class Enum2Demo {
    public static void main(String[] args) {
        Gender2 gender = Gender2.FEMALE;
        if(gender == Gender2.MALE)
            System.out.println(Gender2.MALE + "는 병역 의무가 있다.");
        else
            System.out.println(Gender2.FEMALE + "는 병역 의무가 없다.");

        for(Gender2 g:Gender2.values())
            System.out.println(g.name());
        
        System.out.println(Gender2.valueOf("MALE"));
    }
}

enum Gender2{
    MALE("남성"), FEMALE("여성");

    private String s;

    Gender2(String s){
        this.s = s;
    }

    public String toString(){
        return s;
    }
}



