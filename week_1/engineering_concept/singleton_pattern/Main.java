package week_1.engineering_concept.singleton_pattern;

public class Main {
    public static void main(String[]args){
    logger logger1=logger.getInstance();
    logger logger2=logger.getInstance();

    logger1.log("First message");
    logger2.log("Second message");
    
    if (logger1==logger2){
        System.out.println("Only one logger Instance is used.");
    }else{
        System.out.println("different instance were created");
    }

}
}