package org.xmlet.htmlapi;

public class AttrCheckedEnumCheckedCommand extends BaseAttribute<String> {
   public AttrCheckedEnumCheckedCommand(EnumCheckedCommand attrValue) {
      super(attrValue.getValue(), "checked");
   }
}
