package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumControlsAudio implements EnumInterface<String> {
   CONTROLS(String.valueOf("controls"));

   private final String value;

   private EnumControlsAudio(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
