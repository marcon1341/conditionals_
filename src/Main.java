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
        if(age < 21){
            System.out.println("juice");
        }else if(age < 50){
            System.out.println("adult beverage");
        }else{
            System.out.println("tea");
        }
    }
    public static void main(String[] args){

        drink(11);//juice
        drink(25);//adult beve
        drink(99);//tea
        go(13);
        go(21);

        respond('y');
        respond('N');

    }
}