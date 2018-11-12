package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumCheckedInput implements EnumInterface<String> {
   CHECKED(String.valueOf("checked"));

   private final String value;

   private EnumCheckedInput(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
