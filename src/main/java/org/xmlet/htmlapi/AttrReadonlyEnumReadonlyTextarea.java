package org.xmlet.htmlapi;

public class AttrReadonlyEnumReadonlyTextarea extends BaseAttribute<String> {
   public AttrReadonlyEnumReadonlyTextarea(EnumReadonlyTextarea attrValue) {
      super(attrValue.getValue(), "readonly");
   }
}
