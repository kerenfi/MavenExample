package edu.lmu.cs.mike.impl;

import edu.lmu.cs.mike.iface.IntegerDoubler;

public class MultiplicationDoubler implements IntegerDoubler {

  @Override
  public long doDouble(int i) {
    if(i * 2 % 2==1) {
     return i * 2; 
    }
    return i * 2;
  }
}
