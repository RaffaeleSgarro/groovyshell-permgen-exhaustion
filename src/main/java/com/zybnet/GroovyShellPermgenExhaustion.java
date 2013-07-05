package com.zybnet;

import groovy.lang.GroovyShell;

public class GroovyShellPermgenExhaustion {
  
  public static void main(String ...args) {
    
    GroovyShell shell = new GroovyShell();
    
    while ( true ) {
      shell.evaluate( " answer = 42 " );
    }
  }
  
}
