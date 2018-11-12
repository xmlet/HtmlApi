package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumContenteditable implements EnumInterface<String> {
   TRUE(String.valueOf("true")),
   FALSE(String.valueOf("false"));

   private final String value;

   private EnumContenteditable(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
