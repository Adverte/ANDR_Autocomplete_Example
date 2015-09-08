package com.example.test1;

import java.util.Scanner;

public class IrregularVerb {
      private String infinitive;
      private String pastSimple;
      private String pastParticiple;

      public IrregularVerb(String input) {
            super();
            setVerbs(input);
      }
      public void setVerbs(String input) {
      //¬ыделим три формы глагола из одной строки
            Scanner scanner = new Scanner(input);
            infinitive = scanner.next();
            pastSimple= scanner.next();
            pastParticiple = scanner.next();
      }
      public String getInfinitive() {
            return infinitive;
      }
      public void setInfinitive(String infinitive) {
            this.infinitive = infinitive;
      }
      public String getPastSimple() {
            return pastSimple;
      }
      public void setPastSimple(String pastSimple) {
            this.pastSimple = pastSimple;
      }
      public String getPastParticiple() {
            return pastParticiple;
      }
      public void setPastParticiple(String pastParticiple) {
            this.pastParticiple = pastParticiple;
      }
      //¬ажно правильно переопределить toString(),
      //так как автозаполнение
      //использует этот метод
      @Override
      public String toString() {
            String result = String.format("%s - %s - %s", infinitive,
                                        pastSimple, pastParticiple);
            return result;
      }
}