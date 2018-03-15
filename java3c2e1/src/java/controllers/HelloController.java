package controllers;

public class HelloController {
    
    private HelloController() {
        
    }
    
    private static final class SingletonHolder {
        private static final HelloController SINGLETON = new HelloController();
    }
    
    public static HelloController getInstance() {
        return SingletonHolder.SINGLETON;
    }
    
    public String getName() {
        return "John";
    }
}
