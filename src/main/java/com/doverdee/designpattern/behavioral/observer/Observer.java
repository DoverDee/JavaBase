package com.doverdee.designpattern.behavioral.observer;

interface Observer{
  String getName();

  void update();

  void feedback(Subject subject, String name);
}
