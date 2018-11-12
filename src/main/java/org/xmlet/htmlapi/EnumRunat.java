package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumRunat implements EnumInterface<String> {
   SERVER(String.valueOf("server"));

   private final String value;

   private EnumRunat(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
