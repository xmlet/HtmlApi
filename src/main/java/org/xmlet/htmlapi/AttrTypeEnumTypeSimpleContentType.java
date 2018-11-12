package org.xmlet.htmlapi;

public class AttrTypeEnumTypeSimpleContentType extends BaseAttribute<String> {
   public AttrTypeEnumTypeSimpleContentType(EnumTypeSimpleContentType attrValue) {
      super(attrValue.getValue(), "type");
   }
}
