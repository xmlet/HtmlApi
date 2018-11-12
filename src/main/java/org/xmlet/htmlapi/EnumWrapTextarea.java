package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumWrapTextarea implements EnumInterface<String> {
   HARD(String.valueOf("hard")),
   SOFT(String.valueOf("soft"));

   private final String value;

   private EnumWrapTextarea(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
