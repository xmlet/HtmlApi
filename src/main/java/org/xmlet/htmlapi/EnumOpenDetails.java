package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumOpenDetails implements EnumInterface<String> {
   OPEN(String.valueOf("open"));

   private final String value;

   private EnumOpenDetails(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
