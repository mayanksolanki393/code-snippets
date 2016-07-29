```java
class MainClass{
    private HelpingClass helperObject = new HelpingClass();
    
    public static void main(String args[]){
        // MainClass method depends on the HelpingClass object for its working
        helperObject.helpingMethod();
    }
}

class HelpingClass{
    public void helpingMethod(){
        //helping reusable logic
    }
}
```
