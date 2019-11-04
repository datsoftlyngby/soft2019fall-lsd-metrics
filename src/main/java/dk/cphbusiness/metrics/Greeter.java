package dk.cphbusiness.metrics;

public class Greeter {
  public String sayHell(String name) {
    StringBuilder result = new StringBuilder();
    if (name == null || name.trim().isEmpty() ) {
      result.append("Please give a proper name");
      }
    else {
      result.append("Hello "+name+"!");
      }
    return result.toString();
    }
  
}
