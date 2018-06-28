package AlgorithmsAndMisc.Generics;

import java.util.ArrayList;
import java.util.List;

import AlgorithmsAndMisc.Generics.GenericClasses.OrderedPair;
import AlgorithmsAndMisc.Generics.GenericClasses.Pair;
import AlgorithmsAndMisc.Generics.GenericTypes.BoxType;
import AlgorithmsAndMisc.Generics.GenericClasses.BoxClass;


public class Exercises {


public static void main(String args[]) {
    /* 1.Write a generic method to count the number of elements in a collection that have a specific property (for example, odd integers, prime numbers, palindromes).*/

    List<String> list = new ArrayList<String>();

    list.add("Hello");

    String s = list.get(0);

    // BoxType generic Type that accepts objects

    List<BoxType> boxType = new ArrayList<BoxType>();

 //   boxType.add();


    BoxClass<Integer> integerBox; // a reference

    BoxClass <Integer> integerBoxInst = new BoxClass<Integer>();

    //


    Pair<String,Integer> p1 = new OrderedPair<String, Integer>("Even",8);

    // Can be shortened
    Pair <String, String> p2 = new OrderedPair<>("Hello","World");




}


}
