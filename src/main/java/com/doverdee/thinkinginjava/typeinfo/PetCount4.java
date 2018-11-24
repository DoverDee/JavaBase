package com.doverdee.thinkinginjava.typeinfo;//: typeinfo/PetCount4.java
import com.doverdee.thinkinginjava.net.mindview.util.Print;
import com.doverdee.thinkinginjava.net.mindview.util.TypeCounter;
import com.doverdee.thinkinginjava.typeinfo.pets.Pet;
import com.doverdee.thinkinginjava.typeinfo.pets.Pets;

public class PetCount4 {
  public static void main(String[] args) {
    TypeCounter counter = new TypeCounter(Pet.class);
    for(Pet pet : Pets.createArray(20)) {
      Print.printnb(pet.getClass().getSimpleName() + " ");
      counter.count(pet);
    }
    Print.print();
    Print.print(counter);
  }
} /* Output: (Sample)
Rat Manx Cymric Mutt Pug Cymric Pug Manx Cymric Rat EgyptianMau Hamster EgyptianMau Mutt Mutt Cymric Mouse Pug Mouse Cymric
{Mouse=2, Dog=6, Manx=7, EgyptianMau=2, Rodent=5, Pug=3, Mutt=3, Cymric=5, Cat=9, Hamster=1, Pet=20, Rat=2}
*///:~
