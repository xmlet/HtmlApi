package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumLoopAudio implements EnumInterface<String> {
   LOOP(String.valueOf("loop"));

   private final String value;

   private EnumLoopAudio(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
