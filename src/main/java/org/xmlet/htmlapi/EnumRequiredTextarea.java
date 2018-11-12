package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumRequiredTextarea implements EnumInterface<String> {
   REQUIRED(String.valueOf("required"));

   private final String value;

   private EnumRequiredTextarea(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
