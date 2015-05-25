package junit.exercises.interfacesample.strategy;

// インターフェースを継承したCapitalizeFilterを作成    
public class CapitalizeFilter implements MyFilter {
    @Override    
    public String doJob(String input) {    
        return input.toUpperCase();        
    }    
}
