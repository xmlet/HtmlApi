package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumTypeMenu implements EnumInterface<String> {
   CONTEXT(String.valueOf("context")),
   TOOLBAR(String.valueOf("toolbar")),
   LIST(String.valueOf("list"));

   private final String value;

   private EnumTypeMenu(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
