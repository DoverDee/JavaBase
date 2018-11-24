package com.doverdee.thinkinginjava.enumerated;//: enumerated/BigEnumSet.java
import java.util.*;

public class BigEnumSet {
  enum Big { A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10,
    A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21,
    A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32,
    A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43,
    A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54,
    A55, A56, A57, A58, A59, A60, A61, A62, A63, A64, A65,
    A66, A67, A68, A69, A70, A71, A72, A73, A74, A75,EA0, EA1,
      EA2, EA3, EA4, EA5, EA6, EA7, EA8, EA9, EA10,
      EA11, EA12, EA13, EA14, EA15, EA16, EA17, EA18, EA19, EA20, EA21,
      EA22, EA23, EA24, EA25, EA26, EA27, EA28, EA29, EA30, EA31, EA32,
      EA33, EA34, EA35, EA36, EA37, EA38, EA39, EA40, EA41, EA42, EA43,
      EA44, EA45, EA46, EA47, EA48, EA49, EA50, EA51, EA52, EA53, EA54,
      EA55, EA56, EA57, EA58, EA59, EA60, EA61, EA62, EA63, EA64, EA65,
      EA66, EA67, EA68, EA69, EA70, EA71, EA72, EA73, EA74, EA75  }
  public static void main(String[] args) {
    EnumSet<Big> bigEnumSet = EnumSet.allOf(Big.class);
    System.out.println(bigEnumSet);
  }
} /* Output:
[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, A22, A23, A24, A25, A26, A27, A28, A29, A30, A31, A32, A33, A34, A35, A36, A37, A38, A39, A40, A41, A42, A43, A44, A45, A46, A47, A48, A49, A50, A51, A52, A53, A54, A55, A56, A57, A58, A59, A60, A61, A62, A63, A64, A65, A66, A67, A68, A69, A70, A71, A72, A73, A74, A75]
*///:~
