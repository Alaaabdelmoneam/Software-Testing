
public class Greeting{
    private String Message;
    public Greeting(String msg) {
        this.Message = msg;
    }
    private void setString(String msg){
        this.Message = msg;
    }
    private void printMessage(){
        System.out.println(this.Message);
    }
    public static void main(String[] args){
        Greeting greet = new Greeting("");
        for (String arg : args) {
            greet.setString(arg);
            greet.printMessage();
        }
    }
}
