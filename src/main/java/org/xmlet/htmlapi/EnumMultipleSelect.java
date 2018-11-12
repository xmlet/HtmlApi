package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumMultipleSelect implements EnumInterface<String> {
   MULTIPLE(String.valueOf("multiple"));

   private final String value;

   private EnumMultipleSelect(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
