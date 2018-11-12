package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumMediaMediaType implements EnumInterface<String> {
   SCREEN(String.valueOf("screen")),
   PRINT(String.valueOf("print")),
   TTY(String.valueOf("tty")),
   TV(String.valueOf("tv")),
   PROJECTION(String.valueOf("projection")),
   HANDHELD(String.valueOf("handheld")),
   BRAILLE(String.valueOf("braille")),
   AURAL(String.valueOf("aural")),
   ALL(String.valueOf("all"));

   private final String value;

   private EnumMediaMediaType(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
