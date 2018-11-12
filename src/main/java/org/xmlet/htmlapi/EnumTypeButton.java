package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumTypeButton implements EnumInterface<String> {
   BUTTON(String.valueOf("button")),
   RESET(String.valueOf("reset")),
   SUBMIT(String.valueOf("submit"));

   private final String value;

   private EnumTypeButton(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
