package dk.cphbusiness.fp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RpnCalculator {
  private final Stack<Integer> stack = new PathStack<>();
  
  public void run() {
    try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
      String line = in.readLine();
      while (line != null) {
        String[] parts = line.split(" ");
        for (String part : parts) {
          // Do the stuff for each part here...
          
          
          }
        line = in.readLine();
        }
      }
    catch (IOException ioe) {
      System.out.println("Oups: "+ioe.getMessage());
      }
    }
  
  public static void main(String[] args) {
    // Quick and dirty way to run calculator
    new RpnCalculator().run();
    }
  
  
  }
