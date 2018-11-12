package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumDraggable implements EnumInterface<String> {
   TRUE(String.valueOf("true")),
   FALSE(String.valueOf("false")),
   AUTO(String.valueOf("auto"));

   private final String value;

   private EnumDraggable(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
