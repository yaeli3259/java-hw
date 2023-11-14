/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.List;
import java.util.Random;

/**
 *
 * @author yaeli barda
 */
public class GameUtil {
static List<String> sentences;
static String sentence;
public static StringBuilder sentenceToShow=new StringBuilder();
public static int numOfTrying;
 public static void chooseSentence()
 {
     Random rand=new Random();
     sentence=sentences.get(rand.nextInt(sentences.size()));
 }
 public static void initSentenceToShow()
 {
     for (int i = 0; i <sentence.length(); i++) {
         if(sentence.charAt(i) == ' ')
             sentenceToShow.append(' '); 
         else
         {
         sentenceToShow.append('_');
         }
     }
 }
 public static void updateSentenceToShow(char letter)
 {
     for (int i = 0; i < sentence.length(); i++) {
         if(sentence.charAt(i) == letter)
             sentenceToShow.setCharAt(i, letter);
     }
 }
 public static void increaseNumOfTrying()
 {
    numOfTrying+=1; 
 }
 public static boolean checkWinning()
 {
     for (int i = 0; i <sentence.length(); i++) {
         if(sentenceToShow.charAt(i)==' ')
             return false;
     }
 return true;
 }
 static{
     sentences.add("ice cream is good for nervouse people");
     sentences.add("first in first out");
     sentences.add("good music can affect your deeds!");
     sentences.add("five minutes of laugh give one hour of life!");
     sentences.add("just smile and everything get change");
     sentences.add("hapiness come from the inside! out!");
     initSentenceToShow();
     chooseSentence();
     numOfTrying=0;
 }
}
