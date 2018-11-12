package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumReadonlyTextarea implements EnumInterface<String> {
   READONLY(String.valueOf("readonly"));

   private final String value;

   private EnumReadonlyTextarea(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
