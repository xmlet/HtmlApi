package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumAutoplayAudio implements EnumInterface<String> {
   AUTOPLAY(String.valueOf("autoplay"));

   private final String value;

   private EnumAutoplayAudio(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
