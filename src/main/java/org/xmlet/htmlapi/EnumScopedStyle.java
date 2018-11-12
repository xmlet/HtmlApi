package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumScopedStyle implements EnumInterface<String> {
   SCOPED(String.valueOf("scoped"));

   private final String value;

   private EnumScopedStyle(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
