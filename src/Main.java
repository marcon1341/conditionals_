public class Main {
    public static void go(int age){
        if (age >= 18) {
            System.out.println("go vote!");
        }else{
                System.out.println("go play");

        }
    }

    public static void respond(char answer){
        if(answer == 'y' || answer == 'Y') {
            System.out.println("YUP YUP");
        }
        else{
            System.out.println("NOP NOP NOP");
        }

    }
    public static void drink(int age){
        if(age < 7){
            System.out.println("milk");
        }
        else if(age < 21){
            System.out.println("juice");
        }else if(age < 50) {
            System.out.println("adult beverage");
        }else if(age < 70) {
            System.out.println("light beverage");
        }else{
            System.out.println("tea");
        }
    }

    public static void eat(char hungry){
        if(hungry == 'Y' || hungry =='y') {
            System.out.println("I want eat");
        } else{
            System.out.println("I don't eat");

        }
    }

    public static void Grade(int score){
        if(score > 95) {
            System.out.println("A");
        }else if(score > 88) {
            System.out.println("B");
        }else if(score >= 80) {
            System.out.println("C");
        }else{
            System.out.println("FAIL");
        }
    }
    public static void main(String[] args){

        drink(5);//milk
        drink(11);//juice
        drink(25);//adult beverage
        drink(55);//light beverage
        drink(99);//tea
        go(13);
        go(21);
        eat('y');
        eat('n');

        respond('y');
        respond('N');
        Grade(96);//A
        Grade(91);//B
        Grade(80);//C
        Grade(77);//fail

    }
}