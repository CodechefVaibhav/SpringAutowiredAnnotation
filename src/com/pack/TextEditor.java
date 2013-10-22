package com.pack;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
   @Autowired
   private SpellChecker spellChecker;

   /**If @Autowired is used with variable then we don't need setter method for that variable
    * it is automatically handled at run time as like we have commented out setter method
    * spellchecker variable since @Autowired is used with "SpellChecker spellChecker" */
//   @Autowired
//   public void setSpellChecker( SpellChecker spellChecker ){
//      this.spellChecker = spellChecker;
//   }
   public SpellChecker getSpellChecker( ) {
      return spellChecker;
   }
   public void spellCheck() {
      spellChecker.checkSpelling();
   }
}
