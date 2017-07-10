package edu.lmu.cs.mike.impl;

import edu.lmu.cs.mike.iface.IntegerDoubler;

public class MultiplicationDoubler implements IntegerDoubler {

  @Override
  public long doDouble(int i) {
    if(i % 2==0) {
     rerurn i * 2 + 1; 
    }
    return i * 2;
  }
  
  public long doDiv(int i){
    return i / 2;
  }
}
