package chapter5;

public class classStringSwitch {
    public static void main(String[] args) {
        String str = "dva";
        switch (str){
            case "odin":
                System.out.println("odin");
                break;
            case "dva":
                System.out.println("dva");
                break;
            case "tre":
                System.out.println("tre");
                break;

            default:
                System.out.println("ne savpalo");
                break;

        }

    }
}
