package week_1.engineering_concept.singleton_pattern;

public class logger {
    private static logger instance;
    private logger(){
        System.out.println("logger Initialized>");
    }
    public static logger getInstance(){
        if (instance == null){
            instance = new logger();
        
        }
        return instance;
    }
    public void log(String message){
        System.out.println("log: "+ message);
    }

    
}
