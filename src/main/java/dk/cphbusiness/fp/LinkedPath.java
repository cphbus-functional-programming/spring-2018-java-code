package dk.cphbusiness.fp;

public class LinkedPath<T> implements Path<T> {
  private final T first;
  private final Path<T> rest;
  
  public LinkedPath(T first, Path<T> rest) {
    this.first = first;
    this.rest = rest;
    }
  
  public static <T> Path<T> create(T... elements) {
    return create(elements, 0);
    }

  private static <T> Path<T> create(T[] elements, int index) {
    if (elements.length == index) return null;
    Path<T> path = new LinkedPath<>(elements[index], create(elements, index + 1));
    return path;
    }
  
  @Override
  public T getFirst() {
    return first;
    }

  @Override
  public Path<T> getRest() {
    return rest;
    }

  }
