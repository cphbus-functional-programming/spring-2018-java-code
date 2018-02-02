package dk.cphbusiness.fp;

public class ArrayStack<T> implements Stack<T> {
  private final T[] elements;
  private int top = 0;
  
  public ArrayStack(int maxSize) {
    elements = (T[])new Object[maxSize];
    }
  
  @Override
  public void push(T element) {
    elements[top++] = element;
    }

  @Override
  public T pop() {
    return elements[--top];
    }

  @Override
  public boolean isEmpty() {
    return top == 0;
    }

  }
