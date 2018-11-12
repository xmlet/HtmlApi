package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumAutocompleteForm implements EnumInterface<String> {
   ON(String.valueOf("on")),
   OFF(String.valueOf("off"));

   private final String value;

   private EnumAutocompleteForm(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
