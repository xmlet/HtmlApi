package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumIsmapImg implements EnumInterface<String> {
   ISMAP(String.valueOf("ismap"));

   private final String value;

   private EnumIsmapImg(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
