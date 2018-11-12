package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumFormenctypeInput implements EnumInterface<String> {
   MULTIPART_FORM_DATA(String.valueOf("multipart/form-data")),
   APPLICATION_X_WWW_FORM_URLENCODED(String.valueOf("application/x-www-form-urlencoded")),
   TEXT_PLAIN(String.valueOf("text/plain"));

   private final String value;

   private EnumFormenctypeInput(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
