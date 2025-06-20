package week_1.engineering_concept.design_patterns_and_principle.FactoryMethodPatternExample;

public class ExcelFactory  extends DocumentFactory{
    public Document createDocument(){
        return new ExcelDocument();
    }

    
}
