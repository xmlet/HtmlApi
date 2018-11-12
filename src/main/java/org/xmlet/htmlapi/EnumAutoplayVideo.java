package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumAutoplayVideo implements EnumInterface<String> {
   AUTOPLAY(String.valueOf("autoplay"));

   private final String value;

   private EnumAutoplayVideo(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
