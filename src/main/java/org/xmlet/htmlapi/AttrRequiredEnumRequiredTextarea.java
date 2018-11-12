package org.xmlet.htmlapi;

public class AttrRequiredEnumRequiredTextarea extends BaseAttribute<String> {
   public AttrRequiredEnumRequiredTextarea(EnumRequiredTextarea attrValue) {
      super(attrValue.getValue(), "required");
   }
}
