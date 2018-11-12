package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumTypeSimpleContentType implements EnumInterface<String> {
   TEXT_ASP(String.valueOf("text/asp")),
   TEXT_ASA(String.valueOf("text/asa")),
   TEXT_HTML(String.valueOf("text/html")),
   TEXT_PLAIN(String.valueOf("text/plain")),
   TEXT_XML(String.valueOf("text/xml"));

   private final String value;

   private EnumTypeSimpleContentType(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
