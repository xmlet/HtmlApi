package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumNovalidateForm implements EnumInterface<String> {
   NOVALIDATE(String.valueOf("novalidate"));

   private final String value;

   private EnumNovalidateForm(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
