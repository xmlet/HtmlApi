package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumTypeCommand implements EnumInterface<String> {
   COMMAND(String.valueOf("command")),
   CHECKBOX(String.valueOf("checkbox")),
   RADIO(String.valueOf("radio"));

   private final String value;

   private EnumTypeCommand(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
