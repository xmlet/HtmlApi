package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumTypeScript implements EnumInterface<String> {
   TEXT_ECMASCRIPT(String.valueOf("text/ecmascript")),
   TEXT_JAVASCRIPT(String.valueOf("text/javascript")),
   TEXT_JAVASCRIPT1_0(String.valueOf("text/javascript1.0")),
   TEXT_JAVASCRIPT1_1(String.valueOf("text/javascript1.1")),
   TEXT_JAVASCRIPT1_2(String.valueOf("text/javascript1.2")),
   TEXT_JAVASCRIPT1_3(String.valueOf("text/javascript1.3")),
   TEXT_JAVASCRIPT1_4(String.valueOf("text/javascript1.4")),
   TEXT_JAVASCRIPT1_5(String.valueOf("text/javascript1.5")),
   TEXT_JSCRIPT(String.valueOf("text/jscript")),
   TEXT_X_JAVASCRIPT(String.valueOf("text/x-javascript")),
   TEXT_X_ECMASCRIPT(String.valueOf("text/x-ecmascript")),
   TEXT_VBSCRIPT(String.valueOf("text/vbscript"));

   private final String value;

   private EnumTypeScript(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
