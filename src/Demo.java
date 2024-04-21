public class Demo {

    public static String region;


    public static void main(String[] args) {
        welcome();
        initRegion();
        int sum = sum(5,9);
        System.out.println(sum);
        System.out.println(region);

    }

    public static void welcome(){
        System.out.println("Hello world!");
        System.out.println("Welcome to Paris!");
    }

    public static int sum(int number_1, int number_2){
        return number_1 + number_2;
    }

    public static void initRegion(){
        region = "AFRIKA";
    }
}