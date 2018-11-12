package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumSeamlessIframe implements EnumInterface<String> {
   SEAMLESS(String.valueOf("seamless"));

   private final String value;

   private EnumSeamlessIframe(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
