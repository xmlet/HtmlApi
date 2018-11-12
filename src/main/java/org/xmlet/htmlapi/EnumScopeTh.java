package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumScopeTh implements EnumInterface<String> {
   COL(String.valueOf("col")),
   COLGROUP(String.valueOf("colgroup")),
   ROW(String.valueOf("row")),
   ROWGROUP(String.valueOf("rowgroup"));

   private final String value;

   private EnumScopeTh(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
