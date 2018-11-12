package org.xmlet.htmlapi;

public class AttrDisabledEnumDisabledCommand extends BaseAttribute<String> {
   public AttrDisabledEnumDisabledCommand(EnumDisabledCommand attrValue) {
      super(attrValue.getValue(), "disabled");
   }
}
