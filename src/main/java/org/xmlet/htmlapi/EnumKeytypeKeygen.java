package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumKeytypeKeygen implements EnumInterface<String> {
   RSA(String.valueOf("rsa"));

   private final String value;

   private EnumKeytypeKeygen(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
