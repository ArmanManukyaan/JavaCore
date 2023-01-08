package chapter5;

public class classSwitch {
    public static void main(String[] args) {
        int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "zima";
                break;
            case 3:
            case 4:
            case 5:
                season = "vesna";
                break;
            case 6:
            case 7:
            case 8:
                season = "letu";
                break;
            case 9:
            case 10:
            case 11:
                season = "oseni";
                break;
            default:
                season = "vmishliveni mesyaci";


        }
        System.out.println("aprel atnositya  k " + season + ".");
    }

}

