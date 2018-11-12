package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumSelectedOption implements EnumInterface<String> {
   SELECTED(String.valueOf("selected"));

   private final String value;

   private EnumSelectedOption(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
