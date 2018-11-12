package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumDir implements EnumInterface<String> {
   LTR(String.valueOf("ltr")),
   RTL(String.valueOf("rtl"));

   private final String value;

   private EnumDir(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
