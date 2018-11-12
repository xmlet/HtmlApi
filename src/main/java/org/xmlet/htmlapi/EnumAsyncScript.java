package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumAsyncScript implements EnumInterface<String> {
   ASYNC(String.valueOf("async"));

   private final String value;

   private EnumAsyncScript(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
