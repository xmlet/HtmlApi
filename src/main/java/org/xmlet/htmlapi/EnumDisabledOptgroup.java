package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumDisabledOptgroup implements EnumInterface<String> {
   DISABLED(String.valueOf("disabled"));

   private final String value;

   private EnumDisabledOptgroup(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
