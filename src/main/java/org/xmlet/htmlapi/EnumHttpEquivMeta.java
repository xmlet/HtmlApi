package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumHttpEquivMeta implements EnumInterface<String> {
   CONTENT_LANGUAGE(String.valueOf("content-language")),
   CONTENT_TYPE(String.valueOf("content-type")),
   DEFAULT_STYLE(String.valueOf("default-style")),
   REFRESH(String.valueOf("refresh"));

   private final String value;

   private EnumHttpEquivMeta(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
