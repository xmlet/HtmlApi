package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumTargetBrowsingContext implements EnumInterface<String> {
   _BLANK(String.valueOf("_blank")),
   _PARENT(String.valueOf("_parent")),
   _SELF(String.valueOf("_self")),
   _TOP(String.valueOf("_top"));

   private final String value;

   private EnumTargetBrowsingContext(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
