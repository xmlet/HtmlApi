package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumReversedOl implements EnumInterface<String> {
   REVERSED(String.valueOf("reversed"));

   private final String value;

   private EnumReversedOl(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
