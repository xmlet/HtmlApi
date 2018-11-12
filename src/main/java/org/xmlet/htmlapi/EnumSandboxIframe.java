package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumSandboxIframe implements EnumInterface<String> {
   ALLOW_SAME_ORIGIN(String.valueOf("allow-same-origin")),
   ALLOW_FORMS(String.valueOf("allow-forms")),
   ALLOW_SCRIPTS(String.valueOf("allow-scripts"));

   private final String value;

   private EnumSandboxIframe(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
