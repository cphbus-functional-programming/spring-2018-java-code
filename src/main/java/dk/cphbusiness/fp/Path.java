package dk.cphbusiness.fp;

public interface Path<T> {
  T getFirst();
  Path<T> getRest();
  }
