package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumDeferScript implements EnumInterface<String> {
   DEFER(String.valueOf("defer"));

   private final String value;

   private EnumDeferScript(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
