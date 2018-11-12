package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumFormmethodButton implements EnumInterface<String> {
   GET(String.valueOf("get")),
   POST(String.valueOf("post")),
   PUT(String.valueOf("put")),
   DELETE(String.valueOf("delete"));

   private final String value;

   private EnumFormmethodButton(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
