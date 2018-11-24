package com.doverdee.thinkinginjava.io;//: io/LargeMappedFiles.java
// Creating a very large file using mapping.
// {RunByHand}
import com.doverdee.thinkinginjava.net.mindview.util.Print;

import java.nio.*;
import java.nio.channels.*;
import java.io.*;

public class LargeMappedFiles {
  static int length = 0x8FFFFFF; // 128 MB
  public static void main(String[] args) throws Exception {
    MappedByteBuffer out =
      new RandomAccessFile("test.dat", "rw").getChannel()
      .map(FileChannel.MapMode.READ_WRITE, 0, length);
    for(int i = 0; i < length; i++)
      out.put((byte)'x');
    Print.print("Finished writing");
    for(int i = length/2; i < length/2 + 6; i++)
      Print.printnb((char)out.get(i));
  }
} ///:~
