package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumHidden implements EnumInterface<String> {
   HIDDEN(String.valueOf("hidden"));

   private final String value;

   private EnumHidden(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
