package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumAutofocusButton implements EnumInterface<String> {
   AUTOFOCUS(String.valueOf("autofocus"));

   private final String value;

   private EnumAutofocusButton(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
