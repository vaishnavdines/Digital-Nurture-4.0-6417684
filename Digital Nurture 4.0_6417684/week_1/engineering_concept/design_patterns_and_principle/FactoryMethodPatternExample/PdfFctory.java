package week_1.engineering_concept.design_patterns_and_principle.FactoryMethodPatternExample;

public class PdfFctory  extends DocumentFactory{
    public Document createDocument(){
        return new PdfDocument();
    }

    
}
