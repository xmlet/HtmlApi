package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumTypeInput implements EnumInterface<String> {
   BUTTON(String.valueOf("button")),
   CHECKBOX(String.valueOf("checkbox")),
   COLOR(String.valueOf("color")),
   DATE(String.valueOf("date")),
   DATETIME(String.valueOf("datetime")),
   DATETIME_LOCAL(String.valueOf("datetime-local")),
   EMAIL(String.valueOf("email")),
   FILE(String.valueOf("file")),
   HIDDEN(String.valueOf("hidden")),
   IMAGE(String.valueOf("image")),
   MONTH(String.valueOf("month")),
   NUMBER(String.valueOf("number")),
   PASSWORD(String.valueOf("password")),
   RADIO(String.valueOf("radio")),
   RANGE(String.valueOf("range")),
   RESET(String.valueOf("reset")),
   SEARCH(String.valueOf("search")),
   SUBMIT(String.valueOf("submit")),
   TEXT(String.valueOf("text")),
   TEL(String.valueOf("tel")),
   TIME(String.valueOf("time")),
   URL(String.valueOf("url")),
   WEEK(String.valueOf("week"));

   private final String value;

   private EnumTypeInput(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
