package org.xmlet.htmlapi;

public class AttrTypeEnumTypeCommand extends BaseAttribute<String> {
   public AttrTypeEnumTypeCommand(EnumTypeCommand attrValue) {
      super(attrValue.getValue(), "type");
   }
}
