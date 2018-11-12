package org.xmlet.htmlapi;

import org.xmlet.xsdasm.classes.infrastructure.EnumInterface;

public enum EnumRelLinkType implements EnumInterface<String> {
   ALTERNATE(String.valueOf("Alternate")),
   APPENDIX(String.valueOf("Appendix")),
   BOOKMARK(String.valueOf("Bookmark")),
   CHAPTER(String.valueOf("Chapter")),
   CONTENTS(String.valueOf("Contents")),
   COPYRIGHT(String.valueOf("Copyright")),
   GLOSSARY(String.valueOf("Glossary")),
   HELP(String.valueOf("Help")),
   INDEX(String.valueOf("Index")),
   NEXT(String.valueOf("Next")),
   PREV(String.valueOf("Prev")),
   SECTION(String.valueOf("Section")),
   START(String.valueOf("Start")),
   STYLESHEET(String.valueOf("Stylesheet")),
   SUBSECTION(String.valueOf("Subsection"));

   private final String value;

   private EnumRelLinkType(String var3) {
      this.value = var3;
   }

   public String getValue() {
      return this.value;
   }
}
