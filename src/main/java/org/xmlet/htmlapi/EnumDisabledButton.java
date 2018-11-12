package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumDisabledButton implements EnumInterface<String> {
   AUTOFOCUS(String.valueOf("autofocus"));

   private final String value;

   private EnumDisabledButton(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
