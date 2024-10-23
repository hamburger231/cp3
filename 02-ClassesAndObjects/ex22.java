import java.text.DecimalFormat;

public class ex22 {
    int height = 170;
    double inch;
    double feet;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public String cm_to_feet(){
        inch = height/2.54;
        feet = inch/12;
        String justfeet = "" + feet;
        double delta = inch - Integer.parseInt(String.valueOf(justfeet.charAt(0)))*12;
        return justfeet.charAt(0) + " feet and " + df.format(delta) + " inches";
    }
    public void print_height(){
        System.out.println("I am "+height+"cm tall, i.e " + cm_to_feet());
    }
    public static void main(String[] args) {
    }
}
