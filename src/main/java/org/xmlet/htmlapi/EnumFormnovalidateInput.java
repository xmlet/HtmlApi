package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumFormnovalidateInput implements EnumInterface<String> {
   FORMNOVALIDATE(String.valueOf("formnovalidate"));

   private final String value;

   private EnumFormnovalidateInput(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
