package org.xmlet.htmlapi;

public class AttrTypeEnumTypeContentType extends BaseAttribute<String> {
   public AttrTypeEnumTypeContentType(EnumTypeContentType attrValue) {
      super(attrValue.getValue(), "type");
   }
}
