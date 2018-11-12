package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumShapeArea implements EnumInterface<String> {
   RECT(String.valueOf("rect")),
   CIRCLE(String.valueOf("circle")),
   POLY(String.valueOf("poly")),
   DEFAULT(String.valueOf("default"));

   private final String value;

   private EnumShapeArea(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
