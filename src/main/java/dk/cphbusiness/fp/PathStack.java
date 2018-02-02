package dk.cphbusiness.fp;

public class PathStack<T> implements Stack<T> {
  private Path<T> elements = null;
  
  @Override
  public void push(T element) {
    elements = new LinkedPath<>(element, elements);
    }

  @Override
  public T pop() {
    T element = elements.getFirst();
    elements = elements.getRest();
    return element;
    }

  @Override
  public boolean isEmpty() {
    return elements == null;
    }
  

  }
