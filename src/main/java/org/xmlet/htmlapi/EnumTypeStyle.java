package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumTypeStyle implements EnumInterface<String> {
   TEXT_CSS(String.valueOf("text/css"));

   private final String value;

   private EnumTypeStyle(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
