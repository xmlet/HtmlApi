package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumAutobufferVideo implements EnumInterface<String> {
   AUTOBUFFER(String.valueOf("autobuffer"));

   private final String value;

   private EnumAutobufferVideo(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
