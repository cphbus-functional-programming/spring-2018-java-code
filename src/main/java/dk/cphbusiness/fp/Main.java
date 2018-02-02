package dk.cphbusiness.fp;

public class Main {
  
  private static int sum(Path<Integer> l) {
    if (l == null) return 0;
    return l.getFirst() + sum(l.getRest());
    }

  public static void main(String[] args) {
    // Path<Integer> numbers = new LinkedPath<>(13, null);
    // numbers = new LinkedPath<>(9, numbers);
    // numbers = new LinkedPath<>(7, numbers);
    
    Path<Integer> numbers = LinkedPath.create(7, 9, 13);
    
    System.out.println("The sum is "+sum(numbers));
    
    // Stack<String> names = new ArrayStack<>(10);
    Stack<String> names = new PathStack<>();
    names.push("Kurt");
    names.push("Sonja");
    names.push("Ib");
    
    while (!names.isEmpty()) {
      String name = names.pop();
      System.out.println("Name was: "+name);
      }
    
    
    }
  
  }
