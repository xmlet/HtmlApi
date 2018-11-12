package org.xmlet.htmlapi;

public class AttrSelectedEnumSelectedOption extends BaseAttribute<String> {
   public AttrSelectedEnumSelectedOption(EnumSelectedOption attrValue) {
      super(attrValue.getValue(), "selected");
   }
}
