package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumDisabledTextarea implements EnumInterface<String> {
   DISABLED(String.valueOf("disabled"));

   private final String value;

   private EnumDisabledTextarea(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
